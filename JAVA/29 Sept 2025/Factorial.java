import java.util.Scanner;

class Factorial {
    // function for factorial
    static int Factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");

        int n = sc.nextInt();
        int ans = Factorial(n);
        System.out.println("Factorial is: " + ans);

        sc.close();
    }
}
