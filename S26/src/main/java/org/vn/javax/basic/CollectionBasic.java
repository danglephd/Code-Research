/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vn.javax.basic;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 *
 * @author danglph
 */
public class CollectionBasic {

    
    public static void legacyClass(){
        
        // Initializing a Dictionary 
        Dictionary geek = new Hashtable(); 
  
        // put() method 
        geek.put("123", "Code"); 
        geek.put("456", "Program"); 
        // elements() method : 
        for (Enumeration i = geek.elements(); i.hasMoreElements();) 
        { 
            System.out.println("Value in Dictionary : " + i.nextElement()); 
        } 
    }
    
    public static void propertiesClass(){
        Properties gfg = new Properties(); 
        Set URL; 
        String str; 
        
        gfg.put("ide", "ide.geeksforgeeks.org"); 
        gfg.put("contribute", "contribute.geeksforgeeks.org"); 
        gfg.put("quiz", "quiz.geeksforgeeks.org"); 
          
        // checking what's in table 
        URL = gfg.keySet(); 
        Iterator itr = URL.iterator(); 
          
        while(itr.hasNext()) 
        { 
            str = (String)itr.next(); 
            System.out.println("The URL for " + str +  
                    " is " + gfg.getProperty(str)); 
        } 
          
        System.out.println(); 
          
        // looking for URL that not in list 
        str = gfg.getProperty("articl", "not found"); 
        System.out.println("The URL for article is " + str); 
        str = gfg.getProperty("ide", "not found"); 
        System.out.println("The URL for article is " + str); 
    }
        
    
}
