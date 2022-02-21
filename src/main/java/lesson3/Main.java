package lesson3;
import java.util.*;

public class Main {
//    public static HashMap<ArrayList<String>, Long > phoneBook = new HashMap<>();




    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();

        System.out.println("---------------------------------");
        Array.makeArray();
        System.out.println("---------------------------------");
        pb.add("89043212345", "Timofey");
        pb.add("89043345344", "Timofey");
        pb.add("89043212234", "Igor");
        pb.add("89043212876", "Andrey");
        pb.add("89033995340", "Timofey");
        System.out.println(PhoneBook.phoneBook);

        System.out.println("---------------------------------");
        PhoneBook.get("Timofey");


    }
}
