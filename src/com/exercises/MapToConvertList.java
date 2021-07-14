package com.exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class MapToConvertList {
    public static void main(String[] args) {
        HashMap<Integer, String> maps=new HashMap<>();
        maps.put(1,"Muharrem");
        maps.put(2,"A");
        maps.put(3,"B");
        System.out.println(maps.entrySet());
        List<Integer> numList=new LinkedList<>(maps.keySet());
        System.out.println(numList);

    }
}
