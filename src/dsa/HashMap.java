package dsa;

public class HashMap {
    Set keys = new Set();
    Set values = new Set();

    private int counter;


    public int size() {
        return counter;
    }

    public void put(String key, String value) {
        if(keys.contains(key)){}
        keys.add(key);
        values.add(value);
        counter++;
    }


    public String getValue(String key) {
        for (int i = 0; i < keys.size(); i++) {
            if(key.equals(keys.get(i))){
                return values.get(i);
            }
        }
        return null;
    }
}
