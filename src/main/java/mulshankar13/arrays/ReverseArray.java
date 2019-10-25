package mulshankar13.arrays;

/**
 * Rotate an array by r places : Hackerank
 * @author mulshankar13
 *
 */
public class ReverseArray {
	
	static int[] rotLeft(int[] a, int d) {

		for(int i=0;i<d;i++) {
			leftRotateByOne(a);
		}
		
		return a;

    }
	
	static void leftRotateByOne(int [] a) {
		
		int temp =a[0]; // first element a[0]
		
		for (int i=0;i<a.length-1;i++) {
			
			a[i]=a[i+1];// 
			a[i+1]=temp;
			for (int j=0;j<a.length;j++) {
				System.out.print("\t"+a[j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		
		rotLeft(a, 2);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	
	}

}
