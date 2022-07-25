package dsa;

public class HashMap {
    Set keys = new Set();
    Set values = new Set();

    private int counter;


    public int size() {
        return counter;
    }

    public void put(String key, String value) {
        for (int i = 0; i < keys.size(); i++) {
            if(key.equals(keys.get(i))){
                values.add(i,value);
            }
        }
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
    public void remove(String key){
        for (int i = 0; i < keys.size(); i++) {
            if(key.equals(keys.get(i))){
                values.remove(values.get(i));
                keys.remove(key);
            }
        }

    }
    public boolean containKey(String key){
        if(keys.contains(key)){
            return true;
        }
        return false;
    }

    public boolean containValue(String value){
        if(values.contains(value)){
            return true;
        }
        return false;
    }
}
