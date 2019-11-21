package lesson1811;

public class List {
    Node head;
    Node last;

    public List() {
        this.head = null;
        this.last = null;
    }

    public Node getHead() {
        return head;
    }

    public Node getLast() {
        return last;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    void add(String value){
        Node x = new Node();
        x.setNext(null);
        x.setValue(value);
        if(head == null){
            head = x;
            last = x;
        }
        else{
            last.setNext(x);
            last = x;
        }

    }
}
