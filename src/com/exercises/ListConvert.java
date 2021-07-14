package com.exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ListConvert {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(8);

        Integer[] numArray=new Integer[numbers.size()];
        numbers.toArray(numArray);
        for (int number:numArray) {
            System.out.println(number);
        }
        ArrayList<Integer> newNumber=new ArrayList<>(Arrays.asList(numArray));
        System.out.println(newNumber);
    }
}
