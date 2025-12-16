public class Main {
    public static void main(String[] args) {
//        Addressbook a1 = new Addressbook();
//        Contact c1 = new Contact("Vishnu","Priya","ABC colony","tirupur","tamil nadu","233297273","abc@gmail.com",1111111);
//        a1.addContact(c1);
//        a1.displayContacts();

        LinkedList list1 = new LinkedList();
        //UC-1,2:

        list1.insert(70);
        list1.insert(36);
        list1.insert(50);
        System.out.println("UC-1,2");
        list1.display();

        //UC-3:
        LinkedList list2 = new LinkedList();

        list2.append(56);
        list2.append(30);
        list2.append(70);
        System.out.println("UC-3");
        list2.display();

        //UC-4:
        LinkedList list3 = new LinkedList();

        list3.append(56);
        list3.append(70);
        list3.insertMid(56,30);
        System.out.println("UC-4");
        list3.display();

        //UC-5:
        list2.pop();
        System.out.println("UC-5");
        list2.display();

        //UC-6:
        System.out.println("UC-6");
        list1.deleteLast();
        list1.display();

        //UC-7:
        System.out.println("UC-7");
        list3.search(30);

        //UC-8:
        System.out.println("UC-8");
        list3.insertMid(30,40);
        list3.display();

        //UC-9:
        System.out.println("UC-9");
        list3.deleteNode(40);
        list3.display();

        //UC-10:

        SortedLinkedList sortedList = new SortedLinkedList<>();

        sortedList.add(56);
        sortedList.add(30);
        sortedList.add(40);
        sortedList.add(70);

        System.out.println("UC-10");
        sortedList.display();




    }
}