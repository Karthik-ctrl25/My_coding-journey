import java.util.Scanner;

public class Stringsclass {
    
     public static void printingele(String str)
        {
            for(int i=0;i<str.length();i++)
            {
                System.out.print(str.charAt(i)+" ");
            }
            System.out.println( );
        }
        public static boolean pallindrome(String strp) {
            for(int i=0;i<strp.length()/2;i++)
            {
                int n=strp.length();
                if (strp.charAt(i)!=strp.charAt(n-i-1)) {
                    return false;
                }
                
            }
            return true;
        }

        public static float shortestpath(String path)
        {
            int x=0 ,y=0;
           for(int i=0;i<path.length();i++)
           {
            char dir=path.charAt(i);
            if (dir=='s') {
                y--;
            }
            else if (dir=='n') {
                y++;
            } else if (dir=='e') {
                x++;
            } else {
                x--;
            } 
           }
           int x2=x*x;
           int y2=y*y;
           return (float)Math.sqrt(x2+y2);
        }
        public static String substringfunc(String newsub,int si,int ei)
        {
          String subsstr="";
          for(int i=si;i<ei;i++)
          {
            subsstr+=newsub.charAt(i);
          }return subsstr;
        }
        //COMPRESS FUNCTION
        public static String compress(String str) {
    String newStr = "";

    // aaabc
    for (int i = 0; i < str.length(); i++) {
        Integer count = 1;

        while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
            count++;
            i++;
        }

        newStr += str.charAt(i);
        if (count > 1) {
            newStr += count.toString();
        }
    }

    return newStr;
}

    public static void main(String[] args) {
        String s1="Karthik";
        String s2= new String("King");
        System.out.println( s1);
        System.out.println(s2);
        System.out.println("-----------");
        // String comparision
        System.out.println("String comparision");
        
        if (s1.equals(s2)) {
            System.out.println("String are  equal");
        }else{
            System.out.println("Strings are not equal ");
        }
        
        // concatation
        System.out.println("-----------");
        System.out.println("concatation");
        
        String con;
        System.out.println(con=s1+ ", " +s2);
        printingele(con);
        Scanner sc=new Scanner(System.in);
        String news;
        news=sc.nextLine();

        System.out.println(news);
        System.out.println("-----------");
        System.out.println(news.length());
        
        // palindrome
        System.out.println("-----------");
        System.out.println("pallindrome");
        
        System.out.println("enter the String to check whether the String is palindrome or not");
        String element=sc.nextLine();
        System.out.println("the String is " + pallindrome(element));
        // nxt question
        System.out.println("nxt question");
        String pathx="ns";
        System.out.println(shortestpath(pathx));
        //subString 
        System.out.println("-----------");
        System.out.println("SubString function");
        String strne="hello world";
        System.out.println(substringfunc(strne,0,5));
        // Question Largest of strings 
        System.out.println("-----------");
        System.out.println("Question Largest of strings ");
        String fruits[]={"Apple", "Mango", "Banana"};
        String LargestStr=fruits[0];
        for(int i=1;i<fruits.length;i++)
        {
            if (LargestStr.compareTo(fruits[i])<0) {
                LargestStr=fruits[i];
            }
        }
        System.out.println(LargestStr);

        System.out.println("-----------");
        System.out.println("sTRING BUILDER ");///// to incresae memory efficecny
         StringBuilder sb = new StringBuilder("");
         for(char ch='a';ch<='z';ch++)
         {
            sb.append(ch);
         }
         System.out.println(sb);
         System.out.println("-----------");// STRING COMPRESSION
         String strQ = "aaabbc";
    System.out.println(compress(strQ));
        



    ///HOME WORK 
    /// CounthowmanytimeslowercasevowelsoccurredinaStringenteredbytheuser
      
    
    
    }

       
    }

