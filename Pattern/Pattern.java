package Pattern;

public class Pattern {

    static void pattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern4() {
        for (int i = 0; i <= 5*2; i++) {
            int colinrow = i > 5 ? 2 * 5 - i : i;
            for (int j = 0; j < colinrow; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern4();
    }
}
