package array_search_app;

public class SearchForSecondLowestElementWithOneFor {

    public static void main(String[] args) {

        int[] arr = {0, 22, 32, 10};
        int secondMinPosition;
        int secondMinValue;

        secondMinPosition = getSecondMinElementPosition(arr, 0, 3);
        secondMinValue = arr[secondMinPosition];

        System.out.printf(" Second minValue: %d\n Second minValue position: %d", secondMinValue, secondMinPosition);

    }

    public static int getSecondMinElementPosition(int[] arr, int low, int high) {
        int minPosition = low;
        int minValue = arr[low];

        int secondMinPosition = low + 1;
        int secondMinValue = arr[low + 1];

        for (int i = low + 1; i <= high; i++) {
            if (arr[i] < minValue) {
                secondMinValue = minValue;
                secondMinPosition = minPosition;
                minValue = arr[i];
                minPosition = i;
            } else if (arr[i] < secondMinValue) {
                secondMinValue = arr[i];
                secondMinPosition = i;
            }
        }
        return secondMinPosition;
    }
}
