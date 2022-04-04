package Personal;


import java.util.Scanner;

public class ArrayFirstPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] first = new int[12];
        int[] second = new int[12];
        int[] third = new int[12];
        for(int i=0;i < 12; i++){
            for (int j = 0; j < 12; j++) {
                first[i] = i + 1;
                second[j]= j + 1;
                third[j] = (i + 1) * (j + 1);
                System.out.printf("%d x %d = %d%n",first[i],second[j],third[j]);
            }
            System.out.println();
        }
    }


}


