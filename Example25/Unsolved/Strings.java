package Example25.Unsolved;

public class Strings {

    public static String encode(String name) {
        String output = "";
        int index = 0;
        do {
            output += name.charAt(index);
            index = name.indexOf(' ', index) + 1;
        } while (index != 0);
        index = name.lastIndexOf(' ') + 1;
        while (output.length() < 3) {
            output += name.charAt(++index);
        }
        return output;

    }

    public static void main(String[] args) {

    }
}
