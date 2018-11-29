/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vn.javax.basic.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danglph
 */
public class sleepThread extends Thread {

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
        try {
            sleepThread t1 = new sleepThread();
            sleepThread t2 = new sleepThread();
            t1.start();
            t2.start();
        } catch (Exception ex) {
            Logger.getLogger(sleepThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
