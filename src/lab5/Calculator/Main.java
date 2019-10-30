package lab5.Calculator;

public class Main {
//Define and write the values of an array
// indices, so that the values of the arrays
// should start from 1 and count to 100;


    public static void main(String[] args) {
      LogicalOp op = new LogicalOp();
      int[] newArray = op.getArrayHundred();
      int[] anotherOne = {1,2,3,4,5};
//      float[] x = new float[3];
//       x[0]=1;

        int[] finalArray = op.removeNumberFromArray( 5, anotherOne);

        op.printArray(finalArray);
        //op.printArray(newArray);
        System.out.println(op.averageArray(newArray));

//Write a Java program to calculate the
// average value of array elements.


    }

    // Given: array of numbers and a number
    // Required: remove number from array and return



}
