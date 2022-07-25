package chapterSixteen;

import java.util.*;

public class DuplicateElimination {
    static Scanner input = new Scanner(System.in);
    static Set<String> firstNames = new HashSet<>();

    public static void main(String[] args) {
         collectAnSaveInput();

         System.out.println("Enter a name you would like to search....");
         String searchedName = input.nextLine();

         search(searchedName);
    }


    private static void collectAnSaveInput(){
        System.out.println("""
                Enter as many first names as you want!
                Press -1 to end.""");
        while(true){
            System.out.println("""
                Enter another name..""");
                String name = input.nextLine();
            if(name.equals("-1")){break;}
            firstNames.add(name);
        }
    }
    public static void search(String firstName){
        System.out.println("Searching for "+firstName);
        List<String> names = new ArrayList<>(firstNames);
        int result = Collections.binarySearch(names,firstName);

        if(result > 0){
            System.out.println(firstName+" found at index "+result);
        }
        else{
            System.out.println(firstName+" not found!");
        }
    }
}
