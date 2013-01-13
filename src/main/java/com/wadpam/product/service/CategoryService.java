/*
 * INSERT COPYRIGHT HERE
 */

package com.wadpam.product.service;

import com.wadpam.open.mvc.MardaoCrudService;
import com.wadpam.product.dao.DpCategoryDao;
import com.wadpam.product.domain.DpCategory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author sosandstrom
 */
public class CategoryService extends MardaoCrudService<DpCategory, Long, DpCategoryDao> {

    @Autowired
    public void setDpCategoryDao(DpCategoryDao dpCategoryDao) {
        this.dao = dpCategoryDao;
    }
}
