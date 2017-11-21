/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.arrayset;

import java.util.Iterator;

/**
 *
 * @author danecek
 */
public class ArraySetIterator implements Iterator<Object>{
    
    private int pos = 0;
    private ArraySet arraySet;

    public ArraySetIterator(ArraySet arraySet) {
        this.arraySet = arraySet;
    }

    @Override
    public boolean hasNext() {
        return pos < arraySet.size();
    }

    @Override
    public Object next() {
        return arraySet.elems[pos++];
    }
    
}
