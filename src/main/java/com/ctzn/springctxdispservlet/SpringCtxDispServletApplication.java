package com.ctzn.springctxdispservlet;

import com.ctzn.springctxdispservlet.v1.config.ApiV1Config;
import com.ctzn.springctxdispservlet.v2.config.ApiV2Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication(scanBasePackages = "com.ctzn.springctxdispservlet.shared")
public class SpringCtxDispServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCtxDispServletApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean apiV1() {
        return newDispatcherServlet(1, "API_V1", ApiV1Config.class, "/api/v1/*");
    }

    @Bean
    public ServletRegistrationBean apiV2() {
        return newDispatcherServlet(2, "API_V2", ApiV2Config.class, "/api/v2/*");
    }

    private static ServletRegistrationBean newDispatcherServlet(int loadOnStartup, String name, Class<?> config, String... urlMapping) {
        AnnotationConfigWebApplicationContext applicationContext =
                new AnnotationConfigWebApplicationContext();
        applicationContext.register(config);
        ServletRegistrationBean servletRegistrationBean =
                new ServletRegistrationBean(new DispatcherServlet(applicationContext), urlMapping);
        servletRegistrationBean.setName(name);
        servletRegistrationBean.setLoadOnStartup(loadOnStartup);
        return servletRegistrationBean;
    }

}
