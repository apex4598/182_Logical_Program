package com.bridgelabz;

import java.util.Scanner;

public class SwapNibble {
    static boolean isPowerOfTwo(int k)
    {
        if (k == 0) {
            return false;
        }

        while (k != 1) {
            if (k % 2 != 0)
                return false;
            k = k / 2;
        }
        return true;
    }
    static int swapNibbles(int k) {

        int right = (k & 0b00001111);
        right= (right<<4);
        int left = (k & 0b11110000);
        left = (left>>4);
        return (right | left);
    }
    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Binary.toBinary(number);

        SwapNibble sn = new SwapNibble();
        int k = sn.swapNibbles(number);
        System.out.println("After swapping the number is "+k);

        System.out.println("Checking the resultant number is power of two or not ");
        if (isPowerOfTwo(k)) {
            System.out.println("Yes, its power of 2");
        }
        else {
            System.out.println("No, its not a power of 2");
        }
    }
}
