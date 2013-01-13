/*
 * INSERT COPYRIGHT HERE
 */

package com.wadpam.product.json;

import com.wadpam.open.json.JBaseObject;

/**
 *
 * @author sosandstrom
 */
public class JpCategory extends JBaseObject {

    /** Description of category */
    private String description;

    /** Name of category */
    private String name;
    
    /** Type of category, ex: DpProduct - category for products, DpManufacturer - category for manufacturer */
    private String type;

    /** For sub-categories, this is the parent category id */
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
