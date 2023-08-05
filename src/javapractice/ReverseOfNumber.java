package javapractice;

import java.util.Scanner;

public class ReverseOfNumber {
    public void doReverse(int number){

        int rev= 0;
        int rem;
        while (number!=0){
            rem=number%10;
            rev=rev*10+rem;
            number=number/10;
        }
        System.out.println(rev);
    }

    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter num");
        int number= scanner.nextInt();
        ReverseOfNumber reverseOfNumber= new ReverseOfNumber();
        reverseOfNumber.doReverse(number);
    }
}
