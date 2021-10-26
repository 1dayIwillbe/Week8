
import java.util.Scanner;

public class Prg2 {

    static int i = 1;

    public static void main(String[] args) {
        int highest = 0, lowest = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number to continue or Alphabet to end :");
        while (in.hasNextInt()) {
            System.out.println("Enter any number to continue or Alphabet to end :");
            int num = in.nextInt();

            if (i == 1) {
                highest = num;
                lowest = num;
                i++;
            } else {
                if (num > highest) {
                    highest = num;
                    i++;
                } else if (num < lowest) {
                    lowest = num;
                    i++;
                }
            }
        }
        System.out.println("User entered " + i + "values");
        System.out.println("highest number enter by user : " + highest);
        System.out.println("lowest number enter by user  : " + lowest);
    }
}