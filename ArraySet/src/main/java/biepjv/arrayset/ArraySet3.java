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
public class ArraySet3 extends ArraySet2 {

    protected int find(Object e) {
        int min = 0;
        int max = size() - 1;
        while (max >= min) {
            int h = (max - min) / 2;
            int cr = ((Comparable) elems[h]).compareTo(e);
            if (cr == 0) {
                return h;
            }
            if (cr < 0) {
                max = h - 1;
            }
            if (cr > 0) {
                min = h + 1;
            }
        }
        return -1;
    }

    @Override
    public boolean add(Object e) {
        int i;
        for (i = 0; i < size() && ((Comparable) e).compareTo(elems[i]) >= 0; i++);
        if (e.equals(elems[i])) {
            return false;
        }
        System.arraycopy(elems, i, elems, i + 1, size() - i);
        elems[i] = e;
        size++;
        return true;
    }

    public ArraySet3(int initialCapacity) {
        super(initialCapacity);
    }

}
