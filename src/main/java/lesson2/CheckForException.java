package lesson2;

public class CheckForException {
    public static int arrayLenght;
    public static int arrayHeight;

    public static int checkArr(String[][] array) throws MyArrayDataException {


        int a = 0;

        try {

        for (arrayLenght = 0; arrayLenght < 4; arrayLenght++) {

                for ( arrayHeight = 0; arrayHeight < 4; arrayHeight++) {


                    a = a + Integer.parseInt(array[arrayHeight][arrayLenght]);

                }

            }
            return a;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            throw new MyArrayDataException(arrayHeight,arrayLenght);

        }

    }

}

