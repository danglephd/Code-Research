
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danglph
 */
public class TestNhanQuestion {

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        int n = 5;
        int[] arrr = {3, 0, 1, 2, 5, 4, 0, 5};
        getMinLength(n, arrr);
        nhanNT_function();
    }

    private static int getMinLength(int n, int[] arrr) {
        int result = 0;
        int indexStart = 0;
        int indexEnd = 0;
        int count = 0;

        for (int i = 0; i < arrr.length - 1; i++) {
            int j = arrr[i];
            for (int k = i + 1; k < arrr.length; k++) {
                int l = arrr[k];
                count++;
                System.out.println(">>>" + count);
                if (j + l == n) {
                    if (result == 0 || result > (k - i)) {
                        result = k - i + 1;
                        indexStart = i;
                        indexEnd = k;
                        System.out.println(">>> i = " + i + ", k = " + k);
//                        break;
                    }
                }
            }
            //special
            if (result == 2) {
                break;
            }
        }

        return result;
    }

    public static void nhanNT_function() {
        int n = 5;
        int[] lst = {3, 0, 1, 2, 5, 4, 0, 5};
        Map<Integer, String> maptmp = new HashMap<Integer, String>();
        for (int i = 0; i < lst.length - 1; i++) {
            for (int j = i + 1; j < lst.length; j++) {
                if (lst[i] + lst[j] == n) {
                    maptmp.put(lst[i], (j - i) + "/" + lst[i] + "+" + lst[j]);
                }
            }
        }
        System.out.println(maptmp);
        int rs = 0;
        String number = null;
        for (Map.Entry<Integer, String> map : maptmp.entrySet()) {
            String tmp = map.getValue();
            if (rs == 0) {
                rs = Integer.parseInt(tmp.split("/")[0]);
                number = tmp.split("/")[1];
            } else {
                if (rs > Integer.parseInt(tmp.split("/")[0])) {
                    rs = Integer.parseInt(tmp.split("/")[0]);
                    number = tmp.split("/")[1];
                }
            }
        }

        System.out.println(rs + " = " + number);
    }
}
