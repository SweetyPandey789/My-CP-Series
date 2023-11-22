//Program for merging two array in sorted form
import java .util.*;

public class MergeSortedArray{
public static void merge(int [] arr,int m,int n,int []arr2)
{
int i;
for( i=0;i<n;i++){
arr[i+m]=arr2[i];

}
Arrays.sort(arr);
for(i=0;i<arr.length;i++){

System.out.print(arr[i]+" ");
}
}
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("enter value of m and n");
int m=sc.nextInt();
int n=sc.nextInt();
int arr[]=new int [m+n];
int arr2[]=new int [n];
System.out.println("Enter first element of array");
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
System.out.println("Enter second element of array");
for(int j=0;j<arr2.length;j++)
{
arr2[j]=sc.nextInt();
}
System.out.println("Merged Array are:");
merge(arr,m,n,arr2);

}}
