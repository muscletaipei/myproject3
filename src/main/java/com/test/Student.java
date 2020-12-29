package com.test;

import java.util.Random;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {


//        userInput();
        Stu stu = new Stu("joe", 80, 90);
        stu.print();


    }

    public static void userInput() {
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入學生名稱");
        String name = scn.next();
        System.out.println("請輸入學生數學成績");
        int math = scn.nextInt();
        System.out.println("請輸入學生英文成績");
        int english = scn.nextInt();

        System.out.println("學生："+ name + "\t" + "數學成績：" + math + "\t" + "英文成績：" + english);
    }


}
