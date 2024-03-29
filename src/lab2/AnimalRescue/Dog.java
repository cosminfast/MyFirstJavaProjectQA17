package lab2.AnimalRescue;

public class Dog {

    private String color ;
    private String breed ;
    private float weight ;
    private float age ;
    private char gender ;
    private String name ;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }




    public void setName(String name){
        this.name = name;
    }


    public String getName(){
        return name;
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
