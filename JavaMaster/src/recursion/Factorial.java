package recursion;

public class Factorial {
    public static void main(String args[]) {
        int num = 3;
        int i = 1;
        int sum = 1;

        while (i <= num) {
            sum = sum * i;
            i++;
        }

        System.out.println("factorial of " + num + "=" + sum);

        //using recursion

        System.out.println(fact(num));

    }

    private static int fact(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * fact(num - 1);
    }
}
