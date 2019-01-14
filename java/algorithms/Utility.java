package snippet;

public class Utility {
	
	
	public static void swap(char[] array, int index1, int index2) {
		char temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
	public static String swap(String str, int low, int high) {
		
		char[] charArray = str.toCharArray();
		
		
		if (low < charArray.length && high < charArray.length) {
			char temp = charArray[low];
			charArray[low] = charArray[high];
			charArray[high] = temp;						
		}
		
		return String.valueOf(charArray);
	}	

	public static void printArray(char[] array) {

		for (int i : array) {
			System.out.print(i + "   ");
		}
		System.out.print("\n");		
	}

}
