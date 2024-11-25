package patterns.strategy.impl;

import patterns.strategy.SortStrategy;

public class SortService {

    private final SortStrategy sortStrategy;

    public SortService(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }


    public void sort(long[] array) {
        sortStrategy.sort(array);
    }

}
