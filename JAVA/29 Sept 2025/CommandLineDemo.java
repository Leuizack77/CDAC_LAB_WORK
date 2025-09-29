import java.util.Scanner;

class CommandLineDemo {
    public static void main(String args[]) {
        System.out.println("No. of Arguments: " + args.length);

        if (args.length <= 0) {
            System.out.println("Error: Pass atleast one paramenter");
        }
        else {
            for (int i=0; i<args.length; i++) {
                System.out.println("Hello:" + args[i]);
            }
        }
    }
}