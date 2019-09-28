package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // overflow
        System.out.println("Busted MIN value = " + (myMinIntValue - 1)); // underflow

        int myMaxIntTest = 2_147_483_647; // acceptable in Java 7 and higher
        // wrapper class (Integer)

        byte myMinByteVal = Byte.MIN_VALUE;
        byte myMaxByteVal = Byte.MAX_VALUE;

        System.out.println("Byte Minimum val = " + myMinByteVal);
        System.out.println("Byte Maximum val = " + myMaxByteVal);

        short myMinShortVal = Short.MIN_VALUE;
        short myMaxShortVal = Short.MAX_VALUE;

        System.out.println("Short Minimum val = " + myMinShortVal);
        System.out.println("Short Maximum val = " + myMaxShortVal);

        long myLongValue = 100L;

        long myMinLongVal = Long.MIN_VALUE;
        long myMaxLongVal = Long.MAX_VALUE;

        System.out.println("Long Minimum val = " + myMinLongVal);
        System.out.println("Long Maximum val = " + myMaxLongVal);

        long longLiteralVal = 922337203685477580L;
        System.out.println(longLiteralVal);


    }
}
