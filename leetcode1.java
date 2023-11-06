class SeatManager {
    public PriorityQueue<Integer> a = new PriorityQueue<>();

    public SeatManager(int n) {
        for (int i = 1; i <= n; i++) {
            a.add(i);
        }

    }

    public int reserve() {
        int value = a.peek();

        a.poll();

        return value;

    }

    public void unreserve(int seatNumber) {
        a.add(seatNumber);

    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */