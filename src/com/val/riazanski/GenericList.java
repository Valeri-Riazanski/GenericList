package com.val.riazanski;

import java.util.LinkedList;
import java.util.List;

public class GenericList<T> {
//    fields
    private List<T> list = new LinkedList<T>();
//    constructors
    public GenericList(List<T> list) {
        this.list = list;
    }
//    methods
    public void add(T value) {
        this.list.add(value);
    }
    public void addFirst(T value) {
        this.list.add(0, value);
    }
    public void addOfIndex(int n, T value) {
        if (n < list.size()) {
            this.list.add(n, value);
        } else this.list.add(value);
    }
    public void remove(int n) {
        this.list.remove(n);
    }
    public  void addAll(List<T> anotherList) {
        this.list.addAll(anotherList);
    }
    public List<T> getList() {
        return this.list;
    }
    public int getSize() {
        return this.list.size();
    }
    public void applyLambda(Runnable task) {
                    task.run();
    }

}
