import java.util.*;
public class palindrome {

    public static boolean palindromes(String str){
        for(int i=0;i<str.length()/2;i++){
        int n=str.length();
        if (str.charAt(i)!=str.charAt(n-1-i)) {
            //not a palindrome
            System.out.println("it is not a palindrome ");
            return false;
        }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the word ");
        String str=sc.nextLine();
        System.out.println(palindromes(str));
    }
}
