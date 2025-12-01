package Example25;

public class Expressions {

    public static void main(String[] args) {
        boolean b = true;
        char c = 'C';
        double d = 16.18;
        int i = 7;
        String s = "Java";

        /*
         * i - 5 computes to integer value 2
         * IMPORTANT:
         * c -= 2 computes to c = c - 2, essentially performing the integer expression on c, and then recasting it to a char
         * this is for why this differs from doing println(c - 2)
         */
        System.out.println(c -= i - 5);

        /*
         * computes to 16.18 - 14, PEMDAS stuff,
         * 16.18 - 14 computes to the double 2.18, this is because operations between doubles and ints automatically get cast into a double,
         * since java doesn't want to lose the floating point
         */
        System.out.println(d - i * 2);

        /*
         * simplified: 16.18 < 7 == !true
         * computes to: false == false, which is true
         */
        System.out.println(d < i == !b);

        /*
         * simplified: 16 % 7
         * IMPORTANT: integer casting of a double omits the fraction, just rounds down every time
         * computes to 16 % 7, which is 2.
         */
        System.out.println((int) d % i);


        /*
         * computes to i = i - 1
         */
        System.out.println(--i);

        /*
         * computes to 16.18 + 4, same thing going on here as in 2), the double trumps
         * so computes to: 16.18 + 4.0, equaling 20.18
         */
        System.out.println(d + s.length());
    }
}
