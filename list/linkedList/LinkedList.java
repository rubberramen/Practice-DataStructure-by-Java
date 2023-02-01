package dataStructurePrac.list.linkedList;

import dataStructurePrac.list.ListInterfaceGeneric;

public class LinkedList<E> implements ListInterfaceGeneric {

    private Node<E> head;
    private int numItems;

    public LinkedList() {
        numItems = 0;
        head = new Node<>(null, null);
    }

    @Override
    public void add(int index, Object x) {

    }

    @Override
    public void append(Object x) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public boolean removeItem(Object x) {
        return false;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public void set(int index, Object x) {

    }

    @Override
    public int indexOf(Object x) {
        return 0;
    }

    @Override
    public int len() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }
}
