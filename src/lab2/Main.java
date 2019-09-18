package lab2;

public class Main {

    public static int memberVariable = 3;

    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        // Tipuri de date
//        String rasa = "Ciobanesc german";
//        String culoare = "maro";
//        byte varsta = 2;
//        float greutate = 23.5f;
//        char gen = 'f';
//        int nivelInteligenta = 1231231231;
//        long nivelEnergie = 435678876546754123L;
//        double nivelNevoieAtentie = 1823918238128d;
//        byte aaaa = 127;
//
//        short za = 222;
//        short ads = 123;
//        short aaa = (short) (za + ads);
//        System.out.println("Despre catelul meu: ");
//        System.out.println("culoare este " +
//                culoare +
//                ", \nvarsta este " +
//                varsta +
//                " si greutatea este " +
//                greutate);


//        x += y; // x = x + y;
//        x -= y; // x = x - y;
//        x += 2; // x = x + 2;
//        x += x += x++ + ++x;
//
//        System.out.println("Numbers: " + x);
//        System.out.println("Numbers: " + y);
//        System.out.println("Numbers: " + y + x);
        // test

        int x = 3;
        int y = 5;
        float result = sum(x, y);
        System.out.println(result);

        result = substract(x, y);

        float qq = result*result;
        System.out.println(qq);


        System.out.println(result);
    }

    public static int sum(int first, int second) {
        int rez = first + second;
        return rez;

    }

    public static int substract(int first, int second) {
        return first - second;
    }
}
