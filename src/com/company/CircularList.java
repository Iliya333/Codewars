package com.company;

public class CircularList<T> {

    private int index=-1;
    private int length;
    final private T[] elements;

    public CircularList(final T... elements) {
        if(elements.length==0){throw new RuntimeException("${T}");}
        this.elements=elements;
        this.length=elements.length;
    }

    T next() {
        if(++index==length)index=0;
        return elements[index];
    }

    T prev() {
        if(--index<0)index=length-1;
        return elements[index];
    }
}