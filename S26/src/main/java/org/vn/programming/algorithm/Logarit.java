/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vn.programming.algorithm;

/**
 *
 * @author danglph
 */
public class Logarit {

    //Theo công thức vận dụng logarit thì:
    //- Số chữ số của 1 số nguyên valuePow = [log(valuePow)] + 1
    void countNumberDigitsOfIntegerValue() {
        try {

            int x = 2;
            int a = 2;

            //tính valuePow = a^x
            double valuePow = Math.pow(a, x);
            System.out.println(a + "^" + x + " = " + valuePow);

            //Đếm số chữ số bằng cách tính: [log(valuePow)] + 1
            double numberDigits = Math.log10(valuePow) + 1;
            System.out.println("Number of digits of " + valuePow + " = " + numberDigits);
            System.out.println("Number of digits of " + valuePow + " = " + Math.floor(numberDigits));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            throw e;
        }
    }
}
