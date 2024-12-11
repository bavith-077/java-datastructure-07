//program to implement insertion sort:
import java.util.Scanner;
public class insertionsort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        System.out.println("Enter the "+size+" number :");
        int[] num = new int[size];
        for(int i =0;i<size;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("the array before sorting:");
        for(int nums : num){
            System.out.print(nums+" ");
        }
        for(int i=0;i<size;i++){
            int key = num[i];
            int j = i-1;
            while(j>=0&&num[j]>key){
                num[j+1]=num[j];
                j--;
            }
            num[j+1]=key;
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
4
9
6
1
the array before sorting:
7 4 9 6 1
after sorting:
1 4 6 7 9 */

