package collections.stack;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeExampleWithStack {
    public static void main(String[] args) {
        Stack<String> searchWord = new Stack<>();
        String word = "";
        String reWord;


        Scanner keyboard = new Scanner(System.in);
        while (!word.equals("Quit")) {
            word=keyboard.nextLine();
            StringBuilder buffer = new StringBuilder(word);
            reWord=buffer.reverse().toString();
            System.out.println("String tersi:"+reWord);
            if (word.equals(reWord)){
                searchWord.push(word);
                System.out.println("Bu Kelime Palindromdur:"+searchWord);
            }else {
                System.out.println("Bu Kelime Palindrom Değil");
            }
        }
    }

}
