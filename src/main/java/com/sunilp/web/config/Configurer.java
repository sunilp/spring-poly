package com.sunilp.web.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilprakash on 10/6/15.
 */
@Configuration
@EnableWebMvc
@ImportResource("classpath:appContext-dirty.xml")
@ComponentScan(basePackages = "com.sunilp.web")
public class Configurer extends WebMvcConfigurerAdapter {




  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/").setViewName("index");
  }

  @Bean
  public ContentNegotiatingViewResolver viewResolver() {
    ContentNegotiatingViewResolver contentNegotiatingViewResolver = new ContentNegotiatingViewResolver();
    contentNegotiatingViewResolver.setUseNotAcceptableStatusCode(true);
    List<View> views = new ArrayList<View>();
    JstlView jstlView = new JstlView("");
    views.add(jstlView);
    contentNegotiatingViewResolver.setDefaultViews(views);
    List<ViewResolver> viewResolvers = new ArrayList<ViewResolver>();
    viewResolvers.add(new BeanNameViewResolver());
    InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
    internalResourceViewResolver.setPrefix("/WEB-INF/");
    internalResourceViewResolver.setSuffix(".jsp");
    viewResolvers.add(internalResourceViewResolver);
    contentNegotiatingViewResolver.setViewResolvers(viewResolvers);


    return contentNegotiatingViewResolver;
  }



  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {

    registry.addResourceHandler("/scripts/").addResourceLocations("/scripts/**");
    registry.addResourceHandler("/styles/").addResourceLocations("/styles/**");
    registry.addResourceHandler("/elements/").addResourceLocations("/elements/**");

  }

}
