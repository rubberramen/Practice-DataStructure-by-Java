package dataStructurePrac.list.linkedList;

import dataStructurePrac.list.ListInterface;
import dataStructurePrac.list.ListInterfaceGeneric;

public class LinkedList<E> implements ListInterface<E> {

    private Node<E> head;
    private int numItems;

    public LinkedList() {
        numItems = 0;
        head = new Node<>(null, null);  // 더미 헤드
    }

    // 연결 리스트에 원소 x 삽입
    @Override
    public void add(int index, E item) {
        if (index >= 0 && index <= numItems) {
            Node<E> prevNode = getNode(index - 1);
            Node<E> newNode = new Node<>(item, prevNode.next);
            prevNode.next = newNode;  // TODO: 2023-05-29 029 여기서 head의 next에 값이 담김? Why? 
            numItems++;
        }
    }

    @Override
    public void append(E x) {
        // TODO: 2023-05-29 029 null pointException -> 이 상태에 head는 이미 담겨있음. 어디서 왔는지 모르겠음
        Node<E> prevNode = head;
        while (prevNode.next != null) {
            prevNode = prevNode.next;
        }
        Node<E> newNode = new Node<>(x, null);
        prevNode.next = newNode;
        numItems++;
    }

    @Override
    public E remove(int index) {
        if (index >= 0 && index <= numItems - 1) {
            Node<E> prevNode = getNode(index - 1);
            Node<E> currNode = prevNode.next;
            prevNode.next = currNode.next;
            numItems--;
            return currNode.item;
        } else return null;
    }

    @Override
    public boolean removeItem(E x) {
        Node<E> currNode = head;
        Node<E> prevNode;

        for (int i = 0; i < numItems - 1; i++) {
            prevNode = currNode;
            currNode = currNode.next;
            if (((Comparable)(currNode.item)).compareTo(x) == 0) {
                prevNode.next = currNode.next;
                numItems--;
                return true;
            }
        }
        return false;
    }

    @Override
    public E get(int index) {
        if (index >= 0 && index <= numItems - 1) {
            return getNode(index).item;
        } else
            return null; 		// 에러
    }

    @Override
    public void set(int index, E x) {
        if (index >= 0 && index <= numItems - 1) {
            getNode(index).item = x;
        } else { /* 에러 처리 */ }
    }

    public final int NOT_FOUND = -12345;
    @Override
    public int indexOf(E x) {
        Node<E> currNode = head;   // 더미 노드
        int i;
        for (i = 0; i < numItems; i++) {
            currNode = currNode.next;
            if (((Comparable)(currNode.item)).compareTo(x) == 0)
                return i;
        }
        return NOT_FOUND; 	// not found
    }

    @Override
    public int len() {
        return numItems;
    }

    @Override
    public boolean isEmpty() {
        return numItems == 0;
    }

    @Override
    public void clear() {
        numItems = 0;
        head = new Node<>(null, null);
    }

    //////////////////////////////////////////////////////
    public Node<E> getNode(int index) {
        if (index >= -1 && index <= numItems - 1) {
            Node<E> currNode = head;  	// 더미 노드
            // TODO: 2023-05-29 029 처음 넣을 때는 index가 0이라 아예 일로 안들어옴
            for (int i = 0; i <= index; i++) {
                currNode = currNode.next;
                String test = "";
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
