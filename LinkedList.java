public class LinkedList{
    Node head;
    Node tail;

    // Constructor
    public LinkedList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public void append(Node newNode) {
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
        } 
        else {

            this.tail.setNext(newNode);
            //newNode.previous = this.tail;
            newNode.setPrevious(this.tail);
            this.tail = newNode;
        }

    }

    public void prepend(Node newNode) {
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
        } 
        else{
            newNode.setNext(this.head);
            this.head.setPrevious(newNode);
            this.head = newNode;
        }
    }

    public boolean search(String s){
        Node runner;
        runner = this.head;
        while (runner != null){
            if(runner.data == s) {
                return true;
            }
            runner = runner.getNext();
        }
        return false;
    }

    public void printAll() {
        //goal here is to make a runner pointer
        // seperate pointer from the linked list itself 
        Node runner;
        runner = this.head;
        while(runner != null) {
            System.out.println(runner.getData);
            runner = runner.getNext;
        }
    }

    public void deleteFirst() {
        this.head = head.getNext(); //head is now second node in list
        this.head.setPrevious(null); // first node is now null

    }

    public void deleteLast() {
        // set tails previous's next to null
        this.tail = this.tail.getPrevious();
        this.tail.setNext(null);

    }


    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
    }
}