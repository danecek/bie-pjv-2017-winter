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
public class BinOp implements Expr {

    Operator op;
    Expr left;
    Expr right;

    public BinOp(Operator op, Expr left, Expr right) {
        this.op = op;
        this.left = left;
        this.right = right;
    }

    public int eval() {
        switch (op) {
            case PLUS:
                return left.eval() + right.eval();
            case MINUS:
                return left.eval() - right.eval();
            case MLT:
                return left.eval() * right.eval();
            case DIV:
                return left.eval() / right.eval();
            default:
                throw new RuntimeException("unknown operation");
        }
    }

    private static String enclose(String s) {
        return '(' + s + ')';
    }

    @Override
    public String toString() {
        String ls = left.toString();
        String rs = right.toString();
        if (left.pri() < op.getPriority()) {
            ls = enclose(ls);
        }
        if (right.pri() < op.getPriority()) {
            ls = enclose(ls);
        }
        return ls + op + rs;
    }

    public int pri() {
        return op.getPriority();
    }

}
