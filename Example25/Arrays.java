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

    public static void readArray() {
        Scanner stdin = new Scanner(System.in);
        int[] arr = new int[10]; // 10 staka fylki, ef það fæst gefið

        for (int i = 0; i < arr.length; i++) {
            int value = stdin.nextInt();
            arr[i] = value;
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
