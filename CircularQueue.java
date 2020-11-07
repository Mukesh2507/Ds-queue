package Queue;

public class CircularQueue {
    private final int Default_Size=10;
    int[] data;
    int front;
    int end;
    int size;

//constructer
CircularQueue(){
    this.data=new int[Default_Size];
    this.front=0;
    this.end=-1;
    size=0;
}
CircularQueue(int size){

    this.data=new int[size];
    front=-1;
    end=-1;
    size=0;
}

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();//here we cannot refer queue as object becuse in interface it doesnt
        //allow object to implement but we can implement class so we use linkedlist
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }

public boolean isFull(){

    return size == data.length;
}

public boolean isEmpty(){

    return size==0;
}

public void add(int item){

    if (isFull()){
        System.out.println("overflow");

        return;
    }
    this.end=(end+1)%data.length;
    this.data[end]=item;
    size++;
}

public Integer remove(){

    if (isEmpty()){
        System.out.println("underflow");
        return null;
    }
    int temp=data[front];//save front variable
    this.front=(front+1)%data.length;
    size--;
    return temp;
}
}
