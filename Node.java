public class Node {

    // Attributes

    private String data; // data that the node holds
    private Node next; // used to link/point to the next node
    private Node last; // point to previous node


    // Constructor

    Node(String data) {
        this.data = data;
        this.next = null;
        this.last = null;
    }


    // Getters and Setters

    public void setData(String data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getData() {
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setPrevious(Node prev) {
        this.previous = prev;
    }

    public Node getPrevious() {
        return this.previous;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public Node getLast() {
        return this.last;
    }


        // Main

    public static void main(String[] args) {

        // Create new nodes
        Node n1 = new Node("people");
        Node n2 = new Node("coal");
        Node n3 = new Node("rocks");
        Node n4 = new Node("dogs");

        // Link the nodes together
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        // n3 is the end of the list, so we leave its 'next' null
        // when a node's next is null, thats how we know its the last node in the list

        n4.setLast(n3);
        n3.setLast(n2);
        n2.setLast(n1);

        //System.out.println(n1.data);
        //System.out.println(n1.next.data);
        //System.out.println(n1.next.next.data);

        Node anyNode; // can be used to represent any node
        anyNode = n1;

        while(anyNode != null){ // while were not after the end of the list
            System.out.println(anyNode.data);
            anyNode = anyNode.next; // set anyNode to be next node in the list
        }
        
        anyNode = n4;

        while(anyNode != null){ // while were not after the end of the list
            System.out.println(anyNode.data);
            anyNode = anyNode.last; // set anyNode to be next node in the list
        }

    }
}