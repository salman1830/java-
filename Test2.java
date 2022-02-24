package test2;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        int[] sm_array = new int[5];
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the elements of the array: ");
        for (int x = 0; x < 5; x++) {
            sm_array[x] = in.nextInt();
        }

        for (int x = 0; x < sm_array.length; x++) {
            boolean isPrime = true;

            for (int y = 2; y < x; x++) {

                if (x % y == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(" the prime numbers in the array " + x);
            }

        }

    }

}
