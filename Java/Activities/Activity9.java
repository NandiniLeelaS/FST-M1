package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("Nandini");
        myList.add("Leela");
        myList.add("Is");
        myList.add("attending");
        myList.add("FSTProgram");

        //Print all the names using for Loop
        System.out.println("Printing all the names");
        for (String words :
                myList) {
            System.out.println(words);
        }

        //Get third name in the list
        System.out.println("Third Item in the list : " + myList.get(2));



        System.out.println("Able to see FSTProgram in the list : true /false ? " + myList.contains("FSTProgram") );



        System.out.println("Number of Words present in the myLists : " + myList.size());

        myList.remove("attending");
        System.out.println("Number of Words present in the myLists after removing 'attending' : " + myList.size());


        System.out.println("Printing all the names after remove action");
        for (String words :
                myList) {
            System.out.println(words);
        }
    }
}
