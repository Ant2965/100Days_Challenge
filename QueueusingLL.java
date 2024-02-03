public class QueueusingLL {

    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;

        }

        static class Queue {
            static node head = null;
            static node tail = null;

            public static boolean isEmpty() {
                return head == null && tail == null;
            }

            public static void add(int data) {
                node a = new node(data);

                if (head == null) {
                    head = a;
                    tail = a;
                    return;
                }

                tail.next = a;
                tail = a;
            }

            public static int remove() {
                if (isEmpty()) {
                    System.out.println("empty");
                    return -1;
                }
                if (tail == head) {
                    tail = head = null;
                    return -1;
                } else {
                    head = head.next;
                }

                int front = head.data;

                return front;
            }

            public static int peek() {
                if (isEmpty()) {
                    System.out.println("Empty queue");
                    return -1;
                }
                return head.data;
            }

        }

        public static void main(String args[]) {
            Queue a = new Queue();

            a.add(1);
            a.add(2);

            a.add(3);

            while (!a.isEmpty()) {
                System.out.println(a.peek());
                a.remove();
            }

        }
    }
}
