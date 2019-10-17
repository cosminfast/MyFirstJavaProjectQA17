package lab4.AnimalRescue;

public class Dog extends Animal{

    private String teeth;

    public String getTeeth() {
        return teeth;
    }

    public void setTeeth(String teeth) {
        this.teeth = teeth;
    }


    public void bark() {
        System.out.println("woof!");
    }

    public void run() {
        System.out.println("Running...");
    }

    public void sleep() {
        System.out.println("zzzZZZzz...");
    }


}
