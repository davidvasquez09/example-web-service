package lab.david.webservice;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig {

  @Bean
  public ServletWebServerFactory servletWebServerFactory() {
    return new TomcatServletWebServerFactory();
  }

  @Bean
  public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext context) {
    MessageDispatcherServlet dispatcherServlet = new MessageDispatcherServlet();
    dispatcherServlet.setApplicationContext(context);
    dispatcherServlet.setTransformWsdlLocations(true);
    return new ServletRegistrationBean<>(dispatcherServlet, "/ws/*");
  }

  @Bean
  public XsdSchema xmlSchema() {
    return new SimpleXsdSchema(new ClassPathResource("XMLSchema.xsd"));
  }

  @Bean(name = "myws")
  public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema studentsSchema) {
    DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
    definition.setPortTypeName("HolidayRequest");
    definition.setTargetNamespace("http://lab.david.com");
    definition.setLocationUri("/myws");
    definition.setSchema(studentsSchema);
    return definition;
  }

}
