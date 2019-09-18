package lab1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Tipuri de date
        String rasa = "Ciobanesc german";
        String culoare = "maro";
        byte varsta = 2;
        float greutate = 23.5f;
        char gen = 'f';
        int nivelInteligenta = 1231231231;
        long nivelEnergie = 435678876546754123L;
        double nivelNevoieAtentie = 1823918238128d;
        byte aaaa = 127;

        short za = 222;
        short ads = 123;
        short aaa = (short) (za + ads);
        System.out.println("Despre catelul meu: ");
        System.out.println("culoare este " +
                culoare +
                ", \nvarsta este " +
                varsta +
                " si greutatea este " +
                greutate);


        int x = 2;
        int y = 3;
        int sum = x + y;
        float average = sum + 2f;

        x += y; // x = x + y;
        x -= y; // x = x - y;
        x += 2; // x = x + 2;
        x += x += x++ + ++x;

        System.out.println("Numbers: " + x);
        System.out.println("Numbers: " + y);
        System.out.println("Numbers: " + y + x);
        // test

    }

}
