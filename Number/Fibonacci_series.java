package Number;

public class Fibonacci_series {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println(fib(i));
            sum = fib(i) + sum;
        }
        System.out.println("sum of series: " + sum);
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }

    }

}
