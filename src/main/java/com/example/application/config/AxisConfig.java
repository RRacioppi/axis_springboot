package com.example.application.config;

import org.apache.axis.transport.http.AdminServlet;
import org.apache.axis.transport.http.AxisServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AxisConfig {
    public AxisConfig() {
    }

    @Bean
    public ServletRegistrationBean axisServletRegistrationBean() {
        ServletRegistrationBean servletBean = new ServletRegistrationBean(new AxisServlet(), new String[]{"/axis/*"});
        return servletBean;
    }

    @Bean
    public ServletRegistrationBean axisAdminServletRegistrationBean() {
        ServletRegistrationBean servletBean = new ServletRegistrationBean(new AdminServlet(), new String[]{"/axis-admin"});
        return servletBean;
    }
}
