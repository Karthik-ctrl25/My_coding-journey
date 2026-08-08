import java.util.*;
public class rotated_binary {
    public static int binarysearch_function(int nums[],int key){
    int start=0;
    int end=nums.length-1;
    while(start<=end){
        int mid=(start+end)/2;
        // Target found
        if (nums[mid]==key) {
            return mid;
        }
        if (nums[start]<=nums[mid]) { //left half sorted 
            if ((key>=nums[start])&&key<(nums[mid])) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        else{
        if((key>=nums[mid])&& (key<=nums[end])){ //right half sorted
            start=mid+1;
        }
        else{
            end=mid-1;
        }}
    }return -1;
    }

    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
       int key=2;
       System.out.println(binarysearch_function(nums, key));
    }
}
