package personal2;

public class IntegerSetTest {
    public static void main(String[] args) {
        IntegerSet integerSet = new IntegerSet();

        integerSet.addIntegerToSet(23);
        integerSet.addIntegerToSet(1);
        integerSet.addIntegerToSet(41);
        integerSet.addIntegerToSet(84);
        integerSet.addIntegerToSet(90);
        integerSet.addIntegerToSet(9);
        integerSet.addIntegerToSet(11);
        integerSet.addIntegerToSet(69);
        integerSet.addIntegerToSet(81);
        integerSet.addIntegerToSet(100);
        integerSet.addIntegerToSet(99);
        for (int i = 40; i <= 70; i+=2) {
            integerSet.addIntegerToSet(i);
        }

        for (int i = 0; i <= 100; i++) {
            boolean[] a = integerSet.getElements();
            System.out.println(i +" -> "+ a[i]);
        }
    }



}
