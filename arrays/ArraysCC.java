import java.util.*;

public class ArraysCC {

    // adds 1 to every element (currently a no-op since the line is commented out)
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            // marks[i]=marks[i]+1;
        }
    }

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        // ---- reading marks from user into a fixed-size array ----
        int marks[] = new int[50];
        // int numbers[]={1,2,3,4};
        Scanner sc = new Scanner(System.in);
        // int phy;
        // phy=sc.nextInt();

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("phyiscs : " + marks[0]);
        System.out.println("lenghth" + marks.length);

        // ---- separate demo array, passed to update() ----
        // renamed to marks2: "marks" is already declared above in this same
        // method, so re-declaring it here was illegal
        int marks2[] = {2, 4, 5, 6};
        update(marks2);
        for (int i = 0; i < marks2.length; i++) {
            System.out.print(marks2[i] + " ");
        }
        System.out.println();
    }
}

