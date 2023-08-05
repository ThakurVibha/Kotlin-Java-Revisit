package inheritance;

public class Doctor implements DoctorInterface1, DoctorInterface2 {

    public void doOperation() {
        System.out.println("Operation in progress");
    }

    @Override
    public void doChemo() {
        System.out.println("Chemo in progress");
    }

    @Override
    public void doCardiacSergory() {
        System.out.println("CardiacSergory in progress");

    }

    @Override
    public void doOpenHeartSurgory() {
        System.out.println("OpenHeartSurgory in progress");

    }

    @Override
    public void doLungOperation() {
        System.out.println("LungOperation in progress");

    }

    public static void main(String args[]) {
        Doctor doctor =new Doctor();
        doctor.doOperation();
        doctor.doChemo();
        doctor.doCardiacSergory();
        doctor.doOpenHeartSurgory();
        doctor.doLungOperation();
    }

}