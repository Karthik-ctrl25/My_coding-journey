import java.util.Scanner;

public class matrix_search {
    
    //for searching any element in arrray 
    public static boolean searchinarr(int matrix[][],int key){
    for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j]==key)
               {
                System.out.println("the number is found at index (" + i +","+ j +")");
                return true;
               }
            }
        }
        System.out.println("the key is not found ");
        return false;
            }
    public static void main(String[] args) {
        int matrix[][]=new int [3][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=sc.nextInt();
   }
}
        System.out.println("searching a key in matrix");
        //calling of function 
        searchinarr(matrix, 4);
        
    }
}

