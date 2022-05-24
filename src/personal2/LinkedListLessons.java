package personal2;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListLessons {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Bayo");
        names.add("Funmi");
        names.add("Femi");
        names.add("Anjola");
        printList(names);
        names.remove(2);
        printList(names);
    }
    public static void printList(LinkedList<String> names){
        Iterator<String> i = names.iterator();
        while(i.hasNext()){
            System.out.println(i.next() + " is on the list");
        }
        System.out.println("========================================");
    }
}
