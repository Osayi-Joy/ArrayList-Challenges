package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListChallenges {
private static Scanner scanner = new Scanner((System.in));

    public static void main(String[] args) {
     boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
     while(flag){
         printActions();
         switch (Integer.parseInt(scanner.nextLine())){
             case 1 -> addItems(groceries);
             case 2 -> removeItems(groceries);
             default -> flag = false;
         }
         groceries.sort(Comparator.naturalOrder());
         System.out.println(groceries);
     }

    }

    private static void addItems(ArrayList<String> groceries){
        System.out.println("Add item(s) [seperate each item by comma]:");
        String[] items = scanner.nextLine().split(",");
        for(String i: items){
            String trimmed = i.trim();
            if(groceries.indexOf(trimmed) < 0){
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries){
        System.out.println("Remove item(s) [seperate each item by comma]:");
        String[] items = scanner.nextLine().split(",");
        for(String i: items){
            String trimmed = i.trim();
            groceries.remove(trimmed);
        }
    }

    private static void printActions(){
        String textBlock = """
                Available actions:
                0 - to shutdown
                1 - to add items(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list)
                Enter a number for which action you wish to do:""";
        System.out.println(textBlock + " ");
    }



}
