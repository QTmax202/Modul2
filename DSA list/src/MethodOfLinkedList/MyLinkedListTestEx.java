package MethodOfLinkedList;

public class MyLinkedListTestEx {
    public static void main(String[] args) {
        MyLinkedListEx list = new MyLinkedListEx(1);
        list.add(1, 2);
        list.add(2,"Melinda");
        list.add(3,4);
        list.add(4,5);
        list.addFirst(0);
        list.addLast(73);
        list.printList();
        System.out.println("-------");
        list.remove(3);
        list.printList();
        System.out.println("-------");
        list.get(5);
        System.out.println("-------");
        System.out.println(list.indexOf("Melinda"));
        System.out.println("-------");
        System.out.println(list.contains("Melinda"));
        System.out.println("-------");
        list.size();
    }
}
