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
public class JoinThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(this.getName() + " - " + i);
//            System.out.println(Thread.currentThread().getName() + " - ");
        }
    }

    public static void main(String args[]) {
        JoinThread t1 = new JoinThread();
        JoinThread t2 = new JoinThread();
        JoinThread t3 = new JoinThread();
        t1.start();

        try {
//            t1.join();
            t1.join(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
        t3.start();
    }

}
