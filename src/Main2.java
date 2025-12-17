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
        System.out.println("\n ----------------------------------------- \n");

        System.out.println("UC-2 :");
        Scanner s = new Scanner(System.in);

        System.out.println("Enter paragraph:");
        String paragraph = s.nextLine().toLowerCase();

        // remove punctuation
        // [^a-z] - Match any character that is NOT a lowercase letter and NOT a space
        paragraph = paragraph.replaceAll("[^a-z ]", "");

        String[] words_in_para = paragraph.split("\\s+");

        MyHashTable table = new MyHashTable();

        for (String word_in_para : words_in_para) {
            table.add(word_in_para);
        }

        System.out.println("Word Frequencies: (UC-2)");
        table.display();

        System.out.println("\n ----------------------------------------- \n");

        System.out.println("UC-3 : Remove 'avoidable' from the phrase");
        table.remove("avoidable");
        table.display();



    }
}