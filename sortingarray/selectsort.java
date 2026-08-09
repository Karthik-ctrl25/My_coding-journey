import java.util.*;


public class selectsort {

    //time completixty is O(n^2)
    public static void selecrionsort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minPos=i;
            for(int j=i+1;j<n;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;

                }
            }
            //swaping
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void theprint(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.err.print(+arr[i]+" ");  
           }
System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        selecrionsort(arr);
        theprint(arr);
    }
}
