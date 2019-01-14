package snippet;

public class QuickSort {

	public static int testArray[] = { 10, 80, 30, 90, 40, 50, 70 };

	public static void main(String[] args) {

		System.out.print("\n array before sorting ");
		printArray(testArray);

		QuickSort qs = new QuickSort();
		qs.quickSort(testArray, 0, testArray.length - 1);

		System.out.print("\n array after sorting  ");
		printArray(testArray);
	}

	public void quickSort(int[] array, int low, int high) {

		if (low < high) {
			int splitIndex = partition(array, low, high);
			quickSort(array, low, splitIndex - 1);
			quickSort(array, splitIndex + 1, high);
		}
	}

	/**
	 * @param array
	 * @param low
	 * @param high
	 * @return
	 */
	public int partition(int[] array, int low, int high) {

		int i = low - 1;
		int pivot = array[high];
		for (int j = low; j < high; j++) {
			if (array[j] <= pivot) {
				i++;
				swap(array, i, j);
			}
		}

		swap(array, i + 1, high);

		return i + 1;
	}

	public void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	public static void printArray(int[] array) {

		for (int i : testArray) {
			System.out.print(i + "   ");
		}
	}

}


/// sample input a[] = {10, 80, 30, 90, 40, 50, 70}
////Indexes:  0   1   2   3   4   5   6
//sort (a[], low, high) {
//
//If (low >= high) {
//return;
//}
//
//// J is the index of pivot element, the element which is in correct sorted location. Item before j are smaller to it and item after j are bigger to it.
//Int j = partition (a, low, high); // Item in index j is in right sorted order.           (Divide)
//sort (a, low, j-1); // sort array items starting from  index low to index before j.      (conquer)
//sort (a, j+1, high); // sort array items starting from  index after j to index upto high (conquer)
//}
//
//
//Int partition (int[] a, int low, int high) {
//
//Int pivot = high;
//Int i = low-1;  //index upto which all items are less than equals to pivot element, start from one index before low as we do not know yet whether item at index             
//      // low is greater or less than pivot.
//
//// Run a loop upto one index before pivot item
//for (int j = low; j < high -1; j++) {
//if (a[j] <= a[pivot]) // If current item is less than pivot then i should be incremented to increase its range
//{
//i++; // Now I is pointing to an index where item is greater than pivot.
//Swap (a[i], a[j]);  // swap item at index j with item at index i, this will make sure items upto i are smaller or equals to pivot.
//}
//}
//
//// By end of this loop all items smaller than or equals to pivot are in in between index low to i including item at low and i,    
//swap (a[I+1], a[pivot]);// Now loop is over so place pivot item at its right place.that is index next to i as upto I all elements are less than pivot.
//Return i +1; // return new sorted index or pivot element.
//}
