package lesson2;

public class MyArrayDataException extends Throwable {
    public MyArrayDataException(int arrayHeight, int arrayLenght) {

        System.out.println("The problem placed in " + (arrayHeight+1) +  " line and " + (arrayLenght+1) + " column.");
    }



}
