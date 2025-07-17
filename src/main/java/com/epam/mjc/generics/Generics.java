package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    //TODO: Refactor Method-1
    public <T> List<T> boxingMethod(T name) {
        List firstList = new ArrayList<T>();
        firstList.add(name);
        List secondList = new ArrayList<T>();
        secondList.add(firstList);
        
        return secondList;
    }

    //TODO: Refactor Method-2
    public <T> String genericMethod(T data) {
        return data.getClass().getName();
    }

    //TODO: Refactor Method-3
    public <T, V extends T> void cloneMethod(List<T> consumer, List<V> producer) {
        consumer.addAll(producer);
    }

}
