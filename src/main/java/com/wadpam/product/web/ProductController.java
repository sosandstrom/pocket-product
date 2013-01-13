/*
 * INSERT COPYRIGHT HERE
 */

package com.wadpam.product.web;

import com.wadpam.open.json.JCursorPage;
import com.wadpam.open.mvc.CrudController;
import com.wadpam.product.domain.DpProduct;
import com.wadpam.product.json.JpProduct;
import com.wadpam.product.service.ProductService;
import java.io.Serializable;
import net.sf.mardao.core.CursorPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author sosandstrom
 */
@Controller
@RequestMapping("{domain}/product")
public class ProductController extends CrudController<JpProduct, DpProduct, Long, ProductService> {

    @RequestMapping(value="v10", method= RequestMethod.GET, params="categoryId")
    @ResponseBody
    public JCursorPage<JpProduct> getPageByCategoryId(
            @RequestParam long categoryId, 
            @RequestParam(defaultValue="10") int pageSize, 
            @RequestParam(required=false) Serializable cursorKey) {
        CursorPage<DpProduct, Long> page = service.getPageByCategoryId(categoryId, pageSize, cursorKey);
        return convertPage(page);
    }

// ------------------- Converters and setters -----------------------    
    
    @Override
    public JpProduct convertDomain(DpProduct from) {
        if (null == from) {
            return null;
        }
        
        final JpProduct to = new JpProduct();
        convertLongEntity(from, to);

        to.setAccessoryOfProducts(from.getAccessoryOfProducts());
        to.setCategoryId(from.getCategoryId());
        to.setCurrencyCode(from.getCurrencyCode());
        to.setDescription(from.getDescription());
        to.setExtID(from.getExtID());
        to.setImageUrl(from.getImageUrl());
        to.setManufacturerId(from.getManufacturerId());
        to.setModelName(from.getModelName());
        to.setName(from.getName());
        to.setPrice(from.getPrice());
        to.setPriceId(from.getPriceId());
        
        return to;
    }

    @Override
    public DpProduct convertJson(JpProduct from) {
        if (null == from) {
            return null;
        }
        
        final DpProduct to = new DpProduct();
        convertJLong(from, to);
        
        to.setAccessoryOfProducts(from.getAccessoryOfProducts());
        to.setCategoryId(from.getCategoryId());
        to.setCurrencyCode(from.getCurrencyCode());
        to.setDescription(from.getDescription());
        to.setExtID(from.getExtID());
        to.setImageUrl(from.getImageUrl());
        to.setManufacturerId(from.getManufacturerId());
        to.setModelName(from.getModelName());
        to.setName(from.getName());
        to.setPrice(from.getPrice());
        to.setPriceId(from.getPriceId());
        
        return to;
    }

    @Autowired
    public void setProductService(ProductService productService) {
        this.service = productService;
    }
}
