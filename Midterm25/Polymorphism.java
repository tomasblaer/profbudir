package Midterm25;

public class Polymorphism {

    public static int countBiggerThan(Comparable[] comparables, Comparable comparable) {
        int count = 0;
        for (int i = 0; i < comparables.length; i++) {
            int val = comparables[i].compareTo(comparable);
            if (val > 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
