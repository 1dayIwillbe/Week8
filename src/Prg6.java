import java.util.Scanner;

/**
 * . Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */

public class Prg6 {

//main method
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter value:");
        int num = reader.nextInt();

        //run for loop until enter value
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    reader.close();
    }

}
