package objectinitialisation;

    public class ByRefVariable {
        String color;
        Integer age;

        String breed;

        public static void main(String args[]) {
            ByRefVariable buzo = new ByRefVariable();

            buzo.age = 12;
            buzo.color = "brown";
            buzo.breed = "Golden Reteriver";
            System.out.println(buzo.color);
            System.out.println(buzo.breed);
            System.out.println(buzo.age);


        }
}
