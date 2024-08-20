package Queues;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;  // ptr is at last index

    }

    public boolean isEmpty() {
        return size == 0;  // ptr is at last index

    }

    public boolean insert(int item) {   // on inserting end moves
        if (isFull()) {
            return false;
        }
        data[end] = item;
        end++;
        // data[end++] =  item;  // above two lines can be written like this
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {   // on removing front moves
        if (isEmpty())  {
            throw new Exception("queue is empty!!");
        }

        int removed = data[front++];  // use the value of front and then increase it by one
        front = front % data.length;  // value of front rotated in a range
        size--;

        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("queue is empty");
        }
        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + "-->");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }


}
