package chapterEight;

public enum People {
    DAYO("Funmi"),
    FEMI("Peace", "Hannah"),
    WOLE();

    private final String[] boyFriendNames;

    People(String... names){
        boyFriendNames = names;
    }

    People(String name){
      boyFriendNames = new String[1];
      boyFriendNames[0] = name;
    }
    public String toString(){
        switch (this){
            case DAYO: return "dayo";
            case FEMI: return "femi";
            case WOLE: return "wole";
            default: return null;
        }
    }
}

