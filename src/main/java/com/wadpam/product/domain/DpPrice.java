/*
 * INSERT COPYRIGHT HERE
 */

package com.wadpam.product.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import net.sf.mardao.core.domain.AbstractLongEntity;

/**
 * Represents a price group
 * @author sosandstrom
 */
@Entity
public class DpPrice extends AbstractLongEntity{
    
    /** Name of this price group */
    @Basic
    private String name;
    
    /** The price x 100, for example 199 for a price of EUR 1.99 */
    @Basic
    private Long price;
    
    /** The currency code, for example EUR or USD */
    @Basic
    private String currencyCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    
    
}
