package assignment04PartA3;

public class ShellSortDriver {
    private static final int[] List = {9, 2, 8, 4, 7, 5, 6, 2, 4, 3, 1, 7};

    public static void main(String[] args){
        int n = List.length;
        System.out.println("List Before Shell Sort: ");
        display(List, n);
        System.out.println("Is sorted: " + isSorted(List, n) + "\n");
        ShellSortPartA3.shellSort(List, n); // Shell Sort
        System.out.println();
        System.out.println("List After Shell Sort: ");
        display(List, n);
        System.out.println("Is sorted: " + isSorted(List, n) + "\n");
    } // end main

    public static void display(int[] array, int n){
        for(int index = 0; index < n; index++){
            System.out.print(array[index] + " ");
        }
        System.out.println();
    }// end display

    public static boolean isSorted(int[] array, int n){
        boolean sorted = true;
        for(int index = 0; sorted && (index < n - 1); index++){
            if(array[index] > array[index + 1]) {
                sorted = false;
            }
        }// end for
        return sorted;
    }
}