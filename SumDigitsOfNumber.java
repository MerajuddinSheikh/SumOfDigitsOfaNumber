package sumofdigits;

import java.util.Scanner;

public class SumDigitsOfNumber {
    public static void main(String[] args) {

        // Declaring Variables.

        int x, y, sum = 0;
        //Taking User Inputs
        Scanner Scan = new Scanner(System.in);
        System.out.println("enter the number");
        x = Scan.nextInt();
        while (x > 0) {
            y = x % 10;
            sum = sum + y;
            x = x / 10;

        }

        System.out.println("The sum of digits of a number is " + sum);


    }
}
