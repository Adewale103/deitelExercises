package personal2;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListLesson2 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        addToList(names, "Wale");
        addToList(names, "Ben");
        addToList(names, "Ayo");
        addToList(names, "Richard");
        addToList(names, "Gladys");
        printList(names);
        addToList(names, "Richard");
        addToList(names, "Gladys");
        addToList(names, "Aaron");
        printList(names);

    }
    public static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("===================================");
    }

    public static boolean addToList(LinkedList<String> names, String newName){
        ListIterator<String> i = names.listIterator();
        while(i.hasNext()){
            int comparison = i.next().compareTo(newName);
            if(comparison == 0){
                System.out.println(newName + " already on the list");
                return false;
            }
            else if(comparison > 0){
                i.previous();
                i.add(newName);
                return true;
            }

        }
        i.add(newName);
        return true;
    }
}

