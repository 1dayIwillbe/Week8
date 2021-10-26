/**
 * Here are the 8 steps involved in a program for Armstrong number.
 *
 *  1. The number of digits in num is determined and found out.
 *
 *  2. The sum of digits of a number in Python or individual digit sums are got by performing num mod 10, where mod is called the remainder operation.
 *
 *  3. The individual digit is then raised to the power (number of digits) and stored.
 *
 *  4. The number is then divided by 10 in order to obtain the second digit.
 *
 *  5. All the above 3-steps numbered Steps 2, 3 and 4 are performed until the value of num is greater than 0.
 *
 *  6. When the num is less than 0, end the while loop.
 *
 *  7. Check the sum obtained or Armstrong value is the same as the original number
 *
 *  8. When yes, the number is labelled an Armstrong number
 */

import java.util.Scanner;

public class Prg10 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number to check for ArmStrong number :");
        int number = reader.nextInt();
        int length = String.valueOf(number).length();
        //System.out.println(length);
        reader.close();

        int originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, length);
            originalNumber /= 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}

