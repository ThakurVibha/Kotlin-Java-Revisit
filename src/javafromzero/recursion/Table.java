package javafromzero.recursion;

public class Table {

    void printable(int num, int multiplier) {
        if (multiplier <= 10) {
            System.out.println(num * multiplier);
            printable(num, multiplier + 1);

        }

    }

    public static void main(String args[]) {
        Table table = new Table();
        table.printable(4, 1);
    }
}
