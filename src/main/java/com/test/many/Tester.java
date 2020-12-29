package com.test.many;

import java.util.ArrayList;

public class Tester {

    public static void main(String[] args) {

//        arrayTest();

        ArrayList list = new ArrayList();
        list.add(5);
        list.add(8);
        list.add("ABC");
        list.add(true);
        System.out.println(list);

    }

    public static void arrayTest() {
        int[] number = new int[5];
        number[2] = 100;
        number[4] = 20;
        System.out.println(number[2]);

        int[] scores = {88,90,50,88,99};

        System.out.println(scores[4]);

        for (int i=0; i<5; i++){
            System.out.println(scores[i]);
        }
        for (int n : scores){
            System.out.println(n);
        }
    }
}
