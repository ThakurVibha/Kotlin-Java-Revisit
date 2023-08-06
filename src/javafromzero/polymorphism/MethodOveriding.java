package javafromzero.polymorphism;


//same name, same params, different class and javafromzero.inheritance

public class MethodOveriding {
    public void performOveriding() {
        System.out.println(
                "performOveriding"
        );
    }

}

class MethodOveriding2 extends MethodOverloading {

    public void performOveriding() {
        System.out.println(
                "MethodOveriding2 performOveriding"
        );
    }

    public static void main(String args[]) {

        MethodOveriding2 methodOveriding2 = new MethodOveriding2();
        methodOveriding2.performOveriding();
        MethodOveriding methodOveriding=new MethodOveriding();
        methodOveriding.performOveriding();

    }

}