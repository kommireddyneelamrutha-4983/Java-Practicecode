import java.util.Scanner;
class ReverseArray{
public static void main(String[]args)
{
 Scanner sc= new Scanner(System.in);
 System.out.println("enter the size of array");
 int n=sc.nextInt();
 int arr[]=new int[n];
 for(int i=0;i<n;i++)
 {
 System.out.println("enter elements of array" + i + " ");
  arr[i]=sc.nextInt();
 }
  System.out.println("the  elements of array are ");
 for(int i=0;i<n;i++)
 {

 System.out.println(arr[i]);
 }
 int left=0;
 int right=arr.length-1;
 while(left<right){
 int temp=arr[left];
 arr[left]=arr[right];
 arr[right]=temp;
 left++;
 right--;
}
System.out.println("the  elements of array are ");
 for(int i=0;i<n;i++)
 {
 
 System.out.println( arr[i]);
 }}}
