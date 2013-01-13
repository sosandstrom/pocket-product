/*
 * INSERT COPYRIGHT HERE
 */

package com.wadpam.product.config;

import com.wadpam.open.domain.service.DomainFilter;
import com.wadpam.open.json.SkipNullObjectMapper;
import com.wadpam.open.web.RestJsonExceptionResolver;
import com.wadpam.product.web.admin.AdminController;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.velocity.VelocityConfigurer;
import org.springframework.web.servlet.view.velocity.VelocityViewResolver;

/**
 *
 * @author sosandstrom
 */
@EnableWebMvc
@Configuration
@Import(ProductServiceConfig.class)
public class ProductWebappConfig extends WebMvcConfigurerAdapter {

    // -------------- Servlet Filter Delegates ----------------------
    
    @Bean
    public DomainFilter domainFilter() {
        return new DomainFilter();
    }

    // -------------- Message Converters ----------------------

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        SkipNullObjectMapper skipNullMapper = new SkipNullObjectMapper();
        skipNullMapper.init();
        MappingJacksonHttpMessageConverter converter = new MappingJacksonHttpMessageConverter();
        converter.setObjectMapper(skipNullMapper);
        converters.add(converter);
    }
    
    
    // -------------- Serving Resources ----------------------

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("/static/")
                .addResourceLocations("classpath:/static/");
    }
    
    // -------------- Controllers, Interceptors ----------------------
    
    @Bean
    public AdminController adminController() {
        return new AdminController();
    }
    
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(brandInterceptor());
//        registry.addInterceptor(trackingCodeInterceptor()).addPathPatterns("/**/isalive");
//    }
    
//    public @Bean BrandInterceptor brandInterceptor() {
//        return new BrandInterceptor();
//    }
//
//    public @Bean TrackingCodeInterceptor trackingCodeInterceptor() {
//        return new TrackingCodeInterceptor();
//    }

    // -------------- View Stuff -----------------------
    
    public @Bean RestJsonExceptionResolver restJsonExceptionResolver() {
        final RestJsonExceptionResolver bean = new RestJsonExceptionResolver();
        bean.setOrder(100);
        return bean;
    }
    
    public @Bean VelocityConfigurer velocityConfigurer() {
        final VelocityConfigurer bean = new VelocityConfigurer();
        bean.setResourceLoaderPath("/WEB-INF/velocity/");
        return bean;
    }
    
    public @Bean VelocityViewResolver velocityViewResolver() {
        final VelocityViewResolver bean = new VelocityViewResolver();
        bean.setOrder(200);
        bean.setCache(true);
        bean.setPrefix("");
        bean.setSuffix(".vm");
        return bean;
    }
    
    public @Bean InternalResourceViewResolver htmlViewResolver() {
        final InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(InternalResourceView.class);
        bean.setOrder(999);
        bean.setPrefix("/protected/backoffice/");
        bean.setSuffix("");
        return bean;
    }
}
