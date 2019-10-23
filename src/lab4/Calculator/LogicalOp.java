package lab4.Calculator;

public class LogicalOp {

    public int verifyGreaterNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String verifyTextAndNumber(String text, int number) {
        if (text.equals("FastTrack") && number <= 3) {
            return (text + "  " + number);
        } else if (!text.equals("FastTrack") && number >= 4) {
            return (number + "  " + text);
        }
        return "";
    }

    int x = 2;

    public void setX(int x) {
        x = x;
    }


    public void printToHundred(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public float getAvregaFromNumber() {
        float sum = 0;
        int x = 111;
        int count = 0;
        while (x <= 8899) {
            sum = sum + x;
            x++;
            count++;
        }
        return (sum / count);

    }

    public float getAverageFromNumber(int x, int y) {
        float sum = 0;
        int count = 0;
        while (x <= y) {
            if (x % 7 == 0) {
                sum += x;
                count++;
            }
            x++;
        }

        return sum / count;


    }

    public void cozaLoza() {
        int start = 1;
        int finnish = 110;

        while (start <= finnish) {

            if (start % 3 == 0)
                System.out.print("Coza ");
            else if (start % 5 == 0)
                System.out.print("Loza ");
            else if (start % 7 == 0)
                System.out.print("Woza ");
            else if (start % 3 == 0 && start % 5 == 0)
                System.out.print("CozaLoza ");
            else if (start % 3 == 0 && start % 7 == 0)
                System.out.print("CozaWoza ");
            else if (start % 5 == 0 && start % 7 == 0)
                System.out.print("WozaLoza ");
            else if (start %3 == 0 && start % 5 == 0 && start % 7 == 0)
                System.out.print("CozaLozaWoza ");
            else
                System.out.print(start + " ");

            if (start % 11 == 0)
                System.out.println();

            start++;

        }

    }
}
