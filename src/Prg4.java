import java.util.Scanner;

public class Prg4 {
    static int sum;
    static int number;

    public static int  sumDigits(int number) {
        if (number < 10) return -1;
        else
            return getSum(number);
    }
            static int getSum(int n)
        {
            int sum = 0;

            while (n != 0) {
                sum = sum + n % 10;
                n = n / 10;
            }

            return sum;
        }


// main method;
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Number :");
        number = reader.nextInt();
        System.out.println("Total of given number is :" +sumDigits(number));
    }
}
