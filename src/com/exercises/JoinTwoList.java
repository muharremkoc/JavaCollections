package com.exercises;

import java.util.ArrayList;

public class JoinTwoList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        ArrayList<String> surNames=new ArrayList<>();

        names.add("Muharrem");
        names.add("Mahmut");
        names.add("Cafer");
        surNames.add("Koc");

        names.addAll(surNames);
        System.out.println(names);

    }
}
