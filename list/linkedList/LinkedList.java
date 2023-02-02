package dataStructurePrac.list.linkedList;

import dataStructurePrac.list.ListInterfaceGeneric;

public class LinkedList<E> implements ListInterfaceGeneric<E> {

    private Node<E> head;
    private int numItems;

    public LinkedList() {
        numItems = 0;
        head = new Node<>(null, null);
    }

    // 연결 리스트에 원소 x 삽입
    @Override
    public void add(int index, E item) {
        if (index >= 0 && index <= numItems) {
            Node<E> prevNode = getNode(index - 1);
            Node<E> newNode = new Node<>(item, prevNode.next);
            prevNode.next = newNode;
            numItems++;
        }
    }

    @Override
    public void append(E x) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public boolean removeItem(E x) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void set(int index, E x) {

    }

    @Override
    public int indexOf(E x) {
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

    //////////////////////////////////////////////////////
    public Node<E> getNode(int index) {
        if (index >= -1 && index <= numItems - 1) {
            Node<E> currNode = head;  	// 더미 노드
            for (int i = 0; i <= index; i++) {
                currNode = currNode.next;
            }
            return currNode;
        } else {
            return null;
        }
    }

    public void printAll() {
        Node<E> t;
        System.out.print("Print list (#items=" + numItems + ") ");
        for(t=head.next; t != null; t = t.next) {
            System.out.print(t.item + " ");
        }
        System.out.println();
    }
}
