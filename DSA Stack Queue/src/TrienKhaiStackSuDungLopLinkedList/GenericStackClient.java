package TrienKhaiStackSuDungLopLinkedList;

public class GenericStackClient {
    public static void stackofStrings(){
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("T");
        stack.push("O");
        stack.push("I");
        stack.push("F");
        stack.push("H");
        stack.push("Y");
        System.out.println(stack.size());
        System.out.println("----");
        while(!stack.isEmpty()){
            System.out.printf("%-2s",stack.pod());
        }
        System.out.println();
        System.out.println("----");
        System.out.println(stack.size());
    }

    public static void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack<Integer>();
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println(stack.size());
        System.out.println("--");
        while(!stack.isEmpty()){
            System.out.printf("%-2d",stack.pod());
        }
        System.out.println();
        System.out.println("---");
        System.out.println(stack.size());
    }
}
