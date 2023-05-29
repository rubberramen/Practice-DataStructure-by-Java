package dataStructurePrac.list.arrayList;

public class ExecuteIntegerArrayList2 {

    public static void main(String[] args){

        IntegerArrayList2 list = new IntegerArrayList2();
        System.out.println("Integer Array List Demo!");
        list.add(0, 300);
        list.add(0, 200);
        list.add(0, 100);
        list.printAll();

        list.append(500);
        list.append(600);
        list.remove(3);
        list.printAll();

        list.add(3, 250);
        list.add(1, 50);
        list.add(0, 10);
        list.append(700);
        list.printAll();

        list.remove(1);
        list.removeItem(600);
        list.printAll();
    }
}
