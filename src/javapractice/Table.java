package javapractice;

import java.util.Scanner;

public class Table {
    private void printTable() {
        Scanner s = new Scanner(System.in);
        System.out.println(
                "enter number"
        );
        int num= s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }

    }

    public static void main(String[] args) {

        Table t = new Table();
        t.printTable();

    }
}
