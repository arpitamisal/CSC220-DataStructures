package assignment04PartA3;

public class ShellSortPartA3 {
    public static void shellSort(int[] a, int n){
        shellSort(a, 0, n - 1);
    } // end shellSort

    public static void shellSort(int[] a, int first, int last){
        int n = last - first + 1; // Number of array entries
        int space = n / 2;
        while (space > 0){
            for(int begin = first; begin < first + space; begin++){
                incrementalInsertionSort(a, begin, last, space);
                for(int e: a){
                    System.out.print(e + " ");
                }
                System.out.println();
            } // end for
            space = space / 2;
        } // end while
    } // end shellSort

    private static void incrementalInsertionSort(int[] a, int first, int last, int space) {
        int unsorted, index;

        for (unsorted = first + space; unsorted <= last; unsorted = unsorted + space) {
            int nextToInsert = a[unsorted];
            index = unsorted - space;
            while ((index >= first) && (nextToInsert < a[index])) {
                a[index + space] = a[index];
                index = index - space;
            } // end while
            a[index + space] = nextToInsert;
        } // end for
    } // end incrementalInsertionSort
} // end ShellSort

