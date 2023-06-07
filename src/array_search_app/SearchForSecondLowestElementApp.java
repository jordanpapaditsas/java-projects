package array_search_app;

/**
 * The program runs a method to
 * search and point out the second-lowest value inside the array
 * given. First it checks if the arr will be null or if the lowest
 * element will be less than zero and if the highest element is greater
 * than the array-length.
 * First loop checks for the lowest element and its position inside the array,
 * second loop comes after and show us the second-lowest element and its
 * position inside the array given.
 */
public class SearchForSecondLowestElementApp {

    public static void main(String[] args) {
        int[] arr = {19, 10, 9, 13, 32, 2, 55, 0};

        int position = getSecondLowestValue(arr, 0, arr.length - 1);
        int secondMinValue = arr[position];

        System.out.println("Second lowest value: " + secondMinValue + " " + "Position: " + (position + 1));

    }

    /**
     *  Loops with 2 'for' To find the second-lowest
     *  value and position of an element inside the
     *  array given.
     * @param arr                   We give an array of Integers.
     * @param low                   We declare an int low as the initial position ('0') in the array.
     * @param high                  We give an int high as the highest position which is the array.length-1.
     * @return                      The method returns the position of the second-lowest value element.
     */
    public static int getSecondLowestValue(int[] arr, int low, int high) {
        int position = low;
        int minValue;
        int secondMinValue;

        minValue = arr[low];
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] < minValue) {
                position = i;
                minValue = arr[i];
            }
        }
        secondMinValue = arr[low + 1];
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] < secondMinValue && arr[i] != minValue) {
                position = i;
                secondMinValue = arr[i];
            }
        }
        return position;
    }
}