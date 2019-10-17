package lab4.AnimalRescue;

public class AppMain {

    public static void main(String[] args) {

        Dog rex = new Dog();
        rex.setName("Rex");

        rex.bark();

        GermanSheppard germy = new GermanSheppard();
        germy.setTeeth("YEs");
        germy.setName("Germy");
        germy.setColor("Brown");

        GermanSheppard heindrich = new GermanSheppard();
        heindrich.bark();
    }
}
