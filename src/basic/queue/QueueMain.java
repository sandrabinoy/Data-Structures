package basic.queue;

public class QueueMain {

    public static void main(String[] args) {

        ResizableQueue<Integer> queue = new ResizableQueue<>();

        int n = 15;
        for(int i = 0; i < n; i++) {
            queue.enqueue(i);
        }

        for(int i = 0; i < n; i++) {
            System.out.println(queue.dequeue());
        }

    }

}
