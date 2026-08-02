public class javapatterns {
    public static void main(String args[])
    {
        System.out.println(" the output for hallow ");
        hallowfunction(4,5);
        System.out.println(" ");
        System.out.println(" the output for rotated inverted half");
        rotatedinvertedhalf(4);
        System.out.println(" the output for inverted half");
        invertedhalfx(5);
        System.out.println(" the output for zero and 1 triangle");
        zeroto1triangle(5);
        System.out.println(" butterfly pattern");
        BUTTERFLY(4);
         System.out.println(" solid rombus");
        Solid_rhombus( 5);
        System.out.println("hollow rombus");
        hollow_rhomus(5);
    }
        /*for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4-i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();          // *
                                              **
                                              ***
                                              ****
        }
        char ch='A';
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
           System.out.println(); // A
                                   // Bc
                                   // DEF
                                   // GHIJ
        }
 */
              
     
     
         


 public static void hallowfunction(int totalrows,int totalcolmns)
               {
         for(int i=1; i<=totalrows;i++)
         {
            for(int j=1; j<=totalcolmns;j++)
            {
                if (i == 1 || i == totalrows || j == 1 || j == totalcolmns)
 {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println(" ");
         }
          
    }



    public static void rotatedinvertedhalf(int n) {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
             System.out.print("");
            }
        

        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}



 public static void invertedhalfx(int n)
     {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
             System.out.print(j+"");
            }
            System.out.println("");
        

        
    }
}

 public static void zeroto1triangle(int n)
     {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if ((i+j)%2==0) {
                    System.out.print("1");
                }else{
             System.out.print("0");
            }
        }
            System.out.println("");
        

        
    }
}

public static void BUTTERFLY(int n)
{
    for(int i=1;i<=n;i++)
    {
        //stars
        for(int j=1;j<=i;j++)
            {
             System.out.print("*");
            }
            //spaces
             for(int j=1;j<=2*(n-i);j++)
            {
             System.out.print(" ");
            }
            //stars-i
             for(int j=1;j<=i;j++)
            {
             System.out.print("*");
            }System.out.println();
    }
    for(int i=n;i>=1;i--)
    {
        //stars
        for(int j=1;j<=i;j++)
            {
             System.out.print("*");
            }
            //spaces
             for(int j=1;j<=2*(n-i);j++)
            {
             System.out.print(" ");
            }
            //stars-i
             for(int j=1;j<=i;j++)
            {
             System.out.print("*");
            }
            System.out.println();
    }
    
    
}

public static void Solid_rhombus(int n)
{
    for(int i=1;i<=n;i++)
    {
     // spaces
     for(int j=1;j<=(n-i);j++)
     {
        System.out.print(" ");
     }
     // stras
     for(int j=1;j<=n;j++)
     {
        System.out.print("*");
     }
     System.out.println();
    }

}
public static void  hollow_rhomus(int n)
{
    for(int i=1;i<=n;i++)
    {
     // spaces
     for(int j=1;j<=(n-i);j++)
     {
        System.out.print(" ");
     }
     // hallow rectangle 
      for(int j=1; j<=n;j++)
            {
                if (i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println(" ");
}
}}