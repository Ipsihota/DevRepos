package com.payment.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
@Configuration
public class PaymentServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        Class[] configClass = {PaymentBeanConfig.class};
        return configClass;
    }

    protected String[] getServletMappings() {
        String[] paymentUrl = {"/com.paymentPage/*"};
        return paymentUrl;
    }
}
