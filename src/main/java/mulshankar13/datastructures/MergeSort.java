package mulshankar13.datastructures;

public class MergeSort {

	public static void main(String[] args) {
		int[] masterArray = new int[] { 8, 6, 2, 4, 7, 5, 12, 9 };
		// divide this masterArray into two halves
		// sort each half
		// merge the sorted halves into one array
		// two sorted arrays a,b		
		for(int i=0;i<masterArray.length;i++) {
			System.out.println(masterArray[i]);
		}
		System.out.println("---Before");
		sort(masterArray);
		for(int i=0;i<masterArray.length;i++) {
			System.out.println(masterArray[i]);
		}
		
	}

	public static void sort(int masterArray[], int auxArray[], int low, int high) {
		if (high <= low) {
			return;// if the array is valid && non empty && has more than one elements
		}
		int mid = low + (high - low) / 2;
		sort(masterArray, auxArray, low, mid);
		sort(masterArray, auxArray, mid + 1, high);
		//TODO check if array is already sorted
		merge(masterArray, auxArray, low, mid, high);
		
	}

	public static void sort(int masterArray[]) {
		int[] auxArray = new int[masterArray.length];
		sort(masterArray, auxArray, 0, masterArray.length-1);
	}

	public static void merge(int masterArray[], int auxArray[], int low, int mid, int high) {
		for (int k = low; k <= high; k++) {
			auxArray[k] = masterArray[k];
		}
		int i = low, j = mid + 1;
		for (int k = low; k <= high; k++) {
			if (i > mid) {// all elements of first half are covered
				masterArray[k] = auxArray[j++]; // keep adding all elements of second half to the array
			} else if (j > high) { // all elements of second half are covered
				masterArray[k] = auxArray[i++];//keep adding all elements of first half 
			} else if (auxArray[j] < auxArray[i]) { 
				// compare the first element of the second half to the first element of the first half
				masterArray[k] = auxArray[j++];//increment second half counter
			} else {
				masterArray[k] = auxArray[i++];// increment first half counter
			}

		}
	}

}
