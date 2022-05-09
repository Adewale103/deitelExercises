package chapterEight;

public enum Regions {
    NE("Adamawa", "Zamfara"),
    SE("Imo","Anambra"),
    NC("Kwara","Kogi"),
    SW("Lagos","Osun"),
    NW("Kaduna","Kano"),
    SS("Rivers", "Cross-River");
private String[] states;

Regions(String... states){
    this.states = states;
}
}
