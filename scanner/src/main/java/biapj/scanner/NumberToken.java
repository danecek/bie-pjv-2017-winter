/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biapj.scanner;

import static biapj.scanner.TokenCls.NUM;

public class NumberToken extends Token {

    int value;

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    public NumberToken(int value) {
        super(NUM);
        this.value = value;
    }
}
