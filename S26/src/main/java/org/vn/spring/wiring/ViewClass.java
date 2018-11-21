/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vn.spring.wiring;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author danglph
 */
public class ViewClass {

    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        try {
            AbstractApplicationContext context;

            //autowire="no"
            context = new ClassPathXmlApplicationContext("Beans.xml");
            Movie movie1 = (Movie) context.getBean("movie1");
            System.out.println(movie1);
            Movie movie2 = (Movie) context.getBean("movie2");
            System.out.println(movie2);
            
        } catch (BeansException e) {
            throw e;
        }

    }
}
