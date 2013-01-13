/*
 * INSERT COPYRIGHT HERE
 */

package com.wadpam.product.service;

import com.wadpam.open.mvc.MardaoCrudService;
import com.wadpam.product.dao.DpProductDao;
import com.wadpam.product.domain.DpProduct;
import java.io.Serializable;
import net.sf.mardao.core.CursorPage;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author sosandstrom
 */
public class ProductService extends MardaoCrudService<DpProduct, Long, DpProductDao> {
    
    public CursorPage<DpProduct, Long> getPageByCategoryId(long categoryId, int pageSize, Serializable cursorKey) {
        return dao.queryPageByCategoryId(categoryId, pageSize, cursorKey);
    }

    @Autowired
    public void setDpProductDao(DpProductDao dpProductDao) {
        this.dao = dpProductDao;
    }
}
