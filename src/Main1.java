public class Main1  {
    public static void main(String[] args) {
        Stack s = new Stack<>();
        //UC-1:
        System.out.println("UC-1  *STACK*");
        s.push(70);
        s.push(30);
        s.push(56);

        s.display();

        //UC-2:
        System.out.println("UC-2  *STACK*");
        while(!s.isEmpty()){
            s.peek();
            s.pop();
        }

        Queue q = new Queue<>();
        //UC-3:
        System.out.println("UC-3  *QUEUE*");
        q.enqueue(56);
        q.enqueue(30);
        q.enqueue(70);
        q.display();

        // UC-4:
        System.out.println("UC-4   *QUEUE*");
        while(!q.isEmpty()){
            q.peek();
            q.dequeue();
        }

    }
}