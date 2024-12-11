//program to perform linear search:
import java.util.Scanner;
public class linearsearch{
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
        int result = linearsearchh(num,target);
        if(result!=-1){
            System.out.println("the entered target in the index of :"+result);
        }
        else{
            System.out.println("entered target is not there in the array:");
        }

    }
    public static int linearsearchh(int[] num,int target){
        int steps = 0;
        for(int i =0;i<num.length;i++){
            steps++;
            if(num[i]==target){
                System.out.println("the steps that taken for the linear search:"+steps);
                return i;
            }
        }
        System.out.println("the steps that taken for the linear search:"+steps);
        return -1;
    }
    

}
/*output:
Enter the array size: 
5
Enter the 5 number :
15
2
56
90
34
enter the target that need to be find in the array:
56
the entered target in the index of :2 */
