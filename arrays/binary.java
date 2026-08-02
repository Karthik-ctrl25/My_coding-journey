import java.util.*;
public class binary{
  public static int BinarySearch(int bin[],int key)
  {
  int start=0, end=bin.length-1;
  while (start<=key) {
    int mid=(start+end)/2;
    if (bin[mid]==key) {
      return mid;
    }
    if (bin[mid]<key) {
      start=mid+1;
    } else {
      end=mid-1;
    }
  }
  return -1;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the numbers to be added in array ");
    int n=sc.nextInt();
    int bin[]=new int[n];
    System.out.println("enter" + "number");
    for(int i=0;i<n;i++)
    {
      bin[i]=sc.nextInt();
    }
    System.out.println("enter the number to be found");
    int key=sc.nextInt();
    System.out.println("index for the key is " + BinarySearch(bin,key));
  }
}