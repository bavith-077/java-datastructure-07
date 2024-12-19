//program to implement queue in array:
public class Queue{
    public static void main(String args[]){
        queues queue = new queues();
        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(25);
        queue.enqueue(65);
        queue.show();

    }
}
public class queues{
    private int front=0;
    private int rear=-1;
    private int size=0;
    private int[] arr= new int[4];
    public void enqueue(int data){
        rear=(rear+1)%4;
        arr[rear]=data;
        size++;

    }
    public void show(){
        for(int i=front;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public int dequeue(){
        int data = arr[front];
        front=(front+1)%4;
        size--;
        return data;
    }

}