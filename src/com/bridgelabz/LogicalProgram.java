package com.bridgelabz;

import java.util.Scanner;

public class LogicalProgram {

    public void couponNumber(){
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789".toCharArray();
        int max = 100000000;
        double d = Math.random();
        int random = (int) (d * max);
        String stringbuffer = "";
        System.out.println("Random double " + d + " random at start " + random);

        while (random > 0) {
            stringbuffer = stringbuffer + (chars[random % chars.length]);
            random /= chars.length;
            System.out.println(random + "  " + random % chars.length + " String Buffer  is " + stringbuffer);
        }

        String couponCode = stringbuffer.toString();
        System.out.println("Coupon Code: " + couponCode);
    }
    public void fiboncciSeries(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int n1 = 0, n2 = 1, n3 = 0;
        System.out.print(n1 + "\n" + n2+"\n");

        for (int i = 2; i < num; i++)
        {
            n3 = n1 + n2;
            System.out.println("" + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public static void main(String[] args) {
        System.out.println("Logical Program");
        LogicalProgram logicalProgram = new LogicalProgram();
        System.out.println("Coupon Number Program");
        logicalProgram.couponNumber();
        System.out.println("Fibonacci Series  Program");
        logicalProgram.fiboncciSeries();

    }
}
