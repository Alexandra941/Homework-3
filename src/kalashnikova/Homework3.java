import java.util.Arrays;
import java.util.Random;

/**
 * Homework 3
 * @author Kalashnikova Aleksandra
 * @version 10.11.2021
 */
public class Homework3 {

    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        twoArguments(8, 25);
        findMinAndMaxElements();
        checkBalance(new int[] { 2, 2, 0, 4 });
    }

    static void invertArray() {
        int[] arr = new int[] { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
    }

    static void fillArray() {
        int[] arr = new int[100];
        for (int i = 1; i <= arr.length; i++){
            arr[i - 1] = i;
        }
    }

    static void changeArray() {
        int[] arr = new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
    }

    static void fillDiagonal() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - (i + 1)] = 1;
        }
    }

    static int[] twoArguments(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

    static void findMinAndMaxElements() {
        Random random = new Random();
        int[] arr = random.ints(10, 10,100).toArray();

        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
    }

    static boolean checkBalance(int[] arr) {
        for (int i = 1; i <= arr.length; i++) {
            if(Arrays.stream(Arrays.copyOf(arr, i)).sum() == Arrays.stream(Arrays.copyOfRange(arr, i++, arr.length)).sum()) {
                return true;
            }
        }
        return false;
    }
}