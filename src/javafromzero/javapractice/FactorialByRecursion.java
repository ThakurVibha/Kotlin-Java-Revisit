package javafromzero.javapractice;

import java.util.Scanner;

public class FactorialByRecursion {
    public void calFactorial(int num){
        if(num>=1){
            fact=fact*num;
            calFactorial(num-1);
        }
    }
    static int fact =1;
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=s.nextInt();
        FactorialByRecursion factorialByRecursion=new FactorialByRecursion();
        factorialByRecursion.calFactorial(num);
        System.out.println(fact);
    }
}
