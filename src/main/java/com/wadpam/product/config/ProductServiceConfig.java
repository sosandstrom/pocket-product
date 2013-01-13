/*
 * INSERT COPYRIGHT HERE
 */

package com.wadpam.product.config;

import com.wadpam.product.service.CategoryService;
import com.wadpam.product.web.CategoryController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *
 * @author sosandstrom
 */
@Configuration
@Import(ProductDaoConfig.class)
public class ProductServiceConfig {

    // -------------- Services -----------------------
    
    @Bean
    public CategoryService categoryService() {
        return new CategoryService();
    }
    

    // -------------- Controllers ----------------------
    
    public @Bean CategoryController categoryController() {
        final CategoryController bean = new CategoryController();
        return bean;
    }
    
}
