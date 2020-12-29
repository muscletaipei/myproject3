package com.test.game;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Random random = new Random();
        int secret = random.nextInt(10)+1 ;
        System.out.println(secret);
        Scanner scn = new Scanner(System.in);
        int number = 0;
        while (number != secret){
            System.out.print("Please enter the number: ");
            number = scn.nextInt();
            System.out.println(number);
            if (number > secret){
                System.out.println("猜小一點");
            }else if (number < secret){
                System.out.println("猜大一點");
            }else {
                System.out.println("答案是" + secret + "\t恭禧猜中了！");
            }
        }

    }
}
