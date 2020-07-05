package com.payment.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.payment.controller")
public class PaymentBeanConfig extends WebMvcConfigurerAdapter {

    @Bean
    public InternalResourceViewResolver showPaymentPage(){
        InternalResourceViewResolver paymentView =  new InternalResourceViewResolver();
        paymentView.setPrefix("/webapp/WEB-INF/view");
        paymentView.setSuffix(".jsp");

        return paymentView;
    }
}
