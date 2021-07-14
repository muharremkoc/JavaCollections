package collections.list.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> names=new Stack<>();
        names.push("Muharrem");
        names.push("John");
        names.push("Jack");
        System.out.println(names);

        boolean emptyMethod=names.empty();
        System.out.println("withEmpty:"+emptyMethod);


        int searchMethod=names.search("Jack");
        System.out.println("withSearch:"+searchMethod);

        String peekMethod = names.peek();
        System.out.println("withPeek:"+peekMethod);

        String popMethod=names.pop();
        System.out.println("withPop:"+popMethod);
        System.out.println(names);





    }
}
