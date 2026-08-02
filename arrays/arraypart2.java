import java.util.*;

public class arraypart2 {
    public static int linearSearch(int arr[], int key) {

        for(int i=0;i<arr.length;i++){
            if (arr[i]== key) {
                return i;

            }
        }
        return -1;
    }   

    public static int largetb(int arr[]){
        int large=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(large<arr[i]){
                large=arr[i];
            }
            if(small>arr[i]){
                small=arr[i];
            }
        }
        System.out.println("the smallest value is="+ small);
        return large;
    }
    public static int  binarys(int arr[],int key) {
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if (arr[mid]<key) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void reversing(int num[]) {
        int first=0,last=num.length-1;
        while (first<last) {
            int temp=num[last];
            num[last]=num[first];
            num[first]=temp;

            first++;
            last--;
        }
    }
    public static void pairs(int num[]) {
        for(int i=0;i<num.length;i++){
            int curr=num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+curr+","+num[j]+")");
            }System.out.println();
        }
    }
    public static void subarraysr(int num[]){
        int total=0;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(num[k]+" ");
                     }total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays: " + total);
    }
    public static void maxsubarray(int num[]){
        
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                int currsum=0;
                for(int k=start;k<=end;k++){
                    currsum+=num[k];
                }System.out.println(currsum);
                    if(currsum>maxsum){
                        maxsum=currsum;
                    }
                     
                }
            
                
            }
            System.out.println("the maxsum of subarrays is="+maxsum);
        }
     
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int arr1[]={2,4,6,8,10};
        int key=5;
        int index=linearSearch(arr, key);
        if(index==-1){
            System.out.println("key not found ");
        }else{
            System.out.println("key found at "+ index);
        }


        //to find larget and smallest value 
       System.out.println("the largets element is ="+ largetb(arr));


       // biary serach 
       System.out.println("the number is found at "+binarys(arr, key));

       //to reverse a number
       reversing(arr);
       //printing
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+"");
       }System.out.println();

       System.out.println("_________________________________________________");

       //the pairs of number
       pairs(arr);

       //suarrays
       
       subarraysr(arr1);

       //max subarray 
       maxsubarray  (arr1);
    }

}