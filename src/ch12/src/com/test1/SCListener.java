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
    	context.log("添加属性" + scae.getName() + ":" +scae.getValue());
    }

    public void attributeRemoved(ServletContextAttributeEvent scae)  { 
    	context = scae.getServletContext();
    	context.log("删除属性" + scae.getName() + ":" +scae.getValue());
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
    	context = sce.getServletContext();
    	context.log("销毁：" + new Date());
    }

    public void attributeReplaced(ServletContextAttributeEvent scae)  { 
    	context = scae.getServletContext();
    	context.log("替换属性" + scae.getName() + ":" +scae.getValue());
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	context = sce.getServletContext();
    	context.log("初始化：" + new Date());
    }
	
}
