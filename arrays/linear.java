import java.util.*;

public class linear {
    public static void main(String args[]) {
        int numbers[] = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 10;
        int index = linearSearch(numbers, key); // was numbers[], key - [] only used in a declaration, not a call

        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("KEY IS AT INDEX " + index);
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
}