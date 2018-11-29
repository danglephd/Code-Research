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
public class PriorityThread extends Thread {

    @Override
    public void run() {
        
        System.out.println("running thread name is:"
                + Thread.currentThread().getName() + " - " + Thread.currentThread().getPriority());
        System.out.println("running thread priority is:"
                + Thread.currentThread().getPriority() + " - " + Thread.currentThread().getPriority());

    }

    public static void main(String args[]) {
        PriorityThread m1 = new PriorityThread();
        PriorityThread m2 = new PriorityThread();
        PriorityThread m3 = new PriorityThread();
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m3.start();
        m2.start();
        
    }

}
