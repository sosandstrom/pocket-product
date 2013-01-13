/*
 * INSERT COPYRIGHT HERE
 */

package com.wadpam.product.config;

import com.wadpam.product.service.CategoryService;
import com.wadpam.product.service.ProductService;
import com.wadpam.product.web.CategoryController;
import com.wadpam.product.web.ProductController;
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
    
    @Bean
    public ProductService productService() {
        return new ProductService();
    }

    // -------------- Controllers ----------------------
    
    @Bean 
    public CategoryController categoryController() {
        final CategoryController bean = new CategoryController();
        return bean;
    }
    
    @Bean
    public ProductController productController() {
        return new ProductController();
    }
}
