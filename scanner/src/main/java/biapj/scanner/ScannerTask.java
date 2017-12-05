/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biapj.scanner;

import static biapj.scanner.TokenCls.EOF;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danecek
 */
public class ScannerTask implements Callable<List<Token>> {

    Reader input;

    @Override
    public List<Token> call() throws Exception {
        List<Token> result = new ArrayList<>();
        MyScanner ms = new MyScanner(input);
        for (Token t = ms.nextToken(); t.tokenCls != EOF; t = ms.nextToken()) {
            result.add(t);
        }
        return result;
    }
    
    static List<Token> scan(Reader input) throws InterruptedException, Throwable {
        try {
            Future<List<Token>> f = Executors.newCachedThreadPool().submit(new ScannerTask(input));
            return f.get(3, TimeUnit.SECONDS);
        } catch (ExecutionException ex) {
            throw ex.getCause();
        }
    }

    public ScannerTask(Reader input) {
        this.input = input;
    }

}
