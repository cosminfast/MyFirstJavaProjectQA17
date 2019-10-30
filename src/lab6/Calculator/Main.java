package lab6.Calculator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(3);
        myList.add(2);
        myList.add(5);

        LogicalOp op = new LogicalOp();
        op.printFromPosition(myList, -4);

    }
}
