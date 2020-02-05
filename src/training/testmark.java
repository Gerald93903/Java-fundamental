package training;

import java.util.Scanner;

public class testmark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int marks = 0;
        System.out.println("Enter test marks");
        marks = input.nextInt();

        if (marks >=0 && marks < 50){
            System.out.println("Fail");
        }
        if (marks >= 50 && marks <=100){
            System.out.println("pass");
        }
    }
}
