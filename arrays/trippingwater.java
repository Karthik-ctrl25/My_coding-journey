import java.util.*;
public class trippingwater{
   public static int trapped(int height[]){
   int n=height.length; 
   int leftmax[]=new int[n];//auxillary array1
   leftmax[0]=height[0]; //insialize the array to first one 
   for(int i=0;i<n;i++){
    leftmax[i]=Math.max(height[i],leftmax[i-1]); //taking the maximum height
   }
   int rightmax[]=new int[n];//auxillary array2
   rightmax[n-1]=height[n-1];//insialize the array to last one
   for(int i=n-2;i>=0;i--){
    rightmax[i]=Math.max(height[i], rightmax[i+1]);//taking the maximum height
   }
   int trappedwater=0;
   for(int i=0;i<n;i++){
    int waterlevel=Math.min(leftmax[i], rightmax[i]);
    trappedwater+=waterlevel-height[i];
   }
    return trappedwater;
   }
    public static void main(String[] args) {
        int height[]= {4,2,0,6,3,2,5};
        System.out.println(trapped(height));
    }
    
}
