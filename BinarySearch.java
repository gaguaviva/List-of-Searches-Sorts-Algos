package Main;

public class BinarySearch {
	public static int binarySearch (int[] array, int target) {
		int low = 0;
		int high = array.length - 1;
		
		while (low <= high) {
			int mid = (high - low) / 2 + low;
			
			if (array[mid] == target) {	// checks immediately
				return mid;
			} else if (target > array[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		
		return -1;	// not in array
	}
}
