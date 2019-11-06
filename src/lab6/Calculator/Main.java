package lab6.Calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(3);
        myList.add(0);
        myList.add(7);
        myList.add(6);
        myList.add(5);


        System.out.println(myList.get(100));
        LogicalOp op = new LogicalOp();
        op.printListValuesReversed(myList);


    }
}
