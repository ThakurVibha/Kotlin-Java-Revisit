package staticmembers;


class StaticExample {
   // Static Variables:
  //  Static variables, also known as class variables, are variables that are associated with the class
   //  rather than with specific instances of the class
    static int staticVar = 10;

    static void staticMethod() {
        System.out.println("Static method");
    }

    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        System.out.println(StaticExample.staticVar); // Accessing static variable
        StaticExample.staticMethod(); // Calling static method
    }
}

