import java.util.*;
public class ArrayPart1{

    public static int linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
             return i;
            }
            
        }return -1;
    }



    public static int findlargst(int numbers[]){
        int large=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if (numbers[i]>large) {
                large=numbers[i];
            }
            if(numbers[i]<small){
                small=numbers[i];
            }
        }System.out.println("the smallest vaue is "+small);
        return large;
    }

    public static int bianrySearch(int bnum[],int keyx){
     int start=0,end=bnum.length-1;
     while (start<=end) {
        int mid=(start+end)/2;
        if (bnum[mid]==keyx) {
            return mid;
        }
        if (bnum[mid]<keyx) {
            start=mid+1;
        }else{
            end=mid-1;
        }
     }return -1;
    }
    
public static void reverse(int numberss[]){
    int first=0,last=numberss.length-1;
    while (first<last) {
        int temp=numberss[last];
        numberss[last]=numberss[first];
        numberss[first]=temp;

        first++;
        last--;
    }
}
public static void subarray(int numbersX[]){
    int ts=0;
    for (int i = 0; i < numbersX.length; i++) {
        int start=i;
        for (int j = 0; j < numbersX.length; j++) {
            int end=j;
            for (int k = start; k <= end; k++) {
                
                System.out.print(numbersX[k]+" ");

            }ts++;
            System.out.println();
        }System.out.println();
    }
    System.out.println("the total subarrays are ="+ts   );
}
//sum of subarray
public static void sumsubarray(int numbersX[]){
    int cursum=0;
    int maxsum=Integer.MIN_VALUE;
    for (int i = 0; i < numbersX.length; i++) {
        int start=i;
        for (int j = 0; j < numbersX.length; j++) {
            int end=j;
            cursum=0;
            for (int k = start; k <= end; k++) {
                
                cursum +=numbersX[k];
    System.out.println(cursum);
            }if (maxsum<cursum) {
                maxsum=cursum;
            }
        }
    }
    System.out.println("maximum sum is ::"+maxsum);
}

    public static void main(String[] args) {
        
    //     int marks[]=new int[100];
    //     Scanner sc=new Scanner(System.in);
    //     marks[0]=sc.nextInt();
    //     marks[1]=sc.nextInt();
    //     marks[2]=sc.nextInt();
    //    System.out.println("physics :"+marks[0]);
    //    System.out.println("maths :"+marks[1]);
    //    System.out.println("hindi :"+marks[2]);

    //    marks[2]=25;

    //    System.out.println(marks.length);
            
      
     Scanner sc=new Scanner(System.in);
    int numbers[]={23,12,54,42,657523,43,6662};
      int key=12;
      int index=linearSearch(numbers, key);
      if (index==-1) {
        System.out.println("not found");
      }else{
        System.out.println("The number found at"+index);
      }

      System.out.println("largest number is "+findlargst(numbers));
      

      //bianry search will have elemnts always sorted way 
      int bnum[]={1,23,45,65,76,87,98};
      int keyx=76;
      System.out.println("index for key is "+bianrySearch(bnum, keyx));



      //reversing number 
      int numberss[]={2,3,4,5,6};
      reverse(numberss);
      for(int i=0;i<numberss.length;i++){
        System.out.print(numberss[i]+" ");
      }
System.err.println();




// SUBARRAY 
     int numbersX[]={2,4,6,8,10};
     subarray(numbersX);
     sumsubarray(numbersX);


    }
}
