package training;
import java.util.Scanner;
public class radius {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       int radius;
       double diameter,circumference,area;
       final double pie = 3.14159;

       System.out.println("Enter radius");
        radius= input.nextInt();

       diameter = 2*pie;
       circumference = 2*pie*radius ;
       area = pie*radius*radius;

       System.out.printf("diameter is "+diameter );
       System.out.printf(" circumference is "+circumference );
       System.out.printf("Area is " + area );




    }
}
