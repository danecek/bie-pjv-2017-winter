/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.arrayset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author danecek
 */
public class Test {

    private static long testAS(Set s, int n) {
        long b = System.currentTimeMillis();
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            s.add(r.nextInt());
        }
        for (int i = 0; i < 10 * n; i  
                ++  
                ) {
            s.contains(r.nextInt());
        }
        return System.currentTimeMillis() - b;

    }

    public static void main(String[] args) {
        int n = 10000;
        System.out.println(testAS(new ArraySetDynamic(), n));
        System.out.println(testAS(new ArraySetOrdered(), n));
        System.out.println(testAS(new HashSet(), n));
        System.out.println(testAS(new TreeSet(), n));
//        Set as = new ArraySet3(1);
//        System.out.println(as);
//        as.add("xxx");
//
//        as.add("yyy");
//        as.add("aaa");
//        as.add("zzz");
//        as.add("xxx");
////        System.out.println("=============================================");
////        for (Iterator<Object> i = as.iterator(); i.hasNext();) {
////            System.out.println(i.next());
////        }
////        System.out.println("=============================================");
////        System.out.println(as);
////        as.remove("www");
//        System.out.println(as);
    }
}
