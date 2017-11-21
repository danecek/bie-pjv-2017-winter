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

    @Override
    protected int find(Object e) {
        if (!(e instanceof Comparable)) {
            throw new IllegalArgumentException("not comparable");
        }
        Comparable ce = (Comparable) e;
        int min = 0;
        int max = size - 1;
        while (min <= max) {
            int h = (min + max) / 2;
            int cr = ce.compareTo(elems[h]);
            if (cr == 0) {
                return h; // in <0..size-1>
            }
            if (cr < 0) {
                max = h - 1;
            } else {
                min = h + 1;
            }
        }
        return min;// position of the first element greater then ce (<0..size>)
    }

    @Override
    public boolean add(Object e) {
        int i = find(e);
        if (i < size && e.equals(elems[i])) {
            return false;
        }
        Object[] newItems = elems;
        if (elems.length == size) {
            newItems = new Object[elems.length * 2];
            System.arraycopy(elems, 0, newItems, 0, i);
        }
        System.arraycopy(elems, i, newItems, i + 1, size - i);
        newItems[i] = e;
        elems = newItems;
        size++;
        return true;
    }

    public ArraySet3() {
    }

    public ArraySet3(int initialCapacity) {
        super(initialCapacity);
    }

}
