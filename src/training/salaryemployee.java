package training;

import java.util.Scanner;
public class salaryemployee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary= 0.0, hours = 0.0, rate= 0.0;
        System.out.println("Enter Hours worked");
        hours = input.nextDouble();
        System.out.println("Enter Rate");
        rate = input.nextDouble();
        salary = hours * rate;
        System.out.println("Salary of Employee is %.2f" +salary);
    }
}