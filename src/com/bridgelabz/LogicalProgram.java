package com.bridgelabz;

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
            System.out.println(random + "  " + random % chars.length + " string Buffer  is " + stringbuffer);
        }

        String couponCode = stringbuffer.toString();
        System.out.println("Coupon Code: " + couponCode);
    }
    public static void main(String[] args) {
        System.out.println("Logical Program");
        LogicalProgram logicalProgram = new LogicalProgram();
        logicalProgram.couponNumber();
    }
}
