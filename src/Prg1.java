/**
 *  Read 10 numbers from the console entered by the user and print the sum of those numbers.
 *  -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 *  -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read 10 numbers.
 *  -Use the nextInt() method to get the number and add it to the sum.
 *  -Before the user enters each number, print the message Enter number #x: where x represents the count, i.e. 1, 2, 3, etc.
 *  -For example, the first message printed to the user would be enter number #1:, the next Enter number #2:, and so on.
 *  Hint:
 *      -Use a while loop.
 *      -Use a counter variable for counting valid numbers.
 *      -Close the scanner after you don't need it anymore.
 *      -Create a class with the name ReadingUserInputChallenge.
 */

import java.util.Scanner;
public class Prg1 {

    static boolean anInt;
    static int i = 1;
    static int num = 0;
    static int total = 0;
    static Scanner reader = new Scanner(System.in);

    static void hasNextInt() {
        anInt = reader.hasNextInt(); //saved as a true or false in in anInt
        if (anInt) {
            num = reader.nextInt();
        } else {
            System.out.println("invalid number");

        }
    }



    static void nextInt(int num) {
            total = total + num;
               }


    public static void main(String[] args) {

        while (i <= 10) {
            System.out.println("enter " + i + " Value :");
            hasNextInt();
            nextInt(num);
            i++;
        }
        System.out.println(total);
    }
}