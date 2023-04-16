package com.samgau.bustest.ws;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;

@Configuration
@EnableWs
public class WSConfig extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
//        servlet.setTransformWsdlLocations(true);
//        servlet.setTransformSchemaLocations(true);

        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    @Bean(name = "astana")
    public Wsdl11Definition astanaWsdl11Definition() {
        SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
        wsdl11Definition.setWsdl(new ClassPathResource("/wsdl/ASTANA_WSDL.wsdl"));
        return wsdl11Definition;
    }

    @Bean(name = "china")
    public Wsdl11Definition chinaWsdl11Definition() {
        SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
        wsdl11Definition.setWsdl(new ClassPathResource("/wsdl/CHINA_WSDL_NEW.wsdl"));
        return wsdl11Definition;
    }
}
