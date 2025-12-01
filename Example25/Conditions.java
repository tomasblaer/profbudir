package Example25;

import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int x1 = stdin.nextInt();
        int y1 = stdin.nextInt();

        int x2 = stdin.nextInt();
        int y2 = stdin.nextInt();

        int inX = stdin.nextInt();
        int inY = stdin.nextInt();

        if (inX >= Math.min(x1, x2) && inX <= Math.max(x1, x2)) {
            if (inY >= Math.min(y1, y2) && inY <= Math.max(y1, y2)) {
                System.out.println("in");
                return;
            }
        }
        System.out.println("out");
    }
}
