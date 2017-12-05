/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biapj.scanner;

import java.io.IOException;
import java.io.Reader;

public class MyScanner {

    char actCh;

    private void next() throws IOException {
        int c = r.read();
        if (c == -1) {
            actCh = 0;
        } else {
            actCh = (char) c;
        }
    }

    private void skipWs() throws IOException {
        while (Character.isWhitespace(actCh)) {
            next();
        }
    }

    private NameToken getName() throws IOException {
        StringBuilder value = new StringBuilder();
        while (Character.isLetterOrDigit(actCh)) {
            value.append(actCh);
            next();
        }
        return new NameToken(value.toString());
    }

    private NumberToken getNumber() throws IOException {
        int value = 0;
        while (Character.isDigit(actCh)) {
            value = value * 10 + actCh - '0';
            next();
        }
        return new NumberToken(value);
    }

    public Token nextToken() throws IOException {
        skipWs();
        if (Character.isLetter(actCh)) {
            return getName();
        } else if (Character.isDigit(actCh)) {
            return getNumber();
        } else if (actCh == 0) {
            return new Token(TokenCls.EOF);
        } else {
            switch (actCh) {
                case '+': {
                    next();
                    if (actCh == '+') {
                        next();
                        return new Token(TokenCls.PLUSPLUS);
                    }
                    return new Token(TokenCls.PLUS);
                }
                case '\'': {
                    next();
                    CharToken ct = new CharToken(actCh);
                    next();
                    if (actCh != '\'') {
                        throw new IOException("invalid character literal");
                    }
                    next();
                    return ct;
                }
                default:
                    throw new IOException("unknown character: " + actCh);
            }
        }
    }

    Reader r;

    public MyScanner(Reader r) throws IOException {
        this.r = r;
        next();
    }
}
