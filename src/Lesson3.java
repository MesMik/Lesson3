import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        System.out.println("Task 1: Create an array and fill it with 2 number.");
        int[] array1 = new int[]{1, 3};

        System.out.println("Task 2: Create an array and fill it with numbers from 1:1000.");
        int[] array2 = new int[1000];

        for (int i = 0, x = 1; i < array2.length; i++, x++) {
            array2[i] = x;
        }

        System.out.println("Task 3: Create an array and fill it with odd numbers from -20:20");
        int[] array3 = new int[20];
        for (int i = 0, x = -19; x <= 20; i++, x = x + 2) {
            if (x % 2 != 0) {
                array3[i] = x;
            }
        }

        System.out.println("Task 4: Create an array and fill it. Print all elements which can be divided by 5.");
        int[] array4 = new int[]{12, 25, 64, 80, 45, 78, 155, 300};
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] % 5 == 0) {
                System.out.print(array4[i] + " ");
            }
        }
        System.out.println();

        System.out.println("Task 5: Create an array and fill it. Print all elements which are between 24.12 and 467.23.");
        double[] array5 = new double[]{33.58, 11.8, 656.2, 87.9, 118.54, 1999.0};
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] >= 24.12 && array5[i] <= 467.23) {
                System.out.print(array5[i] + " ");
            }
        }
        System.out.println();

        System.out.println("Task 6: Create an array and fill it. Print count of elements which can be divided by 2.");
        int[] array6 = new int[]{2, 54, 31, 87, 6, 12, 38, 95, 198, 63, 97};
        int countOfNumbers = 0;
        for (int i = 0; i < array6.length; i++) {
            if (array6[i] % 2 == 0) {
                countOfNumbers++;
            }
        }
        System.out.println(countOfNumbers);


        System.out.println("Task 7: Given an integer, 0< N < 21 , print its first 10 multiples.");
        System.out.println("Each multiple N x i (where 0<i<11) should be printed on a new line in the form: N x i = result.");

        Scanner m = new Scanner(System.in);
        System.out.println("Insert any number from 1 to 20");
        int x = m.nextInt();
        for (int i = 1; i < 11 ; i++) {
            if(x < 1 || x > 20){
                System.out.println("Wrong number: Please try again.");
                break;
            }
            System.out.println(x + " * " + i +  " = " +  x * i);
        }
    }
}




