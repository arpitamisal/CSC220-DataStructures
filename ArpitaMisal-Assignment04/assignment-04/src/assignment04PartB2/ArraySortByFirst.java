package assignment04PartB2;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * Part B.2
 *
 * Please do not change any code in the main method 
 *
 */
public class ArraySortByFirst
{
	public static void sortByFirst(int data[][]) {
		Arrays.sort(data, new Comparator<int[]>() {

			@Override
			// Compare values according to columns
			public int compare(final int[] entry1,
							   final int[] entry2) {

				// To sort in descending order revert
				// the '>' Operator
				if (entry1[0] > entry2[0])
					return 1;
				else
					return -1;
			}
		});  // End of function call sort().
	}

	public static void display(int data[][]) {
		int row = 0;
		int column = 0;
		while (row != data.length)
		{
			while (column != data[row].length)
			{
				System.out.print(data[row][column] + "  ");
				column++;
			}
			column = 0;
			row++;
			System.out.println("");
		}
	}

	//
	// Please do not change any code in the main method
	//
	public static void main(String args[])
	{
		int array[][] = {{1, 2, 3, 4, 5}, 
				 		 {3, 4, 5, 1, 2},
						 {5, 2, 3, 4, 1},
						 {2, 3, 1, 4, 5},
						 {4, 2, 3, 1, 5}};

		System.out.println("The array is initially " );
		display(array);
		System.out.println();

		sortByFirst(array);
		System.out.println("The array after sorting is " );
		display(array);
		System.out.println();
	}
}