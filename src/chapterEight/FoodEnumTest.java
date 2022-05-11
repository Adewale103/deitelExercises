package chapterEight;

import java.util.EnumSet;

public class FoodEnumTest {
    public static void main(String[] args) {
        System.out.println("  Food      Type    Number_of_calories");
        for(FoodEnum foodEnum : FoodEnum.values()){
            System.out.printf("%6s%10s%12s%n",foodEnum,foodEnum.getType(),foodEnum.getNumber_of_calories());
        }
        System.out.println();
        System.out.println("  Food      Type    Number_of_calories");
        for(FoodEnum foodEnum: EnumSet.range(FoodEnum.APPLE,FoodEnum.BANANA)){
            System.out.printf("%6s%10s%12s%n",foodEnum,foodEnum.getType(),foodEnum.getNumber_of_calories());
        }
    }
}
