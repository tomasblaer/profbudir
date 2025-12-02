package Example25;

public class Programming {

    private static void programming(int mm) {
        /*
         * Runtime error, compiler will let you run this, but this will throw an exception at runtime
         */
        double m1 = mm / 0;

        /*
         * Logic error, compiler won't let you run integer divison and assign to double
         */
        double m2 = mm / 1000;

        /*
         * Syntax error, == can not be used as an assignment
         * boolean m3 == mm / 1000;
         */

//        double m3 == mm / 1000;

        /*

         * No error
         */
        double m4 = mm / 1000.0;
    }


    public static void main(String[] args) {
        programming(2);
    }
}
