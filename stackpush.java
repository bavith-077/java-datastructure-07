//program to implement the stack by using array ;
public class stackpush{
    public static void main(String args[])
    {
        stack nums =new stack();
        nums.push(4);
        nums.push(2);
        nums.push(3);
        nums.push(1);
        nums.push(10);
        nums.printstack();
    }
}
class stack{
    private int[] arr =new int[6];
    int top ;
    int size ;
    public stack()
    {
        size= arr.length;
        int top = -1;
    }
    public void push(int data)
    {
        top++;
        arr[top]=data;
    }
    public void printstack(){
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}