package training;

import java.util.Scanner;
public class bagel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bagel;
        double  totalCost = 0;
        System.out.println("Enter number of bagel");
        bagel = input.nextInt();
        if (bagel >= 1 && bagel < 6) {
            totalCost = bagel * 0.75;
            System.out.println("Total cost" +totalCost );
        }
        if (bagel >= 6) {
            totalCost = bagel * 0.6;
            System.out.println("Total cost" +totalCost );


        }

    }
}