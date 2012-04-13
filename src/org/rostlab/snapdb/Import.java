package org.rostlab.snapdb;

import java.io.File;

import org.rostlab.snapdb.service.MutationImportService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Import {
	/**
	 * Startup from Application (creates ApplicationContext)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("No Input directory");
			return;
		} else {
			ApplicationContext context = new FileSystemXmlApplicationContext(
					"config/Application-Context.xml");
			MutationImportService importService = (MutationImportService) context
					.getBean("mutationImportService");
			importService.importMutation(new File(args[0]));
		}

	}
}
