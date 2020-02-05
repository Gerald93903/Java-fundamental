package training;

import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        int num1 = 0,num2 = 0,product = 0;
        Scanner input = new Scanner (System.in);

        System.out.println("Enter First integer");
        num1 = input .nextInt() ;
        System.out.println("Enter second integer");
        num2 = input .nextInt() ;

        product = num1 *num2 ;
        System.out.println("Product is "+ product );

    }


}
