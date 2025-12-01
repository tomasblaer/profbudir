package Example25;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int count = 0;
        int[] arr = new int[7];

        int i = 0;
        int sum = 0;
        while (stdin.hasNextInt()) {
            int next = stdin.nextInt();
            arr[i] = next;
            sum += next;
            i++;
        }
        int median = sum/7;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < median) {
                count++;
            }
        }

        System.out.println(count);
    }
}
