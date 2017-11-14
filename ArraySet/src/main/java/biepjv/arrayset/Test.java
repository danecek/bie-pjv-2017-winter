/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.arrayset;

import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author danecek
 */
public class Test {

    public static void main(String[] args) {
        Set as = new ArraySet3(10);
        System.out.println(as);
        as.add("xxx"); 
 
        as.add("yyy");
        as.add("aaa");
        as.add("zzz");
        as.add("xxx"); 
//        System.out.println("=============================================");
//        for (Iterator<Object> i = as.iterator(); i.hasNext();) {
//            System.out.println(i.next());
//        }
//        System.out.println("=============================================");
//        System.out.println(as);
//        as.remove("www");
        System.out.println(as);
    }
}
