public class MyHashTable {
    int size=16;
    MyLinkedList[] buckets = new MyLinkedList[size]; //like: int[] num=new int[10]

    // index retrieval function
    private int getBucketIndex(String key){
        int hashcode=key.hashCode();
        int index=hashcode%size;
        return Math.abs(index);
    }

    public void add(String key){
        int index=getBucketIndex(key);
        if(buckets[index]==null){
            buckets[index]=new MyLinkedList<String,Integer>();
        }
        buckets[index].add(key);
    }

    public void remove(String key){
        int index=getBucketIndex(key);
        // case-1: bucket is empty
        if(buckets[index]==null){
            return;
        }
        MyMapNode<String,Integer> head=buckets[index].head;
        //buckets[index] points to the linked list present in that index (not a particular node)
        //buckets[index].head represents the head node of the linked list at that index

        //case-2: node to be removed is head
        if(head.key.equals(key)){
            buckets[index].head=head.next;
            head.next=null;
        }

        // case-3: node to be removed is at middle or end
        MyMapNode<String,Integer> temp=head.next;
        MyMapNode<String,Integer> prev=head;
        while(temp!=null){
            if(temp.key.equals(key)){
                prev.next=temp.next;
                temp.next=null;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) { //traverse thru all the index of hashtable
            if (buckets[i] != null) { //if that index contains LL, only then display.
                buckets[i].display(); // display() func of linked list
            }
        }
    }
}
