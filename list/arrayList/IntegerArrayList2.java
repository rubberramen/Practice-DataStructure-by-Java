package dataStructurePrac.list.arrayList;

import dataStructurePrac.list.IntegerListInterface;
import dataStructurePrac.list.IntegerListInterface2;

public class IntegerArrayList2 implements IntegerListInterface2 {

    private Integer[] items;
    private int numItems;
    private static final int DEFAULT_CAPACITY = 64;

    public IntegerArrayList2() {
        items = new Integer[DEFAULT_CAPACITY];
        numItems = 0;
    }

    public IntegerArrayList2(int n) {
        items = new Integer[n];
        numItems = 0;
    }

    @Override
    public void add(int index, Integer x) {

        if (numItems >= items.length || index < 0 || index > numItems) {
            /* 에러처리 */
        } else {
            for (int i = numItems - 1; i >= index; i--) {
                items[i + 1] = items[i];
            }
            items[index] = x;
            numItems++;
        }

    }

    @Override
    public void append(Integer x) {
        if (numItems >= items.length) {
            /*  */
        } else {
            items[numItems++] = x;
        }
    }

    @Override
    public Integer remove(int index) {
        if (isEmpty() || index < 0 || index > numItems - 1) {
            /*  */
            return null;
        } else {
            Integer item = items[index];
            for (int i = index; i < numItems - 1; i++) {
                items[i] = items[i + 1];
            }
            numItems--;
            return item;
        }
    }

    @Override
    public boolean removeItem(Integer x) {
        int k = 0;
        while (k < numItems && items[k] != x) {
            k++;
        }

        if (k == numItems) return false;
        else {
            for (int i = k; k <= numItems - 2; i++) {
                items[k] = items[k+1];
            }
            numItems--;
            return true;
        }
    }

    @Override
    public Integer get(int index) {

        if (index >= 0 && index <= numItems - 1) {
            return items[index];
        }
        else return null;
    }

    @Override
    public void set(int index, Integer x) {
        if (index >= 0 && index <= numItems - 1) {
            items[index] = x;
        } else {/* 에러처리 */}
    }

    private final int NOT_FOUND = -12345;
    @Override
    public int indexOf(Integer x) {

        int i = 0;
        for (i = 0; i < items.length; i++) {
            if (items[i].compareTo(x) == 0) {
                return i;
            }
        }
        return NOT_FOUND;
    }

    @Override
    public int length() {
        return numItems;
    }

    @Override
    public boolean isEmpty() {
        return numItems == 0;
    }

    @Override
    public void clear() {
        items = new Integer[items.length];
        numItems = 0;
    }

    public void printAll() {
        System.out.print("Print list (#items=" + numItems + ") ");
        for(int i = 0; i < numItems; i++)
            System.out.print(items[i] + " ");
        System.out.println();
    }
}
