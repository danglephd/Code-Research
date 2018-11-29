/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vn.tdd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author danglph
 */
public class GiaiThuatToiUu {

    public static void main(String args[]) {

//        binaryGap(9);
//        countSetBits(9);
//        solution(9);
        System.out.println(">>>" + solution(529));
    }

    static int binaryGap(final int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive; was " + n);
        }
        final int start = Integer.lowestOneBit(n) + 1, end = Integer.highestOneBit(n);
        System.out.println("Start = " + start + " End = " + end);
        int curRun = 0, longestRun = 0;
        for (int position = start; position < end; ++position) {
            final int bit = (n >>> position) & 1;
            System.out.println(">position = " + position + " bit = " + bit + " cur = " + curRun);
//            if (bit == 0)
//                ++curRun;
//            else {
//                longestRun = Math.max(longestRun, curRun);
//                curRun = 0;
//            }
        }
        return Math.max(longestRun, curRun);
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            int i = (int) (Math.log10(n) / Math.log10(2));
            count += Math.pow(2, i - 1) * i;
            count += n - Math.pow(2, i) + 1;
            n -= Math.pow(2, i);
        }
        return count;
    }

    public static int solution(int N) {
        return Optional.ofNullable(N)
                .map(Integer::toBinaryString)
                .filter(n -> n.length() > 1)
                .map(t -> {
                    List<Integer> counts = new ArrayList<>();
                    int count = 0;
                    for (int i = 0; i < t.length(); i++) {
                        System.out.println(">position = " + i + " bit = " + t.charAt(i) + " cur = " + count);

                        if (t.charAt(i) == '0') {
                            count += 1;
                        } else if (count > 0) {
                            counts.add(count);
                            count = 0;
                        }
                    }
                    if (counts.size() > 0) {
                        Collections.sort(counts);
                        return counts.get(counts.size() - 1);
                    }
                    return 0;
                })
                .orElse(0);
    }
}
