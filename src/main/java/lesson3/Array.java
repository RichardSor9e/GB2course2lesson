package lesson3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Array {
    private static int a;



    public static void makeArray(){

        ArrayList<String> arrayList = new ArrayList<>();
        TreeSet<String> tree = new TreeSet<>();
        HashMap<String, Integer> map = new HashMap<>();





Collections.addAll(arrayList, "ВОЛГЛЫЙ", "ПОТИРАЛЬЦЕ", "ЯГА", "ЯГА", "АНАХОРЕТ", "ЯХОНТ", "ЮЗИЛИЩЕ",
        "ЮЗИЛИЩЕ", "ЮЗИЛИЩЕ", "ШЕПОТНИК", "ШЕПОТНИК", "ШЕПОТНИК", "ТОРОК", "АНЧУТКИ");
        System.out.println("Весь массив: " +arrayList);


        for (String reply : arrayList){

            for (int i = 0; i < arrayList.size(); i++) {

                if (reply == arrayList.get(i)) {
                    a++;

                }

            } map.put(reply, a ); a=0;
            }
        System.out.println("Количество упоминаний: " +map);

        tree.addAll(arrayList);
        System.out.println("Без повторений: " + tree);







    }
}
