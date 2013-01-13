package com.wadpam.survey.web;

import com.wadpam.open.json.JCursorPage;
import com.wadpam.product.json.JpProduct;
import java.net.URI;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author os
 */
public class ProductITest {

    static final String                  BASE_URL       = "http://localhost:8386/api/apidocs/";

    RestTemplate                         template;
    public ProductITest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        template = new RestTemplate();
    }

    @After
    public void tearDown() {
        template.delete(BASE_URL + "_admin/deleteAllProductEntities");
    }

    @Test
    public void testQueryByCategoryId() {
        JpProduct request = new JpProduct();
        request.setDescription("itest description");
        request.setName("Hardware");
        request.setCategoryId(42L);
        
        URI uri = template.postForLocation(BASE_URL + "product/v10", request);
        
        ResponseEntity<JCursorPage<JpProduct>> response = template.exchange(
                BASE_URL + "product/v10?categoryId=42", 
                HttpMethod.GET,
                new HttpEntity(null),
                new ParameterizedTypeReference<JCursorPage<JpProduct>>() {});
        JCursorPage<JpProduct> actual = response.getBody();
        assertNull(actual.getCursorKey());
        assertNotNull(actual.getItems());
        assertEquals(actual.getItems().size(), 1);
        
        response = template.exchange(
                BASE_URL + "product/v10?categoryId=41", 
                HttpMethod.GET,
                new HttpEntity(null),
                new ParameterizedTypeReference<JCursorPage<JpProduct>>() {});
        actual = response.getBody();
        assertNull(actual.getCursorKey());
        assertNotNull(actual.getItems());
        assertEquals(actual.getItems().size(), 0);
    }

}
