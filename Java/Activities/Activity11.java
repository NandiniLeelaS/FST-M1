package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

    public static void main(String[] args) {
        HashMap<Integer, String> colors = new HashMap<Integer, String>();
        colors.put(1, "White");
        colors.put(2, "Black");
        colors.put(3, "Green");
        colors.put(4, "Red");
        colors.put(5,"Orange");
        System.out.println("Initial Map : " +colors);
        colors.remove(4);

        System.out.println("After removing Red : " +colors);
        if(colors.containsValue("Green")){
            System.out.println("Green is present in the Value set of Colors Map");
        }
        else
            System.out.println("Green is not present in the Value set of Colors Map");

        System.out.println("Size of the Map : " + colors.size());
    }
}
