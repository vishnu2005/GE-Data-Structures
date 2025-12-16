import java.util.ArrayList;

public class Addressbook {
    //one to many relation
    ArrayList<Contact>  adBook;
    public Addressbook() {
        adBook = new ArrayList<Contact>();

    }

    public void addContact(Contact c ){
        adBook.add(c);
        System.out.println("Contact added");
    }

    public void removeContact(Contact c){
        adBook.remove(c);
        System.out.println("Contact removed");
    }

    public void displayContacts() {
        System.out.println(adBook);
    }



}
