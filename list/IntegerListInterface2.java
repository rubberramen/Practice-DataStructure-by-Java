package dataStructurePrac.list;

import dataStructurePrac.list.arrayList.IntegerArrayList;

public interface IntegerListInterface2 {
    public void add(int index, Integer x);

    public void append(Integer x);

    public Integer remove(int index);

    public boolean removeItem(Integer x);

    public Integer get(int index);

    public void set(int index, Integer x);

    public int indexOf(Integer x);

    public int length();

    public boolean isEmpty();

    public void clear();


}
