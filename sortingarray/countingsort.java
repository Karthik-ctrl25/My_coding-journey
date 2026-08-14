import java.util.*;

public class countingsort {

    public static void counringar(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.min(largest, arr[i]);
        }
        int count=new int [large+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;

        }
        int j=0;
        for(int i=0;j<count.length;i++){
            while (count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,1,3,7};
        
    }
}
