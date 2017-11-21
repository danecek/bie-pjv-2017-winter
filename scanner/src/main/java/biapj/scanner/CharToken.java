/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biapj.scanner;

import static biapj.scanner.TokenCls.CHAR;

/**
 *
 * @author danecek
 */
public class CharToken extends Token{
    char value;

    public CharToken(char value) {
        super(CHAR);
        this.value = value;
    }

    @Override
    public String toString() {
        return "CharToken{" + "value=" + value + '}';
    }
    
}
