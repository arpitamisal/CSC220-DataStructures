package assignment04PartA2;

public class InsertionSortPartA2 {
    public static void insertionSort(int[] a, int n) {
        insertionSort(a, 0, n - 1);
    } // end insertionSort
    public static void insertionSort(int[] a, int first, int last) {
        for(int unsorted = first + 1; unsorted <= last; unsorted++) {
// Assertion: a[first] <= a[first + 1] <= ... <= a[unsorted - 1]
            int firstUnsorted = a[unsorted];
            insertInOrder(firstUnsorted, a, first, unsorted - 1);
            for(int e: a){
                System.out.print(e + " ");
            }
            System.out.println();
        } // end for

    } // end insertionSort
    private static void insertInOrder(int anEntry, int[] a, int begin, int end) {
        int index = end;
        while ((index >= begin) && (anEntry < a[index])) { a[index + 1] = a[index]; // Make room
            index--;
        } // end for
        // Assertion: a[index + 1] is available
        a[index + 1] = anEntry;  // Insert
    } // end insertInOrder
} // end InsertionSort
