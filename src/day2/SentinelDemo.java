package day2;

import java.util.Scanner;
public class SentinelDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantity= 0;
        int product;
        double RetailPrice = 0, total = 0;
        System.out.println("Enter product number ");
        product = input.nextInt();


        while (product != -999)
            switch (product) {
                    case 1:
                        RetailPrice = 2.98 * quantity ;
                        System.out.println(" Retail price \tR%2f " +RetailPrice);
                        break;
                    case 2:
                        RetailPrice = 4.50 * quantity;
                        System.out.println(" Retail price \tR%2f " +RetailPrice);
                        break;
                    case 3:
                        RetailPrice = 3.98 * quantity;
                        System.out.println(" Retail price \tR%2f " +RetailPrice);
                        break;
                    case 4:
                        RetailPrice = 4.49 * quantity;
                        System.out.println(" Retail price \tR%2f " +RetailPrice);
                        break;
                    case 5:
                        RetailPrice = 6.87 * quantity;
                        System.out.println(" Retail price \tR%2f " +RetailPrice);
                        break;
                    default:
                        System.out.println("Invalid product");


                }
        total = total + RetailPrice ;
        System.out.println("Total price is " + total);
        System.out.println("Enter product number ");
        product = input.nextInt();

        if (product == -999 && total  <= 0){
                System.out.println("Thanks for using application");
                System.exit(0 );
            }
        else {
                System.out.println("\nTotal is "+ total);
            }


        }


    }
