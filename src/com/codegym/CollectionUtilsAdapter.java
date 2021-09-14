package com.codegym;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CollectionUtilsAdapter implements CollectionOperations{

    @Override
    public int findMax(Set<Integer> numbers) {
        List<Integer> integers = new ArrayList<>();
        integers.addAll(numbers);
        int max = integers.get(0);
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) > max) {
                max = integers.get(i);
            }
        }
        return max;
    }
}
