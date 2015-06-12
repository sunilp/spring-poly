package com.sunilp.web.config;

import com.sunilp.web.config.Configurer;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by sunilprakash on 10/6/15.
 */
public class WebAppInitializer  implements WebApplicationInitializer {

  private static final String DISPATCHER_SERVLET_NAME = "dispatcher";
  private static final String DISPATCHER_SERVLET_MAPPING = "/";


  public void onStartup(ServletContext servletContext) throws ServletException {
    AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
    rootContext.register(Configurer.class);

    ServletRegistration.Dynamic dispatcher = servletContext.addServlet(DISPATCHER_SERVLET_NAME, new DispatcherServlet(rootContext));
    dispatcher.setLoadOnStartup(1);
    dispatcher.addMapping(DISPATCHER_SERVLET_MAPPING);

    servletContext.addListener(new ContextLoaderListener(rootContext));
  }
}
