package com.bhavik.students.demo;

public class SortAlgo {

    private BubbleSort bubbleSort;

    public SortAlgo(){
        this.bubbleSort = new BubbleSort();
    }

    public void sort(){
        this.bubbleSort.sort();
    }
}
