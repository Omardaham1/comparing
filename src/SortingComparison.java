import java.util.Arrays;

public class SortingComparison {
    public static void main(String[] args) {
        int[] bubbleArray = {64, 34, 25, 12, 22, 11, 90};
        int[] mergeArray = {64, 34, 25, 12, 22, 11, 90};

        // Timing BubbleSort
        long startBubble = System.nanoTime();
        BubbleSort.bubbleSort(bubbleArray);
        long endBubble = System.nanoTime();

        System.out.println("BubbleSort Result: " + Arrays.toString(bubbleArray));
        System.out.println("BubbleSort took " + (endBubble - startBubble) + " ns");

        // Timing MergeSort
        long startMerge = System.nanoTime();
        MergeSort.mergeSort(mergeArray, 0, mergeArray.length - 1);
        long endMerge = System.nanoTime();

        System.out.println("MergeSort Result: " + Arrays.toString(mergeArray));
        System.out.println("MergeSort took " + (endMerge - startMerge) + " ns");
    }
}
