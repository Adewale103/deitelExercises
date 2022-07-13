package dsa;
public class ArrayList {
    private int counter;
    private int length;
    private String[] arrayList;

    public void add(String item) {
        if(counter == 0){
            length = 5;
            arrayList = new String[length];
        }
       if (counter == arrayList.length){
            increaseArraySize();
        }
       arrayList[counter] = item;
       counter++;
    }

    public int size() {
        return counter;
    }

    public String get(int index) {
        return arrayList[index];
    }

    public void add(int index, String item) {
        if(counter < arrayList.length){
            implementAdd(index,item);
        }
        if(counter == arrayList.length){
            increaseArraySize();
            implementAdd(index,item);
        }
        counter++;
    }

    private void increaseArraySize() {
        String[] arrayList1 = new String[length * 2];
        for (int i = 0; i < arrayList.length ; i++) {
            arrayList1[i] = arrayList[i];
        }
        arrayList = arrayList1;
    }

    public void remove(String item) {
        int index = 0;
        for (int i = 0; i < arrayList.length; i++) {
            if(item.equals(arrayList[i])){
                index = i;
            }
        }
       implementRemoval(index);
        counter--;
    }

    public void implementAdd(int index, String item){
        String[] arrayList1 = new String[arrayList.length + 1];
        for (int i = 0; i < arrayList.length; i++) {
            arrayList1[i] = arrayList[i];
        }
        arrayList1[index] = item;

        for (int i = index; i < arrayList1.length-1; i++) {
            arrayList1[index+1] = arrayList[index];
        }
        arrayList = arrayList1;
    }

    private void implementRemoval(int index) {
        arrayList[index] = null;
        for (int i = 0; i < counter-1; i++) {
            if(arrayList[i] == null){
                arrayList[i] = arrayList[i+1];
            }
        }
    }

    public void remove(int index) {
        implementRemoval(index);
        counter--;
    }
}
