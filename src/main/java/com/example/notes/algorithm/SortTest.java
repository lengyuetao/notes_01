package com.example.notes.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTest {
    public static void main(String[] args) {
        List<SortTest> list=new ArrayList<>();
        SortTest sortTest1=new SortTest(3);
        SortTest sortTest2=new SortTest(5);
        SortTest sortTest3=new SortTest(2);
        SortTest sortTest4=new SortTest(6);
        list.add(sortTest1);
        list.add(sortTest2);
        list.add(sortTest3);
        list.add(sortTest4);

        //传统排序
        Collections.sort(list, new Comparator<SortTest>() {
            @Override
            public int compare(SortTest o1, SortTest o2) {
                if(o1.getLevel()>o2.getLevel()){
                    return 1;
                }else if(o1.getLevel()==o2.getLevel()){
                   return 0;
                }else {
                    return -1;
                }
            }
        });


        //lambda排序
        Collections.sort(list, (SortTest x, SortTest y) -> x.getLevel() > y.getLevel() ? 1 : -1);

        for (SortTest sortTest:list){
            System.out.println(sortTest.getLevel());
        }
    }


    public SortTest(int level){
        this.level=level;
    }

    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
