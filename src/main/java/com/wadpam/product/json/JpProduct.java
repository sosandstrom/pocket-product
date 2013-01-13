/*
 * INSERT COPYRIGHT HERE
 */

package com.wadpam.product.json;

import com.wadpam.open.json.JBaseObject;
import java.util.Collection;

/**
 *
 * @author sosandstrom
 */
public class JpProduct extends JBaseObject {
    
    /** If this product is an accessory to other products */
    private Collection<Long> accessoryOfProducts;

    /** The category id of this product */
    private Long categoryId;

    /** Currency code, if price is absolute. */
    private String currencyCode;

    /** The product description */
    private String description;

    /** The external (customer) ID of this product */
    private String extID;

    /** The product image url */
    private String imageUrl;

    /** The manufacturer id of this product */
    private Long manufacturerId;
    
    /** The model name of this product, e.g. RX-100 */
    private String modelName;
    
    /** The product name */
    private String name;

    /** If price is a DpPrice group */
    private Long priceId;
    
    /** If price is absolute. Note that EUR 1.99 is represented by 199 */
    private Long price;

    public Collection<Long> getAccessoryOfProducts() {
        return accessoryOfProducts;
    }

    public void setAccessoryOfProducts(Collection<Long> accessoryOfProducts) {
        this.accessoryOfProducts = accessoryOfProducts;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExtID() {
        return extID;
    }

    public void setExtID(String extID) {
        this.extID = extID;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Long manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPriceId() {
        return priceId;
    }

    public void setPriceId(Long priceId) {
        this.priceId = priceId;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
    
    
}
