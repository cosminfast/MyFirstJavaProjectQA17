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
}
