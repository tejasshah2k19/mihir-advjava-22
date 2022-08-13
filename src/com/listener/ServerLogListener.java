package com.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServerLogListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("server shutdown----------------");

		// close
		// mail - server shutdown
	}

	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("server started------------------------------");
		// aws google nse bse

	}

}
