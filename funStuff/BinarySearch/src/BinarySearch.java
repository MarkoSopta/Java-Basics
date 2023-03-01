import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9};

         printArray(numbers);

         binarySearch(numbers, 5);

    }

    public static void binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                System.out.println("\nTarget found at index " + mid);
                return;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("\nTarget not found in array.");
    }


    public static int[] randomizeArray(int[] array) {
        Random rgen = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomPosition = rgen.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }
        return array;
    }


    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
