public class MyLinkedList<K,V> {
    MyMapNode<String,Integer> head;

    //UC-1:
    //To add or update a word's frequency
    public void add(String key1){

        //case-1: when list is empty
        if(head == null){
            head = new MyMapNode<>(key1,1);
            return;
        }
        else{
            //case-2: when key1 is already present
            MyMapNode<String,Integer> temp = head;
            while(temp != null){
                if(temp.key.equals(key1)){
                    temp.value++;
                    return;
                }
                temp = temp.next;
            }
        }
        //case-3: when key1 is new
        MyMapNode<String,Integer> newNode = new MyMapNode<>(key1,1);
        newNode.next = head;
        head = newNode;
    }

    public void  display(){
        MyMapNode<String,Integer> temp = head;
        while(temp != null){
            System.out.print(temp.key+" -> "+temp.value+"\n");
            temp = temp.next;
        }
    }
}