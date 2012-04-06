package org.rostlab.snapdb;

import java.io.IOException;
import java.net.InetSocketAddress;

import javax.ws.rs.ext.RuntimeDelegate;

import org.rostlab.snapdb.facade.ServiceFacade;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

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

		SnapDbApplication application = new SnapDbApplication(
				(ServiceFacade) context.getBean("serviceFacade"));

		HttpServer server;
		try {
			server = HttpServer.create(new InetSocketAddress(8081), 25);

			HttpContext httpcontext = server.createContext("/resources");
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
