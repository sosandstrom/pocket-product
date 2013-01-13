package com.wadpam.survey.web;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author os
 */
public class CategoryITest {

    static final String                  BASE_URL       = "http://localhost:8943/api/apidocs/";

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
        template.delete("http://localhost:8943/api/_admin/apidocs/deleteAllSurveyEntities");
    }

    @Test
    public void testCreate() {
    }

}
