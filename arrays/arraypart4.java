import java.util.*;

public class arraypart4 {
    public static int largestNum(int Large[]) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < Large.length; i++) {
        if (largest < Large[i]) {
            largest = Large[i];
        }
    }
    return largest;
}

public static int smallNum(int Large[]) {
    int smalles = Integer.MAX_VALUE;
    for (int i = 0; i < Large.length; i++) {
        if (smalles > Large[i]) {
            smalles = Large[i];
        }
    }
    return smalles;
}

public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter how many numbers you want: ");
    int n = sc.nextInt();
    int large[] = new int[n];
    System.out.println("Enter " + n + " numbers:");

    for (int i = 0; i < n; i++) {
        large[i] = sc.nextInt();
    }

    int finalil = largestNum(large);
    System.out.println("the largest is " + finalil);
    int finalis = smallNum(large);
    System.out.println("the samllest  is " + finalis);
}
}
