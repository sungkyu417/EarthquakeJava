package com.intelligentEarthquake.listener;

import com.intelligentEarthquake.config.ContextConfig;
import org.springframework.core.annotation.Order;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import java.io.File;

/**
 * Created by FLY on 2016/2/18 0018.
 */

@WebListener
public class Configurator implements ServletContextListener {
    public void contextInitialized(ServletContextEvent contextEvent) {
        ServletContext container = contextEvent.getServletContext();
        container.getServletRegistration("default").addMapping("/resources/*", "*.html");

        //Use ContextLoaderListener to create a root context, it is father of contexts used in dispatcherServlet
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(ContextConfig.class);
        //avoid override
        rootContext.setAllowBeanDefinitionOverriding(false);
        container.addListener(new ContextLoaderListener(rootContext));

        DispatcherServlet dispatcherServlet = new DispatcherServlet(rootContext);
        dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
        ServletRegistration.Dynamic dispatcherCG = container.addServlet("earthquakeServlet",
                dispatcherServlet);
        dispatcherCG.setLoadOnStartup(1);
        dispatcherCG.addMapping("/*");

        //active profile
//        rootContext.getEnvironment().setActiveProfiles("production");
    }

    public void contextDestroyed(ServletContextEvent sce) {
    }
}
