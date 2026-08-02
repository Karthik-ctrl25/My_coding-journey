import java.util.*;

public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("hello");

        // String input = sc.next();
        // System.out.println(input);


        // //WHILE LOOP 
        // int n= sc.nextInt();
        // int sum=0;
        // int i=1;
        // while (i<=n) {
            
        //     sum=sum+i;
        //     i++;
        // }
        // System.out.print("sum is :-" + sum);

        //for loop
        // for(int line=1;line<=4;line++){
        //  System.out.println("****");
        // }
        // //in while 
        // int yline=1;
        // while (yline<=4) {
        //     System.out.println("*****");
        //     yline++;
        // }
        
        //printing REVERESE A NUMBER
//         int x=254386;
//         while (x>0) {
//             int lastd=x%10;
//             System.out.print(lastd);
//             x=x/10;
//         }
//         System.out.println();

// System.out.println("the revering of number");
        //revering a number
        // int y=19543;
        // int rev=0;
        // while (y>0) {
        //     int lastdi=y%10;
        //     rev=(rev*10)+lastdi;
        //     y=y/10;

        // }System.out.println(rev);


        // print stars
   int n=4;
        for(int line=1;line<=n;line++){
            for(int star=1;star<=n-line+1;star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    

    for(int i=1;i<=4;i++)
    {
        for(int number=1;number<=i;number++){
            System.err.print(number);
        }System.out.println();
    }
      char chara='A';
    for(int is=1;is<=4;is++)
    {
        for(int number=1;number<=is;number++){

            System.err.print(chara);
            chara++;
        }System.out.println();
    }
    }

}

