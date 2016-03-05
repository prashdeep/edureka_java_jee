package com.edureka.java_jee_module7;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MySessionListener implements HttpSessionListener {

	private static int sessionCount;

	public int getActiveSession() {
		return sessionCount;
	}

	public void sessionCreated(HttpSessionEvent e) {
		sessionCount++;
	}

	public void sessionDestroyed(HttpSessionEvent e) {
		sessionCount--;
	}
}
