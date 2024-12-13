//program to implement merge sort:
import java.util.Scanner;
public class mergesort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        System.out.println("Enter the "+size+" number :");
        int[] num = new int[size];
        for(int i =0;i<size;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("before sortion");
        for(int n:num){
            System.out.print(n +" ");
        }
        System.out.println();
        Mergesort(num,0,num.length-1);



        System.out.println("after sorting");
        for(int n:num){
            System.out.print(n +" ");
        }

    }
    private static void Mergesort(int[] num,int l,int r){
        if(l<r){
            int mid = (l+r)/2;
            Mergesort(num,l,mid);
            Mergesort(num,mid+1,r);
            merge(num,l,mid,r);
        }
    }
    private static void merge(int[] num,int l,int mid,int r){
        int n1=mid-l+1;
        int n2 = r-mid;
        int lnum[]=new int[n1];
        int rnum[]=new int[n2];
        for(int x=0;x<n1;x++){
            lnum[x]=num[l+x];
        }
        for(int x=0;x<n2;x++){
            rnum[x]=num[mid+1+x];
        }
        int i =0 ;
        int j=0;
        int k =l;
        while(i<n1&&j<n2){
            if(lnum[i]<=rnum[j]){
                num[k]=lnum[i];
                i++;
            }
            else{
                num[k]=rnum[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            num[k]=lnum[i];
            i++;
            k++;
        }
        while(j<n2){
            num[k]=rnum[j];
            j++;
            k++;
        }
    }
}
/* output:
Enter the array size: 
6
Enter the 6 number :
89
47
90
94
25
17
before sortion
89 47 90 94 25 17
after sorting
17 25 47 89 90 94 */