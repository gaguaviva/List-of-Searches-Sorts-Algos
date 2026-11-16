public class QuickSort {

	public static void quickSort (int[] array, int low, int high) {
		if (low < high) {
			int pivot = partition(array, low, high);
			
			quickSort(array, low, pivot - 1);
			quickSort(array, pivot + 1, high);
		}
	}
	
	public static int partition (int[] array, int low, int high) {
		int pivot = array[high];
		int i = low - 1;	// pointer starts before first index
		
		for (int j = low; j < high; j++) {
			if (array[j] < pivot) {
				
				i++;	// increments the pointer, so that it switches with the equivalent
				
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				
			} 
			
		}
		
		// places pivot in the correct position
		int temp = array[i+1];
		array[i+1] = array[high];
		array[high] = temp;
		
		// returns the pivot position
		return i + 1;
	}
}
