/*
 * INSERT COPYRIGHT HERE
 */

package com.wadpam.product.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import net.sf.mardao.core.domain.AbstractLongEntity;

/**
 *
 * @author sosandstrom
 */
@Entity
public class DpCategory extends AbstractLongEntity{

    /** Description of category */
    @Basic
    private String description;

    /** Name of category */
    @Basic
    private String name;
    
    /** Type of category, ex: DpProduct - category for products, DpManufacturer - category for manufacturer */
    @Basic
    private String type;

    /** For sub-categories, this is the parent category id */
    @Basic
    private Long parentId;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
    
    
}
