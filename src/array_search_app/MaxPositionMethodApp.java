package array_search_app;

/**
 *  Creating a method that can search and
 *  find the location of an element, which has
 *  the highest value inside the array.
 *  Validates if the arr is null, or the lowest value
 *  of an element is less than zero,
 *  or if the highest value of an element is greater
 *  than maximum length of the array given.
 */
public class MaxPositionMethodApp {

    public static void main(String[] args) {
        int[] arr = {72, 13, 69, 115, 55};

        int position = getMaxPosition(arr, 0, arr.length - 1);
        int maxValue = arr[position];

        System.out.println("Max Value: " + maxValue + " " + "Position: " + (position + 1));
    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int position = low;
        int maxValue;

        // Validation check for arr.
        if ((arr == null) || (low < 0) || (high > arr.length - 1)) {
            return -1;
        }
        // Searching the element with the highest value, and it's position.
        maxValue = arr[low];
        for (int i = low; i <= high; i++) {
            if (arr[i] > maxValue) {
                position = i;
                maxValue = arr[i];
            }
        }
        return position;
    }
}
