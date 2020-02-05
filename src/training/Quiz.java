package training;

import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String quiz;

        System.out.println("Who was the first Roland McDonald");
        quiz = input.next();
        if (quiz.equalsIgnoreCase("Willard Scott")) {
            System.out.println("Correct");
        }
        else {
            System.out.println("Nice try");


        }

        }
    }

