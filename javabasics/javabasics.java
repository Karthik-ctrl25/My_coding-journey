import java.util.*;

public class javabasics{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); // single Scanner reused everywhere (was re-declared ~4 times, which is illegal)

        // ---------- basic input (String) ----------
        {
            String input = sc.next(); // reads one token, compulsory basic input
            System.out.println(input);
        }

        // ---------- paragraph input ----------
        {
            sc.nextLine(); // flush leftover newline left by next(), otherwise nextLine() below reads "" immediately
            String name = sc.nextLine(); // reads a full line
            System.out.println(name);
        }

        // ---------- int input ----------
        {
            int put = sc.nextInt();
            System.out.println(put);
        }

        // ---------- float input ----------
        {
            float ut = sc.nextFloat();
            System.out.println(ut);
        }

        // ---------- sum of two ints ----------
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println(sum);
        }

        // ---------- product of two ints ----------
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int product = x * y;
            System.out.println(product);
        }

        // ---------- area of circle ----------
        {
            final double PI = 3.142; // was declared twice (double and float with same name) - kept one
            float r = sc.nextFloat();
            double areaOfCircle = PI * r * r;
            System.out.println(areaOfCircle);
        }

        // ---------- char basics ----------
        {
            char z = 'a';
            char e = 'b';
            System.out.println(e);
            System.out.println((int) e);
            System.out.println(z);
            System.out.println(e - z); // difference of char codes -> 1
        }

        // ---------- h/w 1: average of 3 numbers ----------
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            float avg = (a + b + c) / 3.0f; // original did a+b+(c/3) due to missing brackets and int division
            System.out.println(avg);
        }

        // ---------- h/w 2: square of a number ----------
        {
            float s = sc.nextFloat();
            System.out.println(s * s);
        }

        // ---------- h/w 3: total price of pen, pencil, eraser ----------
        {
            System.out.print("Enter the price of pen: ");
            float pen = sc.nextFloat();
            System.out.print("Enter the price of pencil: ");
            float pencil = sc.nextFloat();
            System.out.print("Enter the price of eraser: ");
            float eraser = sc.nextFloat();
            float total = pen + pencil + eraser;
            System.out.println("The total price is: " + total);
        }

        // ---------- $ as a valid identifier ----------
        {
            int $ = 24;
            System.out.println($);
        }

        // ---------- operators: +,-,<,>,<=,>=,==,++,--,%,*,!,!= ----------
        {
            int A = 12;
            int B = 13;
            int sum = A + B;
            System.out.println((A == B) && (A > B));
            System.out.println((A <= B) || (A > B));
            System.out.println(A != B);
            System.out.println("add :" + sum);
            A += B; // compound assignment done first, then printed separately
            System.out.println(A);
            System.out.println("A" + A);
        }

        // ---------- income tax slabs ----------
        {
            System.out.println("ENTER THE INCOME");
            int income = sc.nextInt();
            float tax;
            if (income < 5) {
                tax = 0;
            } else if (income >= 5 && income < 10) { // was (income>5)&&(income<10), left out 5 exactly
                tax = income * 0.2f;
            } else {
                tax = income * 0.3f;
            }
            System.out.println("THE TAX IS=" + tax);
        }

        // ---------- largest of three numbers ----------
        {
            System.out.println("ENTER THE NUMBERS TO CHECK:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a >= b && a >= c) {
                System.out.println("a is greatest" + a);
            } else if (b >= c) {
                System.out.println("the largest is " + b);
            } else {
                System.out.println("the largest is c" + c);
            }
        }

        // ---------- switch on operator ----------
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            char operator = sc.next().charAt(0); // was .char(0), not a real method - charAt(0) is correct

            switch (operator) {
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '/':
                    System.out.println(a / b);
                    break;
                case '%':
                    System.out.println(a % b);
                    break;
                default:
                    System.out.println("wrong");
                    break;
            }
        }

        // ---------- while, do-while, for loops, break ----------

        // print 1..ra
        {
            int ra = sc.nextInt();
            int i = 1; // was never declared/initialized in the original
            while (i <= ra) {
                System.out.println(i + "");
                i++;
            }
            System.out.println(" ");
        }

        // sum 1..ra
        {
            int ra = sc.nextInt();
            int i = 1;
            int sum = 0;
            while (i <= ra) {
                System.out.println(i + "");
                sum = sum + i;
                i++;
            }
            System.out.println("the total sum is :" + sum);
        }

        // for loop printing 0..ra
        {
            int ra = sc.nextInt();
            for (int i = 0; i <= ra; i++) {
                System.out.println(i);
            }
        }

        // reverse a number (the "****" for-loop was wrongly nested inside this
        // while loop in the original, printing stars once per digit; moved out
        // as its own separate exercise below)
        {
            int n = 10899;
            int rev = 0;
            while (n > 0) {
                int lastdigit = n % 10;
                rev = (rev * 10) + lastdigit;
                System.out.println(lastdigit);
                n = n / 10;
            }
            System.out.println(rev);
        }

        // simple pattern: 4 rows of stars
        {
            for (int i = 1; i <= 4; i++) {
                System.out.println("****");
            }
        }

        // do-while: keep reading numbers, skip multiples of 10, stop on a negative number
        // (original used continue + while(true) with no exit -> infinite loop)
        {
            int n;
            do {
                System.out.print("enter the numbers");
                n = sc.nextInt();
                if (n < 0) {
                    break; // exit condition added
                }
                if (n % 10 == 0) {
                    continue;
                }
                System.out.println(n);
            } while (true);
        }

        // prime check
        {
            int n = sc.nextInt();
            boolean isPrime = true;
            if (n == 2) {
                System.out.println("n is prime");
            } else {
                for (int i = 2; i <= n - 1; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    System.out.println("n is prime");
                } else {
                    System.out.println("n is not prime");
                }
            }
        }

        // do-while: same read/skip/stop pattern as above, different label text
        {
            int n;
            do {
                System.out.print("enter the numbers");
                n = sc.nextInt();
                if (n < 0) {
                    break; // exit condition added
                }
                if (n % 10 == 0) {
                    continue;
                }
                System.out.println("THE NUMBER:" + n);
            } while (true);
        }

        // sum of even and odd numbers from 1 to x
        {
            System.out.println("enter the values ");
            int x = sc.nextInt();
            int evensum = 0; // declared once, outside the loop (was re-declared to 0 every iteration)
            int oddsum = 0;
            for (int i = 1; i <= x; i++) { // was "range", which didn't exist; using x, the value just read
                if (i % 2 == 0) {
                    evensum = i + evensum;
                } else {
                    oddsum = i + oddsum;
                }
            }
            System.out.println("the sum of even numbers is =" + evensum);
            System.out.println("the sum of odd numbers is =" + oddsum);
        }
    }
}