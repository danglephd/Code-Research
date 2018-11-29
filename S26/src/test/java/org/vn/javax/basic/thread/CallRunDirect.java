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
public class CallRunDirect extends Thread {

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(this.getName() + " - " + i);
        }
    }

    public static void main(String args[]) {
        CallRunDirect t1 = new CallRunDirect();
        CallRunDirect t2 = new CallRunDirect();

        t1.run();
        t2.run();
    }
}
