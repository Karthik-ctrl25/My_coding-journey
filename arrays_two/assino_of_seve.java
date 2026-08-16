import java.util.*;
public class assino_of_seve {

    public static int printte(int mae[][],int key){
        int count=0;
        for(int i=0;i<mae.length;i++){
            for(int j=0;j<mae[0].length;j++)
            if(mae[i][j]==key){
                count++;
            }
        }
        return count;
            }
    public static void main(String[] args) {
        int mae[][]={{4,7,8},{8,8,7}};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the key");
        int key=sc.nextInt();
        int count = printte(mae, key);
System.out.println(count);
    }
}
