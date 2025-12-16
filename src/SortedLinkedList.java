//UC-10:
public class SortedLinkedList<T extends Comparable<T>> {

    Node<T> head;

    // Insert in ascending order
    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        // Case 1: empty list OR insert before head
        if (head == null || head.data.compareTo(data) > 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Case 2: insert in middle or end
        Node<T> temp = head;
        while (temp.next != null && temp.next.data.compareTo(data) < 0) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display list
    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}