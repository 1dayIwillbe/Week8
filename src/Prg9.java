import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Prg9 {
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter Number for Fibonacci Series:");
            int n = reader.nextInt();
            reader.close();
            int firstTerm = 0, secondTerm = 1;
            System.out.println("Fibonacci Series till " + n + " terms:");
            //run for loop until given number:
            for (int i = 1; i <= n; ++i) {
                System.out.print(firstTerm + ", ");

                // compute the next term
                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
    }


