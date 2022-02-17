package lesson2;

public class Main {


    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String [][] array = {{"4","4","4","4"}, {"4","4","4","4"},{"4","4","4","4"},{"4","4","4","4"}};


        ArraySum.checkLenghts(array);


        int a = CheckForException.checkArr(array);
        System.out.println("Sum is " +a);
    }
}
