package snippet;

import java.util.Scanner;

public class UniqueCharsInString {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] ar = new String[n];
		int i = 0;
		while (in.hasNext()) {
			ar[i] = in.next();
			printArray(ar[i].toCharArray());
			System.out.println( "result of unique chars check on string : " + UniqueCharsInString.checkStringWithUniqueCharacters(ar[i]));
			i++;
		}

		in.close();
	}

	public static boolean checkStringWithUniqueCharacters(String string) {

		char chars[] = string.toCharArray();
		SortString(chars, 0, chars.length - 1);
		System.out.println( "string after sorting");
		printArray(chars);			
		
		return checkIfUnique(chars);		
	}

	public static void SortString(char[] inputString, int low, int high) {

		if (low < high) {
			int partitionIndex = partition(inputString, low, high);
			SortString(inputString, low, partitionIndex - 1);
			SortString(inputString, partitionIndex + 1, high);
		}

	}

	public static int partition(char[] inputString, int low, int high) {

		char pivot = inputString[high];
		int i = low -1;
		for (int j = low; j < high; j++) {
			if (inputString[j] <= pivot) {
				i++;				
				swap(inputString, i, j);
			}
		}

		swap(inputString, i +1, high);
		return i+1;

	}

	public static boolean checkIfUnique(char[] sortedCharsArray) {
		
		for (int i = 0; i < sortedCharsArray.length -1; i++) {
			if (sortedCharsArray[i] == sortedCharsArray[i+1]) {
				return false;
			}
			
		}
		return true;
	}

	public static void swap(char[] array, int index1, int index2) {
		char temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	public static void printArray(char[] array) {

		for (int i : array) {
			System.out.print(i + "   ");
		}
		System.out.print("\n");		
	}

}
