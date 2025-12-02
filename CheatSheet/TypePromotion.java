package CheatSheet;

public class TypePromotion {
    public static void main(String[] args) {
        // int <expression> double = double
        System.out.println(1 + 2.4);

        // int <expression> char = int
        System.out.println(1 + 'C');

        // String + anything = String
        System.out.println("Tómas" + 123);
        System.out.println("Tómas" + 1.23);

        // ATH!
        char c = 'C';
        System.out.println(c += 1);
    }
}
