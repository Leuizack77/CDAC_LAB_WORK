class TestPrintTable {
    // prints table of number
    public static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    public static void main(String args[]) {
        if (args.length <= 0) {
            System.out.println("Error: Pass 1 parameter");
        } else {
            int n = Integer.parseInt(args[0]);
            System.out.println("Table of " + n + ":");
            printTable(n); // function call to print table
        }
    }
}
