/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vn.spring.wiring;

/**
 *
 * @author danglph
 */
public class Actor {

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + "}";
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
