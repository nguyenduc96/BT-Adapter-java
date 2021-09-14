package com.codegym;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        integers.add(16346346);
        integers.add(164366);
        integers.add(1634634);
        integers.add(143653463);
        integers.add(15345);
        integers.add(142344);
        integers.add(14234);
        integers.add(164365);
        integers.add(146346);
        integers.add(1363462);
        integers.add(136346);
        CollectionUtilsAdapter cul = new CollectionUtilsAdapter();
        Client client = new Client(cul);
        client.printMaxValue(integers);
    }
}
