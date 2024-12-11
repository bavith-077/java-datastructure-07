//program to implement selectionsort:
import java.util.Scanner;
public class bubblesort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        System.out.println("Enter the "+size+" number :");
        int[] num = new int[size];
        for(int i =0;i<size;i++){
            num[i]=sc.nextInt();
        }
        int temp =0;
        int minIndex = -1;
        System.out.println("the array before sorting:");
        for(int nums : num){
            System.out.print(nums+" ");
        }
        for(int i=0;i<size-1;i++){
            minIndex = i;
            for(int j=i;j<size;j++){
                if(num[minIndex]>num[j]){
                    midIndex = j;
                }
            }
             temp = num[minIndex];
             num[minIndex]=num[i];
             num[i]=temp;
             System.out.println();
             for(int nums : num){
            System.out.print(nums+" ");
             }
        }
      
        System.out.println();
        System.out.println("after sorting:");
        for(int nums : num){
            System.out.print(nums+" ");
        }
    }
}
/*output:
Enter the array size: 
5
Enter the 5 number :
7
5
8
3
9
the array before sorting:
7 5 8 3 9
3 5 8 7 9
3 5 8 7 9
3 5 7 8 9
3 5 7 8 9
after sorting:
3 5 7 8 9   */

