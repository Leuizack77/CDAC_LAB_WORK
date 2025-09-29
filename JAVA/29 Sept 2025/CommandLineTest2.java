class CommandLineTest2 {
    public static void main(String args[]) {
        System.out.println("No. of Arguments: " + args.length);

        if (args.length <= 0) {
            System.out.println("Error: Pass atleast one parameter");
        } else {
            int sum = 0;
            for (int i = 0; i < args.length; i++) {
                sum = sum + Integer.parseInt(args[i]);
                System.out.println("Running Sum after arg[" + i + "] = " + sum);
            }
            System.out.println("Final Sum is: " + sum);
        }
    }
}
