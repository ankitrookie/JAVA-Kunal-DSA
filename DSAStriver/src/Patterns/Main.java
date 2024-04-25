package Patterns;

public class Main {
    public static void main(String[] args) {
        Main strg = new Main();
        strg.ninePattern(6);
    }

    public void firstPattern() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void secondPattern() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void thirdPattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
               System.out.print(j);
            }
            System.out.println();
        }
    }

    public void fourthPattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    // started this with index 1
    public void fifthPattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // started this with index 0
    public void sixthPattern() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // started this with index 1
    public void seventhPattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void eighthPattern(int n) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" "); // this line will print 4 spaces
            }
            for(int j = 0; j < 2 * i + 1; j++){
                // in first iteration it will -> 2 * 0 = 0; + 1 is 1 so it will print 1 stars
                // in second iteration i becoms 1 -> 2 * 1 = 2; + 1 is 3 it will print 3 stars
                System.out.print("*");
            }
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void ninePattern(int n) {
        for(int i = 0; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * n - (2 * i - 1); j++){
                // os in the first loop, n * n becoms 10; & 2 * i - 1 becoms -1; so as per mathamatic
                // double nagitive equivalent to a positive operation so 10 - -1 becoms => 11
                // next it become 9
                System.out.print("*");
            }

            for(int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // the next pattern number nine is combination of both seven and eight, so combine both
        // you will get below ans
        //         *
        //       * * *
        //     * * * * *
        //   * * * * * * *
        // * * * * * * * * *
        // * * * * * * * * *
        //   * * * * * * *
        //     * * * * *
        //       * * *
        //         *

        static void tenPattern(int n) {
            // this outer loop will print 9 rows = coz 2 * 5 = 10; & 10 - 1 = 9
            for (int i = 1; i <= 2 * n - 1; i++) {
                int stars = i;
                if (i > n) stars = 2 * n - i;
                // until our outer loop reches 6 it will not run if statements, after that it will start
                // minusing it with i index
                for (int j = 0; j < stars; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        static void elevenPattern(int n) {
            int start = 0;
            for(int i = 0; i < n; i++){
                start = i % 2 == 0 ? 1 : 0;
                for(int j = 0; j <= i; j++){
                    System.out.print(start);
                    start  = 1 - start;
                }
                System.out.println();
            }
        }

        // this below need ato be understood
    static void twelvePattern(int n) {
        int space = 2 *  (n-1);
        for(int i = 1; i  <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }

            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }

            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }

    static void thirteenPattern(int n) {
        int space = 2 *  (n-1);
        for(int i = 1; i  <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j); // in  first iteration this becoms 1
            }

            for(int j = 1; j <= space; j++){
                System.out.print(" "); // in first iteration 2 * (n-1) is  8 ;
                // so 8 will be the space in the first iteration
            }

            for(int j = i; j >= 1; j--){
                System.out.print(j); // in first iteration this becoms 1
            }
            System.out.println();
            space -= 2;
        }
    }
}

