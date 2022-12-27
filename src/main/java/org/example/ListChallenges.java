package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class ListChallenges {
    public static void main(String[] args) {
        String[] items = {"APPLES", "BANANAS", "MANGOS", "ORANGES", "CHASHEW", "PINEAPPLE"};
        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("PICKLES", "MUSTARD", "CHEESE"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);





    }



}
