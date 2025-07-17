package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    //TODO: Refactor Method-1
    public <T> List<T> boxingMethod(T name) {
        List<T> firstList = new ArrayList<>();
        firstList.add(name);
        List<T> secondList = new ArrayList<>();
        secondList.addAll(firstList);

        return secondList;
    }

    //TODO: Refactor Method-2
    public <T> T genericMethod(T data) {
        return data;
    }

    //TODO: Refactor Method-3
    public <T, V extends T> void cloneMethod(List<T> consumer, List<V> producer) {
        consumer.addAll(producer);
    }

}
