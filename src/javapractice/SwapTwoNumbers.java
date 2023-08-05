package javapractice;

public class SwapTwoNumbers {
    public static void main(String args[]) {

        //By using a third variable
        int a = 2;
        int b = 8;
        int c;

        c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);

        //Without using a third variable
        int x = 400;
        int y = 300;

        x=x+y;//30
        y=x-y;//10
        x=x-y;//20

        System.out.println(x);
        System.out.println(y);

    }
}
