import java.util.*;
public class sorted {

    public static boolean searchingsort(int ma[][], int key){
        // top right search
        // int row=0;
        // int col=ma[0].length-1;
        // while (row<ma.length && col>=0) {
        //     if (ma[row][col]==key) {
        //         System.out.println("the number "+key+" is found at index ("+row+","+col+")");
        //         return  true;
        //     }
        //     else if (key<ma[row][col]) {
        //         //left side 
        //         col--;
        //     }
        //     else{
        //         //bottom 
        //         row++;
        //     }
        // }
        // System.out.println("the key is not found at MATRIX");
        // return false;

        // bottom left approch 
        int col=0;
        int row=ma[0].length-1;
        while (col<ma.length && row>=0) {
            if (ma[row][col]==key) {
                System.out.println("the number "+key+" is found at index ("+row+","+col+")");
                return  true;
            }
            else if (key<ma[row][col]) {
                //got to top 
                row--;
            }
            else{
                //got to right 
                col++;
            }
        }
        System.out.println("the key is not found at MATRIX");
        return false;  
    }
    public static void main(String[] args) {
        int ma[][]={{10,20,30,40},
                    {15,25,35,45},
                    {27,29,37,48},
                    {32,33,39,50}};
        int key=37;
        searchingsort(ma, key);
    }
}
