/*
 * INSERT COPYRIGHT HERE
 */

package com.wadpam.product.config;

import com.wadpam.product.dao.DpCategoryDao;
import com.wadpam.product.dao.DpCategoryDaoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author sosandstrom
 */
@Configuration
public class ProductDaoConfig {

    @Bean
    public DpCategoryDao dpCategoryDao() {
        DpCategoryDao bean = new DpCategoryDaoBean();
        
        return bean;
    }
    
}
