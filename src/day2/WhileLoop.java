package day2;

public class WhileLoop {
    public static void main(String[] args) {
        int count = 1;
        int total = 0;

        while (count <=3) {
            System.out.println("Count is " + count);
            total = total + count;
             count++ ;

        }
        System.out.println("Total is " + total);

    }
}
