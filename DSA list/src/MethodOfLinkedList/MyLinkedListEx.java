package MethodOfLinkedList;

import ClassLinkedListSimpe.MyLinkedList;

public class MyLinkedListEx {
    private MyLinkedListEx.Node head;
    private int numNodes;

    public void MyLinkedListEx(Object data) {
        head = new MyLinkedListEx.Node(data);
    }

    private class Node{
        private MyLinkedListEx.Node next;
        private Object data;

        public Node(Object data){
            this.data = data;
        }

        public Object getData(){
            return this.data;
        }
    }
}
