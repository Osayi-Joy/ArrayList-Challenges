package org.example;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "Dairy", 1);
    }
    @Override
    public String toString(){
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}
public class Main {
    public static void main(String[] args) {

        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = new GroceryItem("Apples", "PRODUCE", 5);
        groceryArray[2] = new GroceryItem("Oranges", "PRODUCE", 6);
       // System.out.println(Arrays.toString(groceryArray));

        ArrayList<GroceryItem> groceryItemArrayList = new ArrayList<>();
        groceryItemArrayList.add(new GroceryItem("Milk"));
        groceryItemArrayList.add(new GroceryItem("Apples", "PRODUCE", 5));
        groceryItemArrayList.add(new GroceryItem("Oranges", "PRODUCE", 6));
        groceryItemArrayList.add(0, new GroceryItem("Butter", "PRODUCE", 6));
        groceryItemArrayList.set(1, new GroceryItem("Eggs", "PRODUCE", 6));
        groceryItemArrayList.remove(1);
        groceryItemArrayList.forEach(x -> System.out.println(x));

//        System.out.println(groceryItemArrayList);
//        System.out.println("_".repeat(7));



    }
}