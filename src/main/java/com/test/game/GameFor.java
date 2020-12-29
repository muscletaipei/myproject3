package com.test.game;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {

//        gameForGuess();

        //1+2+...+10
/*        int sum = 0;
        for (int i=1; i<=10; i++){
            sum = sum + i;
            System.out.print(i + "+");
        }
        System.out.println("\n="+ sum);*/

/*        int sum = 0;
        for (int j=10; j >=1; j--){
            sum = sum + j;
            System.out.print(j + "+");
        }
        System.out.println("\t=" + sum);*/

        Scanner scn = new Scanner(System.in);
        int secret = new Random().nextInt(10)+1;
        System.out.println(secret);

        for (int i =1; i <=5; i++ ){
            System.out.print("請猜第" + i + "次數字為：");
            int number = scn.nextInt();
            System.out.println("這是第" + i + "/5次數字為：" + number);
            if (number > secret){
                System.out.println("請猜小一點");
            }else if (number < secret){
                System.out.println("請猜大一點");
            }else {
                System.out.println("恭禧！猜對了， 答案是：" + number);
                break;
            }
        }
        System.out.println();
        System.out.println("Game結束");




























    }

    public static void gameForGuess() {
        // 1 + 2 + ...+10 算式
        int sum = 0;
        for (int i = 1; i <=10; i++){
            sum = sum + i;
        }
        System.out.println(sum);

        //10 + 9 ...+ 1 算式
        for (int j = 10; j>=1; j--){
            sum = sum + j;
        }
        System.out.println(sum);

        Scanner scn = new Scanner(System.in);
        int secret = new Random().nextInt(10)+1;
        System.out.println(secret);
        for (int i=1; i <= 5; i++){
            System.out.println("Please enter the number (" + i + "/5) :");
            int number = scn.nextInt();
            System.out.println("這是第" + i + "次猜的數字" + number);
            if (number > secret){
                System.out.println("猜小一點");
            }else if (number < secret){
                System.out.println("猜大一點");
            }else {
                System.out.println();
                System.out.println("恭禧！猜對了， 答案是：" + number);
                break;
            }
        }
        System.out.println();
        System.out.println("-----結束猜數字遊戲-----");
    }


}
