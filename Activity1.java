package activities;

public class Activity1 {

    public static void main(String[] args) {
        Car maruti = new Car();
        maruti.make = 2014;
        maruti.color = "Black";
        maruti.transmission = "Manual";

        maruti.displayCharacteristics();
        maruti.accelerate();
        maruti.brake();
    }



}
