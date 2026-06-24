package Sorting;
import java.util.*;

public class Selection_sort{

    public static int[] Selection(int n,int[] arr){
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] res=Selection(n,arr);
        for(int i:res){
            System.out.print(i+" ");
        }

    }
}