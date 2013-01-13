/*
 * INSERT COPYRIGHT HERE
 */

package com.wadpam.product.domain;

import javax.persistence.Basic;
import net.sf.mardao.core.domain.AbstractLongEntity;

/**
 *
 * @author sosandstrom
 */
public class DpManufacturer extends AbstractLongEntity {
    @Basic
    private String name;
    
    @Basic
    private Long categoryId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
    
    
}
