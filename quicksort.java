//program to implement quick sort :
import java.util.Scanner;
public class quicksort{
    public static void Quicksort(int[] num,int low,int high){
        if(low<high){
            int pi = partition(num,low,high);
            Quicksort(num,low,pi-1);
            Quicksort(num,pi+1,high);

        }
    }
    private static int partition(int[] num,int low,int high){
        int pivot = num[high];
        int i = low-1;
        for(int j =low;j<high;j++){
            if(num[j]<pivot){
                i++;
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;           
            }

        }
        int temp = num[i+1];
        num[i+1] = num[high];
        num[high] = temp;   
        return i+1;

    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        System.out.println("Enter the "+size+" number :");
        int[] num = new int[size];
        for(int i =0;i<size;i++){
            num[i]=sc.nextInt();
           
        }
         Quicksort(num,0,num.length-1);
         for(int nums:num){
            System.out.print(nums+" ");
         }
    }
   
}
/*output:
Enter the array size: 
6
Enter the 6 number :
54
78
34
90
61
49
34 49 54 61 78 90 */