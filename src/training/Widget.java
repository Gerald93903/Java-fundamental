package training;

import java.util.Scanner;

public class Widget {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int widget; double cost = 0;
        System.out.println("Enter number of widgets");
        widget = input.nextInt();

        if (widget > 0  && widget < 100 ){
            cost = widget *0.25;
            System.out.println("Total cost" + cost );
        }
        if (widget >=100 ){
            cost = widget *0.20;
            System.out.println("Total cost" + cost );
        }




    }
}
