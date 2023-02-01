package dataStructurePrac.list.linkedList;

/*
    자료구조라는 본질에 집중하기 위해, 멤버 필드를 public으로
 */
public class Node<E> {

    public E item;
    public Node<E> next;

    // 단독 Node 객체 생성하는 생성자
    public Node(E newItem) {
        item = newItem;
        next = null;
    }

    // 직접 연결하는 Node 객체를 만드는 생성자
    public Node(E newItem, Node<E> nextNode) {
        item = newItem;
        next = nextNode;
    }
}
