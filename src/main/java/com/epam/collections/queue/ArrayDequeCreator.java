package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {

  public ArrayDeque<Integer> createArrayDeque (Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
    ArrayDeque<Integer> result = new ArrayDeque<>();
    while (firstQueue.size() > 1 && secondQueue.size() > 1) {
      if (result.size() > 1) {
        firstQueue.add(result.poll());
        secondQueue.add(result.poll());
      }
      result.add(Objects.requireNonNull(firstQueue.poll()));
      result.add(Objects.requireNonNull(firstQueue.poll()));
      result.add(Objects.requireNonNull(secondQueue.poll()));
      result.add(Objects.requireNonNull(secondQueue.poll()));
    }
    return result;
  }
}
