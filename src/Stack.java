public class Stack<T> {
    LinkedList<T> list;
    //used constructor for LinkedList
    public Stack() {
        list = new LinkedList<>();
    }
    public void push(T item) {
        list.insert(item);
    }
    public void pop() {
        if(isEmpty()){
            System.out.println("Stack is empty");
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
