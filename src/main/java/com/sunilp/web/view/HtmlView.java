package com.sunilp.web.view;

import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.servlet.view.AbstractView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by sunilprakash on 10/6/15.
 */
public class HtmlView extends AbstractView {

  @Override
  protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {

    ServletWebRequest servletWebRequest = new ServletWebRequest(request);

  }
}
