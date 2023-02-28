import java.util.Random;

public class QuicksortAlgorithm {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 250000;
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Before: ");
        printArray(numbers);

       quicksort(numbers);


        System.out.println("After: ");
        printArray(numbers);
    }

    private static void quicksort(int[]array){
        quicksort(array,0,array.length-1);
    }
    private static void quicksort(int[] array, int lowIndex, int hiIndex) {
        if (lowIndex >= hiIndex) {
            return;
        }
        int pivotIndex = new Random().nextInt(hiIndex-lowIndex)+lowIndex;
        int pivot = array[pivotIndex];
        swap(array,pivotIndex,hiIndex);
        partition(array, lowIndex, hiIndex, pivot);
    }

    private static void partition(int[] array, int lowIndex, int hiIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = hiIndex;
        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;

            }
            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, hiIndex);
        quicksort(array, lowIndex, leftPointer - 1);
        quicksort(array, leftPointer + 1, hiIndex);
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }

    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;


    }
}
