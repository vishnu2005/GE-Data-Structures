public class LinkedList<T> {
    Node<T> head;
    // used constructor for Node
    public void insert(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    public void append(T data){
        Node<T> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node<T> temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void insertMid(T search,T data){
        // inserts a new node after a node containing value search
        Node<T> newNode = new Node<>(data);
        Node<T> temp = head;
        while(temp != null){
            if(temp.data.equals(search)){
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        }
    }

    public void pop(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node<T> temp = head;
        head = head.next;
        temp.next = null;

    }

    public Node<T> search(T data){
        Node<T> temp = head;
        while(temp != null){
            if(temp.data.equals(data)){
                System.out.println(temp.data + " present in :" + temp);
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // case: only ONE node
        if (head.next == null) {
            head = null;
            return;
        }

        Node<T> temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }


    public void deleteNode(T del){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        // Case 1: deleting head
        if(head.data.equals(del)){
            head = head.next;
            return;
        }

        Node<T> temp = head;
        while(temp.next != null){
            if(temp.next.data.equals(del)){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public void display(){
        Node<T> temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}


