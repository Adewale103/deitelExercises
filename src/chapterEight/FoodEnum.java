package chapterEight;

public enum FoodEnum {
    APPLE("fruit",4),BANANA("fruit",7),CARROT("fruit",6);
    private final String type;
    private final int number_of_calories;
    FoodEnum(String type, int number_of_calories){
        this.type = type;
        this.number_of_calories = number_of_calories;
    }

    public String getType() {
        return type;
    }

    public int getNumber_of_calories() {
        return number_of_calories;
    }
}
