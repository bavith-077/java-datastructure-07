//program to implement bubble sort :
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
        System.out.println("the array before sorting:");
        for(int nums : num){
            System.out.println(nums+" ");
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(num[j]>num[j+1]){
                    temp = num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("after sorting:");
        for(int nums : num){
            System.out.println(nums+" ");
        }
    }
}