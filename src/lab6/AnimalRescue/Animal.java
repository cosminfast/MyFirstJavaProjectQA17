package lab6.AnimalRescue;

public abstract class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sleep();

    public abstract void eat();

    public abstract void speak();
}
