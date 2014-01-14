package org.rostlab.gemudb;

import java.io.IOException;
import java.net.URI;

import javax.ws.rs.ext.RuntimeDelegate;

import org.rostlab.gemudb.facade.ServiceFacade;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

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
			server = HttpServerFactory.create(URI.create("http://localhost:9004/"), rc);
			HttpContext httpcontext = server.createContext("/resources");
			SnapDbApplication application = new SnapDbApplication(
					(ServiceFacade) context.getBean("serviceFacade"));
			HttpHandler handler = RuntimeDelegate.getInstance().createEndpoint(
					application, HttpHandler.class);
			httpcontext.setHandler(handler);
			server.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
