import java.util.*;
public class diagonalma {
   
   public static int diagonalms(int matrix[][]){

    int sum=0;
    // // Brute force 
    // for(int i=0;i<matrix.length;i++){
    //     for(int j=0;j<matrix.length;j++){
    //         //primary diagonal
    //         if (i==j) {
    //             sum+=matrix[i][j];
    //         }
    //         else if (i+j==matrix.length-1) {
    //             sum+=matrix[i][j];
    //         }
    //     }
    // }

    //Optimized method
    for(int i=0;i<matrix.length;i++){
        //primary diagonal

        sum+=matrix[i][i];


        if (i!=matrix.length-1-i) {
            sum+=matrix[i][matrix.length-i-1];
        }
    }
    return sum;
   }
   public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                   {5,6,7,8},
                   {9,10,11,12},
                   {13,14,15,16}};
                   
                  System.out.println("the sum of diagonal elemnts is = "+ diagonalms(matrix));
        
    }
}
