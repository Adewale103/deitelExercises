package linked_list;

public class LinkedList<T> {
    private int size;
    private Node first;


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void add(T value) {
        if(isEmpty()){
            first = new Node(value);
        }
        else{
            Node node = first;
            while(node.next != null){
                node = node.next;
            }
            node.next = new Node(value);
        }
        size++;
    }

    public T get(int index) {
    Node node = first;
    while(index > 0){
        index--;
        node = node.next;
    }
    return node.value;
    }

    private class Node{
        private final T value;
        private Node next;

        public Node(T value){
            this.value = value;
        }
    }
}
