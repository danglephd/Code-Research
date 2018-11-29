/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vn.javax.basic.thread;

/**
 *
 * @author danglph
 */
public class PoolThread implements Runnable {

    private String message;

    public PoolThread(String s) {
        this.message = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()
                + " (Start) message = " + message);
        processMessage();
        System.out.println(Thread.currentThread().getName()
                + " (End)");
    }

    private void processMessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
