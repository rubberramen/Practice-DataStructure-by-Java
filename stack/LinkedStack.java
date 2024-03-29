package dataStructurePrac.stack;

import dataStructurePrac.list.linkedList.Node;

public class LinkedStack<E> implements StackInterface<E>{

    private Node<E> topNode;
    private final E ERROR = null;   // 임의의 에러 값
    public LinkedStack() {
        topNode = null;
    }

    @Override
    public void push(E newItem) {
        topNode = new Node<>(newItem, topNode);
    }

    @Override
    public E pop() {
        if(isEmpty()) return ERROR;
        else {
            Node<E> temp = topNode;
            topNode = topNode.next;
            return temp.item;
        }
    }

    @Override
    public E top() {
        if (isEmpty()) return ERROR;
        else return topNode.item;
    }

    @Override
    public boolean isEmpty() {
        return (topNode == null);
    }

    @Override
    public void popAll() {
        topNode = null;
    }
}
