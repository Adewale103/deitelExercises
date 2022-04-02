package ClassWork;

public class ArrayNumber {
    public static void main(String[] args) {
        int[] array = new int[300];
        for(int i = 0; i < array.length; i++){
            array[i] = 1 + i;}
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }
}
