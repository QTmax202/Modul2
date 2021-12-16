package ClassLinkedListSimpe;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("---------");
        MyLinkedList list = new MyLinkedList(5);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(7);

        list.add(4,6);
        list.add(4,9);
        list.printList();
    }
}
