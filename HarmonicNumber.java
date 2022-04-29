package com.bridgelabz;
import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.println("Please enter Number ");
        int num = n.nextInt();
        double result = 0.0;

        System.out.println("The harmonic series is: ");

        // printing the harmonic series till num value
        // using while loop
        while (num > 0) {
            result = result + (double)1 / num;
            // after calculating harmonic value
            // decrementing num by 1 which means the common
            // difference is 1
            num--;
            System.out.print(result + ", ");
        }
    }
}
