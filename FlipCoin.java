package com.bridgelabz;
import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args)
    {
        int heads = 0;
        int tails = 0;
        int counter = 1;
        double randNum = 0.0;
        Scanner n = new Scanner(System.in);

        System.out.println("How many times will the coin be flipped? ");
        int flips = n.nextInt();

        while(counter <= flips)
        {
            randNum = Math.random();
            System.out.print(counter + " " + randNum);

            if(randNum < .5)
            {
                heads++;
                System.out.println(" - heads");
            }
            else
            {
                tails++;
                System.out.println(" - tails");
            }
            counter++;
        }
        System.out.println();
        System.out.println("Number of Heads = " + heads);
        System.out.println("Number of Tails = " + tails);

        double percentHeads = (double)heads/flips*100;
        double percentTails = (double)tails/flips*100 ;

        System.out.println("percentage of Heads = " +percentHeads);
        System.out.println("percentage of Tails = " +percentTails);

    }

}

