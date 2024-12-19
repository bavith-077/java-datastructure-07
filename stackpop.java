//program to pop the element in the stack:
public class stackpop{
    public static void main(String args[])
    {
        stack nums =new stack();
        nums.push(4);
        nums.push(2);
        nums.push(3);
        nums.push(1);
        System.out.println(nums.pop());
        System.out.println(nums.peek());
        nums.printstack();
    }
}
class stack{
    private int[] arr =new int[5];
    int top ;
    int size ;
    public stack()
    {
        size= arr.length;
        int top = -1;
    }
    public int pop(){
         if(top>-1){
            return arr[top--];
        }
        else{
            System.out.println("stack underflow");
    }
        return 0;

    }
    public int peek(){
        return arr[top];
    }
    public void push(int data)
    {
        top++;
        if(top<size){
        arr[top]=data;
        }
        else{
            System.out.println("stack overflow");
        }
    }
    public void printstack(){
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}