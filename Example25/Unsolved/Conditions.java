package Example25.Unsolved;

import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int x1 = stdin.nextInt();
        int y1 = stdin.nextInt();

        int x2 = stdin.nextInt();
        int y2 = stdin.nextInt();

        int x3 = stdin.nextInt();
        int y3 = stdin.nextInt();

        int left = Math.min(x1, x2);
        int right = Math.max(x1, x2);

        int bottom = Math.min(y1, y2);
        int top = Math.max(y1, y2);

        if (x3 >= left && x3 <= right) {
            if (y3 >= bottom && y3 <= top) {
                System.out.println("in");
                return;
            }
        }
        System.out.println("out");
    }
}
