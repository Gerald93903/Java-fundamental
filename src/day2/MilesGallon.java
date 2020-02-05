package day2;

import java.util.Scanner;

public class MilesGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Miles, Gallons;
        double MilesPerGallon = 0, totalAll = 0;
        System.out.println("Enter Mile");
        Miles   = input.nextInt();
        System.out.println("Gallon");
        Gallons  = input.nextInt();

        while ( Miles  != 999){
            MilesPerGallon = Miles/Gallons ;
            System.out.println("Miles Per Gallons is" +MilesPerGallon );
            totalAll = totalAll + MilesPerGallon ;
            System.out.println("Enter Miles");
            Miles = input.nextInt();
        }
        System.out.println("Total for All Miles and Gallons  is" +totalAll  );
    }
}
