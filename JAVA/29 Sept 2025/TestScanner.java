import java.util.Scanner;

class TestScanner {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // accept integer
        System.out.println("Enter Integer:");
        int num = sc.nextInt();

        // accept float
        System.out.println("Enter float:");
        float f = sc.nextFloat();

        // consume leftover newline (important after nextInt/nextFloat)
        sc.nextLine();

        // accept string without spaces
        System.out.println("Enter string:");
        String s = sc.next();

        // accept string with spaces
        sc.nextLine(); // consume newline left by next()
        System.out.println("Enter a line (string with spaces):");
        String str1 = sc.nextLine();

        // output
        System.out.println("Integer: " + num);
        System.out.println("Float: " + f);
        System.out.println("String without spaces: " + s);
        System.out.println("String with spaces: " + str1);
        sc.close();
    }
}
