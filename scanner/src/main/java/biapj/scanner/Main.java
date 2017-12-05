/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biapj.scanner;

import java.io.IOException;
import java.io.StringReader;

/**
 *
 * @author danecek
 */
public class Main {

    public static void main(String[] args) throws IOException, Throwable {
        StringReader sr = new StringReader("123  + ++ 'A'  xx 234  56");
//        MyScanner ms = new MyScanner(sr);
//        for (Token t = ms.nextToken(); t.tokenCls != EOF; t = ms.nextToken()) {
//            System.out.println(t);
//        }
        System.out.println(ScannerTask.scan(sr));
    }
    

}
