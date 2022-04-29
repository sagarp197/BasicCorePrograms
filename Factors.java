package com.bridgelabz;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        int i,fact=1;

        System.out.println("Please enter Number to calculate factorial :");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();

        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is: "+fact);
    }
}
