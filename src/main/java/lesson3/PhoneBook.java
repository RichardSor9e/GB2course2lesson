package lesson3;

import java.util.ArrayList;
import java.util.HashMap;

public  class PhoneBook {
    public static HashMap<String, ArrayList<String> > phoneBook = new HashMap<>();


   public static void add (String number, String name) {
       ArrayList<String> arrayList = new ArrayList<>();



       if (phoneBook.containsKey(name)) {
           arrayList = phoneBook.get(name);
       } else {
           arrayList = new ArrayList<>();
       }
       arrayList.add(number);

       phoneBook.put(name, arrayList);


   }

    public static void get(String name) {

        System.out.println( "Phone numbers for " + name + ": " +phoneBook.get(name));


//        System.out.println(Main.phoneBook.get(name));


    }




}
