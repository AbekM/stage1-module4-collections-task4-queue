package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> dishes = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < numberOfDishes; i ++) {
            dishes.add(i);
        }
        while(!dishes.isEmpty()) {
            if (dishes.size() >= everyDishNumberToEat) {
                for (int i = everyDishNumberToEat - 1; i < dishes.size(); i+=everyDishNumberToEat - 1) {
                    result.add(dishes.get(i));
                    dishes.remove(i);
                }
            } else {
                for (int i = 0; i < dishes.size(); i++) {
                    result.add(dishes.get(i));
                    dishes.remove(i);
                }
            }
        }
        return result;
    }
}
