package lab3.Calculator;

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
}
