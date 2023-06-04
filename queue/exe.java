package dataStructurePrac.queue;

public class exe {
    public static void main(String[] args) {
        ArrayQueue<String> s = new ArrayQueue<>();
        s.enqueue("test 1");
        s.enqueue("test 2");
        s.enqueue("test 3");
        String dequeue = s.dequeue();
        System.out.println("dequeue = " + dequeue);

        s.printAll();
    }
}
