/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biapj.scanner;

/**
 *
 * @author danecek
 */
public class NameToken extends Token {

    String value;
    
    public NameToken(String value) {
        super(TokenCls.NAME);
        this.value = value;
    }
    
    @Override
    public String toString() {
        return "NameToken{" + "value=" + value + '}';
    }
}
