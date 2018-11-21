/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vn.tdd;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danglph
 */
public class StringCheckJUnitTest {
    
    public StringCheckJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of checkValidString method, of class StringCheck.
     */
    @Test
    public void testCheckValidString() {
        System.out.println("checkValidString");
//        String str = "{abc[bb]}";
        StringCheck instance = new StringCheck();
        boolean result = instance.checkValidString(null);
        assertEquals(false, result);
        result = instance.checkValidString("");
        assertEquals(false, result);
        result = instance.checkValidString("abc");
        assertEquals(true, result);
        result = instance.checkValidString("{abc[bb]}");
        assertEquals(true, result);
        result = instance.checkValidString("(abc[bb])");
        assertEquals(true, result);
        result = instance.checkValidString("abc(bb)}");
        assertEquals(false, result);
        result = instance.checkValidString("abc(bb])");
        assertEquals(false, result);
        result = instance.checkValidString("abc[bb])");
        assertEquals(false, result);
        result = instance.checkValidString("abc]bb[");
        assertEquals(false, result);
        result = instance.checkValidString("abc)bb(");
        assertEquals(false, result);
        result = instance.checkValidString("abc}bb{");
        assertEquals(false, result);
        result = instance.checkValidString("[bb[]");
        assertEquals(false, result);
        result = instance.checkValidString("(bb()");
        assertEquals(false, result);
        result = instance.checkValidString("{bb{}");
        assertEquals(false, result);
        result = instance.checkValidString("abc[bb]");
        assertEquals(true, result);
        result = instance.checkValidString("(ab{c)bb}");
        assertEquals(false, result);
        result = instance.checkValidString("[ab{c]bb}");
        assertEquals(false, result);
        result = instance.checkValidString("(ab[c)bb]");
        assertEquals(false, result);
        result = instance.checkValidString("{ab(c}bb)");
        assertEquals(false, result);
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
