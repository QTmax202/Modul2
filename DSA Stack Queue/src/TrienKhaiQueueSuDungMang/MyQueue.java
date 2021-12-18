package TrienKhaiQueueSuDungMang;

public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head;
    private int tail;
    private int currentSize;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        queueArr = new int[this.capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isQueueFull() {
        boolean staus = false;
        if (currentSize == capacity){
            staus = true;
        }
        return false;
    }

    public boolean isQueueEmpty(){
        boolean staus = false;
        if (currentSize == 0){
            staus = true;
        }
        return false;
    }

    public void enqueue(int item){
        if (isQueueFull()){
            System.out.println("-"+item);
        } else {
            tail++;
            if (tail == capacity -1){
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("+-"+item);
        }
    }

    public void dequeue(){
        if (isQueueEmpty()){
            System.out.println("Underflow!");
        } else {
            head++;
            if (head == capacity -1){
                System.out.println(queueArr[head-1]);
                head = 0;
            } else {
                System.out.println(queueArr[head-1]);
            }
            currentSize--;
        }
    }
}
