import java.util.*;
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinc
public class assignmt1 {
    public static boolean duplicatevalue(int nums[]){
       //brute force method 
        int n=nums.length;
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(nums[i]==nums[j]){
                return true;
            }
        }
       }return false;


    }
    
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
     System.out.println(duplicatevalue(nums));
    }
}
