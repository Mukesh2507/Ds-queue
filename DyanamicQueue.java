package Queue;

public class DyanamicQueue extends CircularQueue {
    @Override
    public void add(int item) {
        if (isFull()) {
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < size; i++) {

                temp[i] = data[(front + i)] % data.length;
            }
            this.data = temp;
        }
        super.add(item);
    }



    public static void main(String[] args) {
        DyanamicQueue queue = new DyanamicQueue();

        for (int i = 0; i < 1000; i++) {
            queue.add(i);

        }
        System.out.println(queue.remove());


    }
}
