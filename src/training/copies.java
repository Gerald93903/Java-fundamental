package training;

import java.util.Scanner;

public class copies {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalcost = 0.0;
        int copies;
        System.out.println("Enter number copies");
        copies = input.nextInt() ;
        if (copies >=1 && copies <=100){
            totalcost  = copies*0.05;
            System.out.println("Total cost" + totalcost );
        }
        else if (copies >100){
            totalcost  = 100 *0.05 + ((copies -100) *0.3);
            System.out.println("Total cost" + totalcost );
        }
        else {
            System.out.println ("Invalid entry");
        }
    }
}