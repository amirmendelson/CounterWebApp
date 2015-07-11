package com.masterlean.net;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;
 

public class URLReaderTest {
 
    private Collection collection;
 
    @BeforeClass
    public static void oneTimeSetUp() {
    	System.out.println("@BeforeClass - oneTimeSetUp");
    }
 
    @AfterClass
    public static void oneTimeTearDown() {
    	System.out.println("@AfterClass - oneTimeTearDown");
    }
 
    @Before
    public void setUp() {
        collection = new ArrayList();
        System.out.println("@Before - setUp");
    }
 
    @After
    public void tearDown() {
        collection.clear();
        System.out.println("@After - tearDown");
    }
 
    @Test
    public void testGetDateTime() {
    	URLReader reader = new URLReader();
        String time = reader.getDateTime();
        assertNotNull(time);
    }
}