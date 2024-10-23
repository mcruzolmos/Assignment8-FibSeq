import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number greater than zero");
        int n = scanner.nextInt();

        int fibNum = fib(n);
        System.out.println("Fibonacci number is: " +fibNum);

        scanner.close();
    }

    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2); 
    }
    
}
