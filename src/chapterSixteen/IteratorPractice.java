package chapterSixteen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class IteratorPractice {
    public static void main(String[] args) {
        Collection<Integer> collection1 = new ArrayList<>();
        collection1.add(5);
        collection1.add(12);
        collection1.add(7);
        collection1.add(90);
        collection1.add(4);
        collection1.add(19);
        collection1.add(81);
        collection1.add(43);

        Collection<Integer> collection2 = new ArrayList<>();
        collection2.add(90);
        collection2.add(12);
        collection2.add(7);

        collection1.removeIf(collection2::contains);

        //OPTION TWO
//        Iterator<Integer> iterator = collection1.iterator();
//        while(iterator.hasNext()){
//            if(collection2.contains(iterator.next())){
//                iterator.remove();
//            }
//        }
        System.out.println(collection1);


    }
}
