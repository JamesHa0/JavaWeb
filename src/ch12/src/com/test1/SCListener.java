package com.test1;

import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;

@WebListener
public class SCListener implements javax.servlet.ServletContextListener, ServletContextAttributeListener {
	private ServletContext context = null;
	public SCListener() {}
    public void attributeAdded(ServletContextAttributeEvent scae)  { 
    	context = scae.getServletContext();
    	context.log("�������" + scae.getName() + ":" +scae.getValue());
    }

    public void attributeRemoved(ServletContextAttributeEvent scae)  { 
    	context = scae.getServletContext();
    	context.log("ɾ������" + scae.getName() + ":" +scae.getValue());
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
    	context = sce.getServletContext();
    	context.log("���٣�" + new Date());
    }

    public void attributeReplaced(ServletContextAttributeEvent scae)  { 
    	context = scae.getServletContext();
    	context.log("�滻����" + scae.getName() + ":" +scae.getValue());
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	context = sce.getServletContext();
    	context.log("��ʼ����" + new Date());
    }
	
}
