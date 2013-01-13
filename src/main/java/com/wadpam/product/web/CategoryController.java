/*
 * INSERT COPYRIGHT HERE
 */

package com.wadpam.product.web;

import com.wadpam.open.mvc.CrudController;
import com.wadpam.product.domain.DpCategory;
import com.wadpam.product.json.JpCategory;
import com.wadpam.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author sosandstrom
 */
@Controller
@RequestMapping("{domain}/category")
public class CategoryController extends CrudController<JpCategory, DpCategory, Long, CategoryService> {

    @Override
    public JpCategory convertDomain(DpCategory from) {
        if (null == from) {
            return null;
        }
        
        final JpCategory to = new JpCategory();
        convertLongEntity(from, to);
        
        to.setDescription(from.getDescription());
        to.setName(from.getName());
        to.setParentId(from.getParentId());
        to.setType(from.getType());
        
        return to;
    }

    @Override
    public DpCategory convertJson(JpCategory from) {
        if (null == from) {
            return null;
        }
        
        final DpCategory to = new DpCategory();
        convertJLong(from, to);
        
        to.setDescription(from.getDescription());
        to.setName(from.getName());
        to.setParentId(from.getParentId());
        to.setType(from.getType());
        
        return to;
    }

    @Autowired
    public void setCategoryService(CategoryService categoryService) {
        this.service = categoryService;
    }
}
