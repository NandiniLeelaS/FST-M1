package activities;

public class MountainBike extends Bicycle{
    public int seatHeight;

    public MountainBike(int gears, int currentSpeed, int startHeight){
        super(gears, currentSpeed);
        seatHeight = startHeight;
    }

    public void setSeatHeight(int newValue){
        seatHeight = newValue;
    }

    public String bicycleDesc(){
        return (super.bycycleDesc()+ "\nSeat height is :"+ seatHeight);
    }
}
