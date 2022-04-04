package activities;

interface Addable{
    int add(int num1, int num2);

}
public class Activity12 {
    public static void main(String[] args) {
        //addable int1 =
        Addable ad1 = ( num1,  num2) -> num1+num2;

        Addable ad2 = (int num1, int num2) ->{
           // System.out.println("Sum of ad2 is - " + num1+num2);
            return (num1+num2);
        };

        System.out.println("Sum of ad1 is - " + ad1.add(2,3));
        System.out.println("Sum of ad2 is - " + ad2.add(1,5));
    }

}
