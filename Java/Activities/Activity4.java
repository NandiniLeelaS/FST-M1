package activities;

public class Activity4 {
    public static void main(String[] args) {
        int[] randomNumArray = {7, 2, 6, 4, 9, 3};
        System.out.println("Before Sorting : ");
        displayArray(randomNumArray);
        insertionSort(randomNumArray);
        System.out.println("After Sorting " );
        displayArray(randomNumArray);

    }

    private static void insertionSort(int[] randomNumArray) {
        for (int i = 1; i < randomNumArray.length; i++) {
            int key = randomNumArray[i];
            int  j = i - 1;
            while (j>=0 && key < randomNumArray[j]) {
                randomNumArray[j+1] = randomNumArray[j];
                --j;
            }
            randomNumArray[j+1]= key;
        }
    }

    private static void displayArray(int[] randomNumArray) {
        for (int i = 0; i < randomNumArray.length; i++){
            System.out.print(randomNumArray[i] + " ");
        }
    }
}