package ClassFiles;

import java.util.NoSuchElementException;

public class MyQueue<T> {
    private QueueNode<T> first;
    private QueueNode<T> last;

    private static class QueueNode<T>
    {
        private T data;
        private QueueNode<T> next;
        public QueueNode(T item) {
            this.data = item;
        }
    }

    public void enqueue(T item){
        QueueNode<T> t = new QueueNode<T>(item);
        if(last!=null)
        {
            last.next = t;
        }
        last = t;
        if (first == null)
        {
            first = last;
        }
    }

    public T dequeue(){
        if (first == null)
            throw new NoSuchElementException();

        T data = first.data;
        first = first.next;

        if (first == null)
            last =null;
        return data;
    }

    public T peek(){
        if (first ==null)
            throw new NoSuchElementException();
        return first.data;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public static void main(String[] args)
    {
//        MyQueue<Integer> myQueue = new MyQueue<Integer>();
//        myQueue.first = new QueueNode<Integer>(1);
//        myQueue.last = myQueue.first;
//
//        myQueue.enqueue(2);
//        int value = myQueue.dequeue();

        ReverseString("madam");
    }
    public static void ReverseString(String A)
    {
        char[] charArray = A.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = charArray.length -1; i>=0;i--)
        {
            sb.append(charArray[i]);
        }

        if(sb.toString().equals(A))
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}

