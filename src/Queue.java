public class Queue<T> {
    LinkedList<T> list;
    //used constructor for LinkedList
    public Queue() {
        list = new LinkedList<>();
    }
    public void enqueue(T item) {
        list.append(item);
    }
    public void dequeue() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        list.pop();
    }
    public void peek() {
        System.out.println(list.head.data);
    }
    public boolean isEmpty() {
        if(list.head == null){
            return true;
        }
        return false;
    }
    public void display() {
        list.display();
    }


}
