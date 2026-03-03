package assignment04PartA1;

public class SelectionSortPartA1 {
    public static void selectionSort(int[] a, int n) {
        for(int index = 0; index < n - 1; index++) {
            int indexOfNextSmallest = getIndexOfSmallest(a, index, n - 1);
            swap(a, index, indexOfNextSmallest);

            for(int e: a){
                System.out.print(e + " ");
            }
            System.out.println();
            // Assertion: a[0] <= a[1] <= . . . <= a[index] <= all other a[i]
        } // end for
    } // end selectionSort

    // Finds the index of the smallest value in a portion of an array a.
    // Precondition: a.length > last >= first >= 0.
    // Returns the index of the smallest value among
    // a[first], a[first + 1], . . . , a[last].
    private static int getIndexOfSmallest(int[] a, int first, int last) {
        int min = a[first];
        int indexOfMin = first;
        for (int index = first + 1; index <= last; index++) {
            if (a[index] < min) {
                min = a[index];
                indexOfMin = index;
            }//endif
            // Assertion: min is the smallest of a[first] through a[index].
        } // end for

        return indexOfMin;
    } // end getIndexOfSmallest

    // Swaps the array entries a[i] and a[j].
    private static void swap(int[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = (int) temp;
    } // end swap
} // end SelectionSort



