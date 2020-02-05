package training;
import java.util.Scanner;
public class profit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double revenue,cost,profit;
        System.out.println("Enter Revenue");
        revenue = input.nextDouble();
        System.out.println("Enter Cost");
        cost = input.nextDouble();
        profit = revenue - cost;
        System.out.println("The profit is"+profit);

    }
}
