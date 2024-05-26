public class Circularqueue {

    static class makeq {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        makeq(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front =-1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front ==-1;
        }

        public static boolean full(){
            return (rear+1)%size ==front;
        }

        public static void add(int data) {
            if (full()) {
                System.out.println("Queue is full ");
                return;
            }

            if(front ==-1){
                front =0;
            }

            rear = (rear + 1)%size;

            arr[rear] = data;

        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];

                // last element
                if(rear == front){
                    rear=front=-1;
                }
                else{
                    front =(front+1)%size;
                }
            return front;

        }

        // peak

        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String args[])
    {

        makeq a =new makeq(3);
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(a.remove());
        a.add(4);
        System.out.println(a.remove());
        a.add(5);



        while (!a.isEmpty()) {
            System.out.println(a.peek());
            a.remove();
        }
    }

}
