package abstraction.byinterface;

public class AbstractionByInterface implements Interface {


    @Override
    public void show() {
        System.out.println("AbstractionByInterface");
    }

    public static void main(String args[]){
        AbstractionByInterface abstractionByInterface=new AbstractionByInterface();
        abstractionByInterface.show();

    }
}
