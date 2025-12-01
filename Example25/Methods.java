package Example25;

public class Methods {

    /*
     * Pass by value hér, copy af vals úr a og b,
     * þ.a.l. ekki hægt að reassigna
     */
    public static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
    }
    /*
     * Pass by reference hér, alltaf hægt að breyta contents, en ekki reassigna
     */
    public static void swap(int[] a, int[] b) {
        int[] c = a;
        a = b;
        b = c;
    }
    /*
     * Pass by reference hér, alltaf hægt að breyta contents, en ekki reassigna
     */
    public static void swap(int[] arr, int a, int b) {
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }

    public static void main(String[] args) {
        int m = 4;
        int n = 2;
        swap(m, n);
        System.out.println(m + ", " + n);

        int[] p = {1, 2, 3};
        int[] q = {4, 5, 6};
        swap(p, q);
        System.out.println(p[0] + ", " + q[0]);

        int[] r = {7, 8, 9};
        swap(r, 0, 1);
        System.out.println(r[0] + ", " + r[1]);
    }
}
