import java.util.*;  

public class arraypart3{

public static  void printpair(int xnumbers[]){
  int tp=0;
  for(int i=0;i<xnumbers.length;i++)
  {
    int curr=xnumbers[i];
      for(int j=i+1;j<xnumbers.length;j++){
        System.out.print("("+curr+","+ xnumbers[j]+")");
        tp++;
      }
    System.err.println();
  }
  System.err.println("total pairs is :"+tp);
}
public static void subarrray(int xnumbers[])
{
  for(int i=0;i<xnumbers.length;i++)
  {
    int start=i;
    for(int j=i;j<xnumbers.length;j++)
    {
      int end=j;
      for(int k=start;k<=end;k++)
      {
        int sum=0;
      System.out.print(xnumbers[k]+" ");
      sum=xnumbers[k]+1;
    }
    System.out.println();
  }
  System.out.println();
  }
}
public static void maxsubarrray(int xnumbers[])
{
  int current_sum=0;
    int maxSum=Integer.MIN_VALUE;
  for(int i=0;i<xnumbers.length;i++)
  {
    int start=i;
    for(int j=i;j<xnumbers.length;j++)
    {
      int end=j;
      current_sum=0;
      for(int k=start;k<=end;k++)
      {
      // sub array sum
      current_sum +=xnumbers[k];
      
    }
    System.out.println("the sum is now ="+current_sum);
    if(maxSum<current_sum)
    {
      maxSum=current_sum;
    }
    
  }
  
  }
  System.out.println("maxmium sum="+maxSum);
}
public static void prefixarrray(int xnumbers[])
{
int current_sum=0;
    int maxSum=Integer.MIN_VALUE;
    int prefix[]=new int[xnumbers.length];
    prefix[0]=xnumbers[0];
    //calculate prefix array
  for(int i=0;i<xnumbers.length;i++)
  {
    int start=i;
    for(int j=i;j<xnumbers.length;j++)
    {
      int end=j;
      current_sum=0;






    }
  }}
  public static void main(String[] args)
  {
  int xnumbers[]={2,4,6,8,10};
  printpair(xnumbers);
  subarrray(xnumbers);
  System.out.println("________________________________________________________________________________________________");
  maxsubarrray(xnumbers);


  
  }

}