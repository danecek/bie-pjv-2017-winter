/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biapj.scanner;

public enum TokenCls {
    NUM("NUM"), NAME("NAME"), EOF("EOF"), CHAR("CHAR"), PLUS("+"), PLUSPLUS("++");

    TokenCls(String text) {
        this.text = text;
    }
    String text;

    @Override
    public String toString() {
        return text;
    }
    
}
