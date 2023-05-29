package dataStructurePrac.list;

import dataStructurePrac.list.arrayList.IntegerArrayList;

public interface IntegerListInterface {
    public void add(int index, Integer x) throws IntegerArrayList.ExceptionList;

    public void append(Integer x) throws IntegerArrayList.ExceptionList;

    public Integer remove(int index) throws IntegerArrayList.ExceptionList;

    public boolean removeItem(Integer x);

    public Integer get(int index);

    public void set(int index, Integer x) throws IntegerArrayList.ExceptionList;

    public int indexOf(Integer x);

    public int length();

    public boolean isEmpty();

    public void clear();


}
