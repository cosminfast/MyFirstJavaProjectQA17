package lab2.AnimalRescue;

public class AppMain {

    public static void main(String[] args) {

        Dog rex = new Dog();
        System.out.println(rex.name);

        rex.name = "Rex";

        rex.bark();

        Dog rexa = new Dog();
//        rexa.name = "Rexa";
        System.out.println(rexa.name);

    }
}
