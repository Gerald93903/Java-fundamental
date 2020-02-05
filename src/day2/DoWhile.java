package day2;

public class DoWhile {
    public static void main(String[] args) {
        int count = 1;
        int total = 0;

         do {
            System.out.println("Count is " + count);
            total = total + count;
            count++ ;

        }
         while (count <=3);
        System.out.println("Total is " + total);

    }
}
