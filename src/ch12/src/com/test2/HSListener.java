package com.test2;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class HSListener implements HttpSessionListener {
	private int count = 0;
    public void sessionCreated(HttpSessionEvent se)  { 
         count++;
         se.getSession().getServletContext().setAttribute("count",count);
    }

    public void sessionDestroyed(HttpSessionEvent se)  { 
         count--;
         se.getSession().getServletContext().setAttribute("count",count);
    }
    
}
