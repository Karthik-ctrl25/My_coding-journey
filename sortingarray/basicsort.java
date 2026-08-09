package sortingarray;
import java.util.*;
public class basicsort {
    public static void bubblesort(int sorta[]){
    int n=sorta.length;
    for(int turns=0;turns<n;turns++){
       for(int j=0;j<n-1-turns;j++){
        if(sorta[j]>sorta[j+1]){
            //swapping
            int temp=sorta[j];
            sorta[j]=sorta[j+1];
            sorta[j+1]=temp;
        }
       }
    }
}
public static void printARR(int sorta[]){
    for(int i=0;i<sorta.length;i++){
        System.out.print(sorta[i]+" ");
    }System.out.println();
}
    public static void main(String[] args) {
        int sorta[]={5,4,1,3,2};
        bubblesort(sorta);
        printARR(sorta);
    }
}
