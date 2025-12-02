package Example25.Unsolved;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int[] arr = new int[7];
        int sum = 0;

        for (int i = 0; i < 7; i++) {
            int number = stdin.nextInt();
            arr[i] = number;
            sum += number;
        }


        int first = arr[0];
        int count = 0;
        for (int j = 0; j < 7; j++) {
            int value = arr[j];
            if (value > first) {
                count++;
            }
        }

        System.out.println(count);

    }
}
