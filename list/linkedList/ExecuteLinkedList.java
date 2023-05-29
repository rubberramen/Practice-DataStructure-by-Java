package dataStructurePrac.list.linkedList;

public class ExecuteLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0, 300);
        list.append(111); // TODO: 2023-05-29 029 어디서 head에 값이 담기는 지 잘 모르겠음 
        list.printAll();
    }
}
