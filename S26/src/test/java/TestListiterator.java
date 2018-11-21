/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danglph
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import java.util.Vector;

public class TestListiterator {

    public static void main(String args[]) {
//        testTreeMap();
        testHashCode();
    }
    
    public static void testListIterator(){
        
        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add(1, "Python");
        System.out.println("Phan tu co index = 2 la: " + list.get(2));

        ListIterator<String> itr = list.listIterator();
        System.out.println("Duyet cac phan tu tu dau den cuoi:");
        while (itr.hasNext()) {
            System.out.println("\t" + itr.next());
        }
        System.out.println("Duyet cac phan tu tu cuoi ve dau:");
        while (itr.hasPrevious()) {
            System.out.println("\t" + itr.previous());
        }

        //itr đã đi đến cuối list nên  vòng while ngay bên dưới có kết quả false
        System.out.println("Duyet cac phan tu tu cuoi ve dau:");
        while (itr.hasPrevious()) {
            System.out.println("\t" + itr.previous());
        }
        System.out.println("Duyet cac phan tu tu dau den cuoi:");
        while (itr.hasNext()) {
            System.out.println("\t" + itr.next());
        }
    }

    public static void testDifferentBw_Ite_Enum() {
        Enumeration days;
        Vector dayNames = new Vector();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        days = dayNames.elements();
        while (days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }
    }

    public static void testTreeMap() {

        Map<String, Object> treeMap = new TreeMap<String, Object>();
        // add elements to treeMap
        treeMap.put(null, "A");// java.lang.NullPointerException
        treeMap.put("1", "A");
        treeMap.put("3", "C");
        treeMap.put("2", null);
        treeMap.put("4", "D");
        treeMap.put("5", null);
        // show treeMap
        Set<String> keySet = treeMap.keySet();
        for (String key : keySet) {
            System.out.println(key + " " + treeMap.get(key));
        }

    }
    public static void testHashCode() {
        
        // create arrayList
        List<String> arrayList = new ArrayList();
        // adding String object to arrayList
        arrayList.add("Java");
        arrayList.add("C");
        arrayList.add("C++");
        arrayList.add("PHP");
        arrayList.add("Python");
        System.out.println("hashCode = " + arrayList.hashCode());
    }
    
    public static void testArr_ArrList() {
        // create arrayList
        List<String> arrayList = new ArrayList();
        // adding String object to arrayList
        arrayList.add("Java");
        arrayList.add("C");
        arrayList.add("C++");
        arrayList.add("PHP");
        arrayList.add("Python");
         
        // convert ArrayList to Array
        System.out.println("Convert ArrayList to Array:");
        String[] item = arrayList.toArray(new String[arrayList.size()]);
        // show item
        for (String s : item) {
            System.out.println(s);
        }
         
        // convert Array to ArrayList
        System.out.println("Convert Array to ArrayList:");
        List<String> list2 = new ArrayList();
        list2 = Arrays.asList(item);
        // show list2
        System.out.println(list2);
    }

}
