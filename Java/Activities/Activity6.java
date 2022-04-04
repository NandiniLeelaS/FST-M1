package activities;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);
        plane.onboard("Aditya");
        plane.onboard("Nandini");
        plane.onboard("Leela");

        System.out.println("Plane took off at : "+ plane.takeOff());
        System.out.println("Displaying list of People names in the plane : " + plane.getPassengers());
        Thread.sleep(5000);
        plane.land();
        System.out.println("Plane landed at : "+ plane.getLastTimeLanded());
        System.out.println("After landing, list of People on the plane :  "+ plane.getPassengers());
    }
}
