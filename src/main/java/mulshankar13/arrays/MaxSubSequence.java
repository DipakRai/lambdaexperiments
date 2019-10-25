package mulshankar13.arrays;

/**
 * This question was asked in Juniper Networks Interview
 * @author mulshankar13
 *
 */
public class MaxSubSequence {

	public static void main(String[] args) {
		int[] array = {-2,1,-3,4,-1,2,1,-5,4};
		int max = maxSubArray(array);
		System.out.println(max); //{-2,1,-3,4,-1,2,1,-5,4}
	}

	/**
	 * Brute force method
	 * @param nums
	 * @return
	 */
//	static public int maxSubArray(int[] nums) {
//		int sum = 0, max = Integer.MIN_VALUE; // keep sum = 1st element:max =min value
//		for (int i = 0; i < nums.length; i++) {
//			sum = nums[i];
//			max = Math.max(sum, max); // compare with element itself everytime
//			for (int j = i + 1; j < nums.length; j++) {
//				sum += nums[j];
//				max = Math.max(sum, max);
//			}
//		}
//		return max;
//	}
	
	/**
	 * 
	 * @param nums
	 * @return
	 */
	static public int maxSubArray(int[] nums) {
		//-2,1	
		int max=Integer.MIN_VALUE,sum=0;
		for(int i=0;i<nums.length;i++) { // max=-2,sum=-2
			sum+=nums[i];//-2, // 
			if(max<sum) {
				max=Math.max(sum, max);//-2
			}			
			if(sum<0) {
				sum=0;
			}
		}
		return max;
	}
}