package org.rostlab.gemudb;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.concurrent.Executors;

import javax.ws.rs.ext.RuntimeDelegate;

import org.rostlab.gemudb.facade.ServiceFacade;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class Startup {
	/**
	 * Startup from Application (creates ApplicationContext)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		final URI u = URI.create("http://localhost:9004/");

		final ApplicationContext context = new FileSystemXmlApplicationContext("config/Application-Context.xml");
		final GeMuDbApplication application = new GeMuDbApplication((ServiceFacade) context.getBean("serviceFacade"));

		try {	 
			final HttpServer server = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), u.getPort()), 0);
	        server.setExecutor(Executors.newCachedThreadPool());   
			server.createContext("/resources", RuntimeDelegate.getInstance().createEndpoint(application, HttpHandler.class));			
			server.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
