package Example25;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String s = stdin.nextLine();

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i)); // Ath! ekki println
        }
    }
}
