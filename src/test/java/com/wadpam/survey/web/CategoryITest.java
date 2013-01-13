package com.wadpam.survey.web;

import com.wadpam.product.domain.DpProduct;
import com.wadpam.product.json.JpCategory;
import java.net.URI;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;

/**
 *
 * @author os
 */
public class CategoryITest {

    static final String                  BASE_URL       = "http://localhost:8386/api/apidocs/";

    RestTemplate                         template;
    public CategoryITest() {
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
    public void testCreate() {
        JpCategory request = new JpCategory();
        request.setDescription("itest description");
        request.setName("Hardware");
        request.setType(DpProduct.class.getSimpleName());
        
        URI uri = template.postForLocation(BASE_URL + "category/v10", request);
        
        JpCategory actual = template.getForObject(uri, JpCategory.class);
        assertNotNull(actual.getId());
        assertEquals(request.getName(), actual.getName());
    }

}
