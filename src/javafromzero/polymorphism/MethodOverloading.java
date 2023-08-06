package javafromzero.polymorphism;

/*
Same name
Same class
Different arguments
- no of arguments, sequence of arguments, type of arguments
  */


public class MethodOverloading {

    public void performOverloading(String a, int b) {
        System.out.println("performOverloading>>>>>>>>>>>");
    }

    public void performOverloading(String a) {
        System.out.println("performOverloading".concat(a));
    }


    public static void main(String args[]) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.performOverloading("completed");
        methodOverloading.performOverloading("param a", 11);
    }


}
