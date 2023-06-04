package dataStructurePrac.stack;

public class ExecuteArrayStack {

    public static void main(String[] args) {
        ArrayStack<Integer> s = new ArrayStack<>();
        s.push(300);
        s.push(200);
        s.push(100);
        Integer pop = s.pop();
        System.out.println("pop = " + pop);
        s.printAll();
    }
}
