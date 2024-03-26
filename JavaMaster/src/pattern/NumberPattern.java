package pattern;

public class NumberPattern {
    public static void main(String[] args) {
        System.out.println("//////////////pattern 1");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || j == 0 || i == 4 || j == 4) {
                    System.out.print(3 + " ");
                } else if (i == 1 || j == 1 || i == 3 || j == 3) {
                    System.out.print(2 + " ");
                } else {
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }

        System.out.println("//////////////pattern 2");
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("//////////////pattern 3");
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("//////////////pattern 4");
        for (int i = 1; i < 6; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("//////////////pattern 5");
        for (int i = 1; i < 6; i++) {
            for (int k = 4; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("//////////////pattern 6");
        for (int i = 1; i < 6; i++) {
            for (int k = 4; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("//////////////pattern 7");
        for (int i = 1; i < 6; i++) {
            for (int k = 4; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("//////////////pattern 8");
        for (int i = 5; i >= 1; i--) {

            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("//////////////pattern 9");
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
        }
        System.out.println("//////////////pattern 10");
        for (int i = 1; i <= 4; i++) {
            for (int k = 3; k >= i; k--) {
                System.out.print(" ");

            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int h = 2; h <= i; h++) {
                System.out.print(h);
            }
            System.out.println();
        }
        System.out.println("//////////////pattern 11");
        int b = 0;
        for (int i = 1; i <= 4; i++) {
            for (int k = 3; k >= i; k--) {
                System.out.print(" ");

            }
            for (int j = 1; j <=(i + b); j++) {
                System.out.print(j);
            }
            b++;
            System.out.println();
        }
    }
}
