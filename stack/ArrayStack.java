package dataStructurePrac.stack;

public class ArrayStack<E> implements StackInterface<E>{

    private E[] stack;
    private int topIndex;
    private static final int DEFAULT_CAPACITY = 64;
    private final E ERROR = null;     // 임의의 에러 값

    public ArrayStack() {
        stack = (E[]) new Object[DEFAULT_CAPACITY];
        topIndex = -1;
    }

    public ArrayStack(int n) {
        stack = (E[]) new Object[n];
//        stack = new E[stack.length];
        this.topIndex = -1;
    }

    @Override
    public void push(E newItem) {
        if (isFull()) { /*Error*/ }
        else stack[++topIndex] = newItem;
    }

    @Override
    public E pop() {
        if (isEmpty()) return ERROR;
        else {
            return stack[topIndex--];
        }
    }

    @Override
    public E top() {
        if (isEmpty()) {
            return ERROR;
        } else {
            return stack[topIndex];
        }
    }

    @Override
    public boolean isEmpty() {
        return topIndex < 0;
    }


    public boolean isFull() {
        return (topIndex == stack.length - 1);
    }

    @Override
    public void popAll() {
        stack = (E[]) new Object[stack.length];
        topIndex = -1;
    }

    ////////////////////////////////////////////
    public void printAll() {
        System.out.print("Stack from top:");
        for(int i=topIndex; i>=0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public int getTopIndex() {
        return topIndex;
    }
}
