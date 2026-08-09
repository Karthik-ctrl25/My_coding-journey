import java.util.Arrays;

public class inbuiltsort {
    public static void main(String[] args) {
        int arrc[]={5,4,1,3,2};
        int arrp[]={7,5,1,3,2};
        //basic sort 
        Arrays.sort(arrc);
        System.out.println(Arrays.toString(arrc));

        //sorting from where we need 
         Arrays.sort(arrp,0,3);
        System.out.print(Arrays.toString(arrp));

        
    }
}
