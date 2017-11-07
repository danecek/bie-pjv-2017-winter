/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.expr;

/**
 *
 * @author danecek
 */
public enum Operator {
    PLUS(0, "+"), MINUS(0, "-"), DIV(1,"/"), MLT(1, "*"), LSHIFT(2, "<<");

    private Operator(int priority, String text) {
        this.priority = priority;
        this.text = text;
    }
    
    private int priority;
    String text;
    
    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return text;
    }
    
    
    
}
