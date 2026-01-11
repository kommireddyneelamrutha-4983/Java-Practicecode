import java.util.Scanner;
class Secondsmallest{
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
 
int smallest=Integer.MAX_VALUE;
int second=Integer.MAX_VALUE;

for(int i=0;i<arr.length;i++)
{
if(arr[i]<smallest)
{
second=smallest;
smallest=arr[i];
}
else if(arr[i]!=smallest && arr[i]<second)
{
second=arr[i];
}}
System.out.println("the second smallest element is :"+ second );
}}

