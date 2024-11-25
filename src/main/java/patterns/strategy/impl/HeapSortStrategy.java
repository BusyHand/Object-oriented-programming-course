package patterns.strategy.impl;

import patterns.strategy.SortStrategy;

public class HeapSortStrategy implements SortStrategy {


    @Override
    public void sort(long[] array) {
        int mid = array.length / 2;

        for (int i = mid - 1; i >= 0; i--) {
            heapSort(array, array.length, i);
        }

        for (int i = array.length - 1; i > 0; i--) {
            swap(array, 0, i);
            heapSort(array, i, 0);
        }
    }

    private void heapSort(long[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(array, i, largest);
            heapSort(array, n, largest);
        }
    }

    private void swap(long[] array, int first, int second) {
        long temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }


}
