
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danglph
 */
public class TestSortFunction {
    public static void main(String[] args) {
        int length = 20000000;
        int[] twentyMillion = new int [length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            twentyMillion [i] = rand.nextInt(length);
        }
        sortByAccendPro(twentyMillion , length);
    }

    /**
     * Jasz sort algorithim.
     * 
     * @param {int[]} twentyMillion - array of twenty million random ints.
     * @param {int} highestNumber - Highest number to sort to.
     */
    public static void sortByAccendPro(int[] twentyMillion, int highestNumber ) {
        long time = System.nanoTime();
        //...
        int[] sortedArray = sortFunc(twentyMillion, highestNumber);
        //...
        System.out.println("time = " + (System.nanoTime() - time));
        
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println("time = " + sortedArray[i]);
        }
    }

    private static int[] sortFunc(int[] twentyMillion, int highestNumber) {

        int[] rangePosition = new int[twentyMillion.length];
        int[] newArray = new int[twentyMillion.length];
        int[] range = new int[highestNumber];
        for (int i = 0; i < twentyMillion.length; i++) {
            rangePosition[i] = twentyMillion[i];
            range[twentyMillion[i]]++;
        }
        for (int i = range.length - 1, past = twentyMillion.length; i >= 0; i--) {
            range[i] = past - range[i];
            past = range[i];
        }
        for (int i = 0; i < twentyMillion.length; i++) {
            newArray[range[rangePosition[i]]] = twentyMillion[i];
            range[rangePosition[i]]++;
        }
        return newArray;
    }
}
