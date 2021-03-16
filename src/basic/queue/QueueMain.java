package basic.queue;

import java.util.Locale;
import java.util.Scanner;

public class QueueMain {

    public static void main(String[] args) {

        ResizableQueue<Integer> queue = new ResizableQueue<>();
        Scanner scanner = new Scanner(System.in);

        int option = 0;

        int n = 15;

        String ch = "no";

        while(ch != "y") {
            System.out.println("Do you want to quit? (y/n)");

            ch = scanner.next().toLowerCase(Locale.ROOT);

            System.out.println("Option 1: Enqueue" +
                    "Option 2: Dequeue" +
                    "Option 3: Display" +
                    "Option 4: Peek (First Item in the list)");

            option = scanner.nextInt();
            switch (option) {

                case 1: for (int i = 0; i < n; i++) {
                    queue.enqueue(i);
                }
                    break;

                case 2: for (int i = 0; i < n; i++) {
                    System.out.println(queue.dequeue());
                }
                    break;

                case 3: if(queue.display() != null) {
                    Integer[] arr = queue.display();
                    for(int i = 0; i < n; i++) {
                        System.out.println(arr[i]);
                    } }
                else
                    System.out.println("No items in the queue to display");
                    break;

                case 4: Integer front = queue.peek();
                    if(front == null) {
                        System.out.println("No items in the queue");
                    }
                    else
                        System.out.println(front);
                    break;

            }
        }

    }

}
