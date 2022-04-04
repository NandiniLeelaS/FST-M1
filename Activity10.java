package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Nandini");
        hs.add("Leela");
        hs.add("is");
        hs.add("attending");
        hs.add("FST");
        hs.add("Program");

        System.out.println("Initial Set : " +hs);

        System.out.println("Number of Words present in the hs  : " + hs.size());
        if ( hs.remove("attending")){
            System.out.println("'attending' is removed from the set");
        }
        if ( !hs.remove("Tester")) {
            System.out.println("'Tester' is not removed from the set as the word is not there in Set");
        }
        else
            System.out.println("'Tester' is  removed from the set");

        hs.remove("Tester");
//
        System.out.println("Able to see FST in the list : true /false ? " + hs.contains("FST") );


        for (String words:
            hs ) {
            System.out.println(words);
        }


        System.out.println("Number of Words present in the myLists after removing 'attending' : " + hs.size());
    }

}