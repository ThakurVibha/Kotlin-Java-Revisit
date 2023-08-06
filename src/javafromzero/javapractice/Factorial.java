package javafromzero.javapractice;

import java.util.Scanner;

public class Factorial {
    public void findFact(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter num");
        int num= s.nextInt();
        int fact=1;
        for(int i=1; i<=num; i++){
            fact= fact*i;
        }
        System.out.println(fact);
    }


    public static void main(String args[]){

        Factorial factorial=new Factorial();
        factorial.findFact();


    }
}
