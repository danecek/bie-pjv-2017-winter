/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.arrayset;

/**
 *
 * @author danecek
 */
public class ArraySetDynamic extends ArraySet {

    public ArraySetDynamic() {
    }

    public ArraySetDynamic(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public boolean full() {
        return false;
    }   
    

    @Override
    public boolean add(Object e) {
        if (size == elems.length) {
            Object[] newElems = new Object[elems.length * 2];
            System.arraycopy(elems, 0, newElems, 0, size());
            elems = newElems;
           // System.out.println("new length: " + elems.length);
        }
        return super.add(e);
    }

}
