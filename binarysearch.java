//program to perform binary search:
import java.util.Scanner;
public class binarysearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        System.out.println("Enter the "+size+" number :");
        int[] num = new int[size];
        for(int i =0;i<size;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("enter the target that need to be find in the array:");
        int target = sc.nextInt();
        int result = binarysearchh(num,target);
        if(result!=-1){
            System.out.println("the entered target in the index of :"+result);
        }
        else{
            System.out.println("entered target is not there in the array:");
        }

    }
    public static int binarysearchh(int[] num,int target){
        int left = 0;
        int right = num.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(num[mid]==target){
                return mid;
            }
            else if(num[mid]<target){
                left = mid+1;
            }
            else{
                right=mid-1;
            }

        }
        return -1;
    }
    

}
/*output:
Enter the array size: 
5
Enter the 5 number :
12
90
78
35
32
enter the target that need to be find in the array:
12
the entered target in the index of :0 */