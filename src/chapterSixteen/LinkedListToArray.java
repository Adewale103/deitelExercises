package chapterSixteen;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToArray {
    public static void main(String[] args) {
     String[] colors = {"White", "Black", "Blue"};
     LinkedList<String> lists = new LinkedList<>(Arrays.asList(colors));

     lists.addLast("Brown");
     lists.add("Red");
     lists.addFirst("Yellow");

     colors = lists.toArray(new String[0]);

     for(String color : colors){
         System.out.println(color);
     }


    }
}
