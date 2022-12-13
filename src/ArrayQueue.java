import jdk.jfr.Frequency;

import java.util.ArrayList;

public class ArrayQueue {

    int max =10;
    int front =-1 ; //맨앞
    int rear =-1 ; //뒤
    int[] queue = new int[max];

    public void enqueue(int data) {
        System.out.println(queue[++rear] = data);

    }
    public void dequeue() {
        System.out.println(queue[++front]);
    }

    public void peek(){
        System.out.println(queue[front+1]);
    }

    public void show () {
        for (int i = front +1 ; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public void pool() { //맨앞의


    }



    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue();

        System.out.println("===stack enqueue ==");
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        System.out.println("===enqueue  status==");
        arrayQueue.show();

        System.out.println("===queue dequeue ==");
        arrayQueue.dequeue();

        System.out.println("===enqueue  status==");
        arrayQueue.show();

        System.out.println("===queue peek ==");
        arrayQueue.peek();


    }
}
