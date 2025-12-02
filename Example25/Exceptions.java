package Example25;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        while (stdin.hasNextLine()) {
            try {
                int input = stdin.nextInt(); // her getur komid villa, færir okkur yfir i catch blockinn
                if (input < 100) {
                    System.out.println(input * input);
                    return;
                }
            } catch (Exception ignored) {
                stdin.nextLine(); // ef villa þurfum við að færa scannerinn a næstu linu
            }
        }
    }

    public void doThing() throws NumberFormatException {

        Scanner stdin = new Scanner(System.in);

        while (stdin.hasNextLine()) {
            int input = stdin.nextInt(); // her getur komid villa, færir okkur yfir i catch blockinn
            if (input > 100) {
                throw new NumberFormatException("Engar tölur yfir 100");
            }
        }

    }
}
