package lab7.Calculator;

public class Program {


    public void printMenuItems() {
        System.out.println(
                "Hello !\n" +
                        "Choose an option from the menu: \n" +
                        "0. Exit\n" +
                        "1. Sum\n" +
                        "2. Substract\n"
        );
    }

    Calculator calc = new Calculator();
    Read read = new Read();

    public boolean runProgramOptions() {
        printMenuItems();

        int numberFromUser = read.getInt();

        switch (numberFromUser) {
            case 1:
                sum();
                return true;
            case 2:
                substract();
                return true;

            case 0:
                System.out.println("Bye!");
                break;

            default:
                System.out.println("The option does not exist, try again!");
                return true;
        }
        return false;


    }

    public void runProgram() {
        boolean repeat;
        do {
            repeat = runProgramOptions();

        } while (repeat == true);
    }

    public void sum(){
        int result = calc.sum(read.getInt(), read.getInt());
        System.out.println("The sum is: " + result);
    }

    public void substract(){
        int result = calc.substract(read.getInt(), read.getInt());
        System.out.println("Substraction is: " + result);
    }


}
