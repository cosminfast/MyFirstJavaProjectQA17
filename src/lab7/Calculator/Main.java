package lab7.Calculator;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Read read = new Read();

       int a = read.getInt();


        System.out.println("Asta e valoarea: " + a);


    }
}
