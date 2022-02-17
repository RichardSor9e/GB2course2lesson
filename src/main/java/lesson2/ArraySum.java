package lesson2;

public class ArraySum {

    static final int arrayLenght = 4;
    static String lenghtsChecked;


    public static void checkLenghts(String[][] array) throws MyArraySizeException  {


            if (array.length != 4 || array[0].length != 4) {
                throw new MyArraySizeException();
            }




    }
}
