package abstraction.byabstractclass;

abstract public class AbstractionExample {

    public abstract void doAbstractTask();

    public static void main(String args[]) {
        // we can not create object of abstract class hence
        AbstractExample2 abstractExample2 = new AbstractExample2();
        abstractExample2.doAbstractTask();

        AbstractExample3 abstractExample3 = new AbstractExample3();
        abstractExample3.doAbstractTask();

    }
}

class AbstractExample2 extends AbstractionExample {

    @Override
    public void doAbstractTask() {
        System.out.println("AbstractExample2");

    }
}

class AbstractExample3 extends AbstractionExample {

    @Override
    public void doAbstractTask() {
        System.out.println("AbstractExample3");

    }
}

