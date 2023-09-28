package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> result = new PriorityQueue<>( new StringComparator());
        result.addAll(firstList);
        result.addAll(secondList);
        for (String s : result) {
            System.out.println(s);
        }
        return result;
    }
    static class StringComparator implements Comparator<String> {
        @Override
        public int compare (String o1, String o2) {
            if (o1.compareTo(o2) > 0) {
                return -1;
            } else return 1;
        }
    }
}
