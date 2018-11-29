/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vn.programming.algorithm;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danglph
 */
public class SearchTest {
    
    public SearchTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of linearSearch method, of class Search.
     */
    @Test
    public void testLinearSearch() {
        System.out.println("linearSearch");
        int[] arr = null;
        int length = 0;
        int xValue = 0;
        Search instance = new Search();
        int expResult = -1;
        int result = instance.linearSearch(arr, length, xValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of binarySearch method, of class Search.
     */
    @Test
    public void testBinarySearch_4args() {
        System.out.println("binarySearch");
        int[] arr = null;
        int leftIndex = 0;
        int rightIndex = 0;
        int xValue = 0;
        Search instance = new Search();
        int expResult = 0;
        int result = instance.binarySearch(arr, leftIndex, rightIndex, xValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of binarySearch method, of class Search.
     */
    @Test
    public void testBinarySearch_3args() {
        System.out.println("binarySearch");
        int[] arr = null;
        int length = 0;
        int xValue = 0;
        Search instance = new Search();
        int expResult = 0;
        int result = instance.binarySearch(arr, length, xValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
