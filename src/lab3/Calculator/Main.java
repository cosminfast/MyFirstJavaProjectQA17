package lab3.Calculator;

import lab4.Calculator.LogicalOp;

public class Main {

    public static void main(String[] args) {
        //Given two numbers,
        // see which one is the
        // greatest and print it

        int x = 4;
        int y = 4;

        LogicalOp op = new LogicalOp();

        System.out.println(op.verifyGreaterNumber(x, y));

//        Given a text input and a number input, if the text is
//        equal to “FastTrack” AND the number is equal to or lower
//        than 3, print the text and the number. If the text is
//        not “FastTrack” AND the number is equal to or higher than
//        4, print the number and the text, in this order.

        String text = "FastTrackj";
        int number = 5;
        String result = op.verifyTextAndNumber(text, number);
        System.out.println(result);

        //Given a text input, if it is “FastTrack”,
        // then print “Learning text comparison”.
        // If not, print “Got to try some more”

//      Given a number, if it’s equal to or higher
//      than 2 and equal to or lower than 8, print
//      the number
    }
}
