/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vn.spring.anotation;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.vn.spring.basic.HelloWorld;

/**
 *
 * @author danglph
 */
public class ViewClass {
    
    public static void main(String args[]) {
        try {
            AbstractApplicationContext context = new AnnotationConfigApplicationContext(MountToSayHelloCfg.class);
            MountSayHello obj = (MountSayHello) context.getBean("helloWBean");
            obj.sayHello("Mr Dang");
        } catch (BeansException e) {
            throw e;
        }

    }
}
