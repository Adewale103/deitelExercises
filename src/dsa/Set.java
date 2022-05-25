package dsa;

public class Set{
private ArrayList set = new ArrayList();


public boolean contains(String item){
    for (int i = 0; i < set.size(); i++) {
        if(item.equals(set.get(i))){
            return true;
        }
    }
    return false;
}

public void add(String item){
    if(!contains(item)){
        set.add(item);
    }
}

public int size(){
    return set.size();
}
public void remove(String item){
    set.remove(item);
}

public String get(int index){
    return set.get(index);
}

}
