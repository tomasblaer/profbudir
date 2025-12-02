public class Swap {

    private static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println(a);
    }

    public static void main(String[] args) {

        int m = 4;
        int n = 2;
        swap(m, n);

        System.out.println(m + ", " + n);

    }
    /*
     * Yfirskrifar gildi:
     * int[] fylki[0] = nyttValue
     * Object.setValue(nyttValue)
     *
     * Ekki virka:
     * int[] fylki = nyttValue
     * gildi = nyttValue
     * Object = nyttValue
     */
}
