/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vn.spring.basic;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
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
            ApplicationContext context = new ClassPathXmlApplicationContext(
                    "Beans.xml");
            HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
            obj.getMessage();
        } catch (BeansException e) {
            throw e;
        }

    }
}
