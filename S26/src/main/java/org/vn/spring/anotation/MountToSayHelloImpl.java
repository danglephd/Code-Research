/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vn.spring.anotation;

/**
 *
 * @author danglph
 */
public class MountToSayHelloImpl implements MountSayHello{

    @Override
    public void sayHello(String name) {
        
        System.out.println("Hello + " + name);

    }
    
}
