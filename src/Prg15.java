/**
 * Display left angle triangle of * using nested for loops
 *          *
 *        * *
 *      * * *
 *    * * * *
 *  * * * * *
 */

public class Prg15 {

    public static void main(String[]args)
    {
        System.out.println("Left Angle Triangle :");
        for(int i=1; i<=7; i++)
        {
            for(int k=1; k<=7-i+1; k++)
            {
                System.out.print(" ");
            }
            int num = 1;
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
                num++;
            }
            System.out.println();
        }
    }


}
