import java.util.Arrays;

class TripletPairsSum
{
public static  int[]sumPair(int arr[],int target)
{
 int n=arr.length;
 int pairs[][]=new int[n][2];
  
  for(int i=0;i<n;i++)
  {
   pairs[i][0]=arr[i];
   pairs[i][1]=i;
  }
   Arrays.sort(pairs,(a,b) -> a[0]-b[0]);
   
   for(int i=0;i<n;i++)
   {
   int left=i+1;
   int right=n-1;
   while(left<right)
   {
    int sum= pairs[i][0]+pairs[left][0]+pairs[right][0];
    if(sum==target)
    {
    return new int[]{pairs[i][1],pairs[left][1],pairs[right][1]};
    }
    else if(sum<target)
    {
    left++;
    }
    else
    {
    right--;
    }}}
    return null;
    }
    public static void main(String[]args)
    {
    int arr[]={10,20,40,50,35};
    int target=110;
    int result[]=sumPair(arr,target);
    if(result !=null)
    {
    System.out.println("original indices:"+ result[0] + " " + result[1] + " " + result[2]);
    System.out.println("original indices:"+ arr[result[0]] + " " + arr[result[1] ]+ " " + arr[result[2]]);
    }
    else
    {
    System.out.println("no pair found");
    }}}
   
   
   
    
   
