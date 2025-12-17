import java.util.Scanner;

public class Main2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        // splitting sentence to words
        String[] words = sentence.split(" ");

        MyLinkedList<String,Integer> list = new MyLinkedList<>();

        for(String word : words){
            list.add(word);
        }

        System.out.println("UC-1 :");
        list.display();

    }
}