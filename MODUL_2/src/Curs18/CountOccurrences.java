package Curs18;

public class CountOccurrences {
    public static int countOccurrences(int[] array, int key) {
        // TODO: Your code goes here...
        int left = 0, right = array.length - 1, rez = 0, i = 0;
        while (left <= right) {
            int middle = (left + right) / 2;

            if (key == array[middle]) {
                rez = middle;

            } else if (key < array[middle]) {
                right = middle - 1;
            } else if (key > array[middle]) {
                left  = middle + 1;
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Checking input...");

        int[] array = {0, 2, 3, 5, 5, 5, 8, 11, 11, 101};

        int rez = countOccurrences(array, 11);
        System.out.println("You got: " + rez + " Correct: " + 2);
    }
}
