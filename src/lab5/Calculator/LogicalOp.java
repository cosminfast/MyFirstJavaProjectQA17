package lab5.Calculator;

public class LogicalOp {

    public int[] getArrayHundred(){
        int[] myArray = new int[100];
        for (int i = 1; i <= 100; i++) {
            myArray[i - 1] = i;
        }
        return myArray;
    }

    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++)
            System.out.println("Pe pozitia " +
                    (i ) + " avem valoarea " +
                    array[i]);
    }

    public float averageArray(int[] anArray){
        float sum = 0;
        for (int i = 0; i < anArray.length; i++){
            sum = sum + anArray[i];

        }
        return sum/anArray.length;
    }
}

