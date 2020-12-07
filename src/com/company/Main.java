package com.company;
import java.util.List;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue ten = new LinkedList<Integer>();
        ten.add(1);
        ten.add(2);
        ten.add(3);
        ten.add(4);
        ten.add(5);
        ten.add(6);
        ten.add(7);
        ten.add(8);
        ten.add(9);
        ten.add(10);
        System.out.println(ten);
        Collections.reverse((List<?>)ten);
        System.out.println(ten);
        Collections.reverse((List<?>)ten);
        Collections.swap((List<?>)ten, 0,5);
        Collections.swap((List<?>)ten, 1,6);
        Collections.swap((List<?>)ten, 2,7);
        Collections.swap((List<?>)ten, 3,8);
        Collections.swap((List<?>)ten, 4, 9);
        System.out.println(ten);

    }
}



