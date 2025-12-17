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


    public void display() {
        for (int i = 0; i < size; i++) { //traverse thru all the index of hashtable
            if (buckets[i] != null) { //if that index contains LL, only then display.
                buckets[i].display(); // display() func of linked list
            }
        }
    }
}
