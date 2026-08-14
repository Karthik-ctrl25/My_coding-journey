import java.util.*;
public class large_small {
    public static int largeorsmall(int mar[][]){
        int small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
     for(int i=0;i<mar.length;i++){
            for(int j=0;j<mar[0].length;j++){
                if(mar[i][j]>large){
                    large=mar[i][j];
                }
                if(mar[i][j]<small){
                    small=mar[i][j];
                }
             }
        }
        System.out.println("the smallest element is "+small);
        return large;

    }
    public static void main(String[] args) {
        int mar[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        //reading any input 
        for(int i=0;i<mar.length;i++){
            for(int j=0;j<mar[0].length;j++){
                mar[i][j]=sc.nextInt();
            }
        }
//the calling fucntion

System.out.println("the largest elemnt is "+ largeorsmall(mar));
    }
}
