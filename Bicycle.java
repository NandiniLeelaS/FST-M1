package activities;

import org.apache.commons.collections4.Bag;

public class Bicycle implements BycycleParts, BycycleOperations {

    public int gears;
    public int currentSpeed;
    public Bicycle(int gears, int currentSpeed){
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    public void applyBrake(int decrement) {
        currentSpeed= currentSpeed - decrement;
        System.out.println("Current speed : " +currentSpeed);
    }

    public void speed(int increment) {
        currentSpeed += increment;
        System.out.println("Current speed : " +currentSpeed);
    }

    public String bycycleDesc(){
        return("No of gears are : " + gears + "\nSpeed of bycycle is : "+ currentSpeed);
    }
}
