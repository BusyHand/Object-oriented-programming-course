package patterns.strategy;


import patterns.strategy.impl.HeapSortStrategy;
import patterns.strategy.impl.SortService;

public class Main {
    public static void main(String[] args) {
        SortService sortService = new SortService(new HeapSortStrategy());
        long[] arrayToSort = {5, 3, 8, 1, 2, 7};

        System.out.println("Original array:");
        printArray(arrayToSort);

        sortService.sort(arrayToSort);
        System.out.println("Sorted array:");
        printArray(arrayToSort);
    }

    private static void printArray(long[] array) {
        for (long value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
