package Queue;
public class MyQueue {
private final int Default_Size=10;
int [] data;
int end;

MyQueue() {
    data = new int[Default_Size];
    end = -1;

}
MyQueue(int size){ //if you want to add more size then so
    data=new int[size];
    end=-1;
}

     public static void main(String[] args) {
        MyQueue queue = new MyQueue();//here we cannot refer queue as object becuse in interface it doesnt
                                                   //allow object to implement but we can implement class so we use linkedlist
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue.remove());

    }

public boolean isFull(){
    return  end == this.data.length-1;//point to last index
}

public boolean isEmpty(){
    return end==-1;
}

public  void   add(int item){
    if (isFull()){
        System.out.println("queue is full");
        return;
    }
    this.data[++end]=item;

}

public Integer remove() {
    if (isEmpty()) {
        System.out.println("queue is underflow");
        return null;
    }
    int temp= this.data[0];//saving data of the zero the postion
    for (int i = 0; i < end; i++) {

        this.data[i] = this.data[i + 1];
    }
    return temp;

}
}
