import java.util.Scanner;

class MaxNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if ((n1 == n2) && (n1 == n3)) {
            System.out.println("Nums are Equal");
        } else if ((n1 > n2) && (n1 > n3)) {
            System.out.println("n1 is greater: " + n1);
        } else if ((n2 > n1) && (n2 > n3)) {
            System.out.println("n2 is greater: " + n2);
        } else {
            System.out.println("n3 is greater: " + n3);
        }

        sc.close(); 
    }
}
