package org.rostlab.gemudb;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.concurrent.Executors;

import org.rostlab.gemudb.facade.ServiceFacade;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sun.jersey.api.container.ContainerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpsServer;

public class Startup {
	/**
	 * Startup from Application (creates ApplicationContext)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"config/Application-Context.xml");

		final ResourceConfig rc = new PackagesResourceConfig(
				"org.rostlab.gemudb.facade");
		rc.getProperties().put(JSONConfiguration.FEATURE_POJO_MAPPING, true);

		HttpServer server;
		try {
			final HttpHandler handler = ContainerFactory.createContainer(HttpHandler.class, rc);
			final URI u = URI.create("http://localhost:9004/");
			
	        final String scheme = u.getScheme();
	        final int port = (u.getPort() == -1) ? 80 : u.getPort();    
	        server = (scheme.equalsIgnoreCase("http")) ? 
	            HttpServer.create(new InetSocketAddress(InetAddress.getLocalHost(), port), 0) :
	            HttpsServer.create(new InetSocketAddress(InetAddress.getLocalHost(), port), 0);

	        server.setExecutor(Executors.newCachedThreadPool());
	        server.createContext(u.getPath(), handler);        
			
			HttpContext httpcontext = server.createContext("/resources");
			SnapDbApplication application = new SnapDbApplication(
					(ServiceFacade) context.getBean("serviceFacade"));
			httpcontext.setHandler(handler);
			server.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
