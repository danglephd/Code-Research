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
public class Movie {
    private Actor actor;

    @Override
    public String toString() {
        return "Movie{" + "actor=" + actor + '}';
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
