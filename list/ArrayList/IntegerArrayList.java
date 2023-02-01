package dataStructurePrac.list.ArrayList;

import dataStructurePrac.list.IntegerListInterface;

import java.util.Arrays;

public class IntegerArrayList implements IntegerListInterface {

    // 멤버 필드
    private Integer[] item;
    private int numItems;
    private static final int DEFAULT_CAPACITY = 64;   // 디폴트 크기


    // 생성자
    public IntegerArrayList() {
        item = new Integer[DEFAULT_CAPACITY];
        numItems = 0;
    }

    public IntegerArrayList(int n) {
        item = new Integer[n];
        numItems = 0;
    }

    // 예외 클래스
    public static class ExceptionList extends Exception {
        public ExceptionList(String msg) {
            super(msg);
        }
    }

    /**
     * 배열 리스트의 k번째 자리에 원소 x 삽입하기
     * @param index
     * @param
     * @throws ExceptionList
     */
    @Override
    public void add(int index, Integer x) throws ExceptionList {

        if ( numItems >= item.length || index < 0 || index > numItems) {
            throw new ExceptionList("add() Error");
        } else {
            for (int i = numItems - 1; i >= index; i--) {
                item[i + 1] = item[i];
            }
            item[index] = x;
            numItems++;
        }
    }

    /**
     * 배열 리스트의 맨 뒤에 원소 추가하기
     * @param x
     * @throws ExceptionList
     */
    @Override
    public void append(Integer x) throws ExceptionList {
        if (numItems >= item.length) {
            throw new ExceptionList("append() Error");
        }
        item[numItems] = x;
        numItems++;
    }

    /**
     * 배열 리스트의 k번째 원소 삭제하기
     * @param index
     * @return
     */
    @Override
    public Integer remove(int index) throws ExceptionList {
        if (index > numItems -1 || index < 0 || numItems >= item.length || isEmpty()) {
            throw new ExceptionList("remove() Error");
        }

//        int answer = item[index];
//        for (int i = index; i < numItems - 2; i++) {
//            item[i] = item[i + 1];
//            item[i + 1] = null;
//        }
//        numItems--;
//        return answer;

        int answer = item[index];

        for (int i = index ; i <= numItems-2; i++) {
            item[index] = item[index + 1];
        }
        numItems--;
        return answer;
    }

    // TODO: 2023-01-31 031
    /**
     * 배열 리스트에서 원소 x 삭제
     * @param x
     * @return
     */
    @Override
    public boolean removeItem(Integer x) {

        int k = 0;
        while (k < numItems && item[k].compareTo(x) != 0) {
            k++;
        }
        if (k == numItems) {
            return false;
        } else{
            for (int i = k; i < numItems - 2; i++) {
                item[i] = item[i + 2];
            }
            numItems--;
            return true;
        }
    }

    /**
     * 배열 리스트의 i번째 원소 조회
     * @param index
     * @return Integer
     */
    @Override
    public Integer get(int index) {
        if (index >= 0 && index <= numItems - 1) {
            return item[index];
        }
        return null;
    }

    @Override
    public void set(int index, Integer x) throws ExceptionList {
        if (index >= 0 || index <= numItems - 1) {
            item[index] = x;
        } else {
            throw new ExceptionList("set() Error");
        }
    }

    /**
     * 원소 x가 배열리스트의 몇번재 원소인지
     *
     * @param x
     * @return
     */
    private final int CANT_FOUND = -9999;
    @Override
    public int indexOf(Integer x) {
        for (int i = 0; i < numItems; i++) {
            if ((item[i]).compareTo(x) == 0) {
                return i;
            }
        }
        return CANT_FOUND;
    }

    /**
     * 배열 리스트의 원소 갯수
     * @return
     */
    @Override
    public int length() {
        return numItems;
    }

    /**
     * 비어 있는 지 확인
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
//        if(numItems == 0) return true;
//        else return false;
        return numItems == 0;
    }

    /**
     * 배열 리스트 리셋
     */
    @Override
    public void clear() {
        item = new Integer[item.length];
        numItems = 0;
    }

    @Override
    public String toString() {
        return "IntegerArrayList{" +
                "item=" + Arrays.toString(item) +
                ", numItems=" + numItems +
                '}';
    }


    /**
     * 모두 출력
     */
    public void printAll() {
        System.out.print("Print list (#items=" + numItems + ") ");
        for(int i = 0; i < numItems; i++)
            System.out.print(item[i] + " ");
        System.out.println();
    }
}
