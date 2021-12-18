package TrienKhaiStackSuDungLopLinkedList;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack(){
        stack = new LinkedList();
    }

    public void push(T e){
        stack.addFirst(e);
    }

    public T pod(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public boolean isEmpty(){
        if (stack.size() == 0){
            return true;
        }
        return false;
    }

    public int size(){
        return stack.size();
    }
}