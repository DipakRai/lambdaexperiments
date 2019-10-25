package mulshankar13.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NonDuplicateArray {

	public static void main(String[] args) {
		
		int[] nums = {0,0,1,1,1,2,2,3,3,4,1};
		
		 int res = 1;
	        for(int i = 1; i < nums.length; i++){
	        	System.out.println("nums[i]:"+nums[i]+ "nums[i-1]:" + nums[i-1]);
	            if(nums[i] == nums[i-1]){// two elements are equal do nothing
	                continue;
	            }
	            else{ // prev element is != next element 
	            	System.out.println("res:"+res);
	                nums[res] = nums[i];// shift the current element to prev element
	                // since either there was a successful if block before or just nothing at all
	                res++;
	            }
	        }
	        System.out.println(nums);
	}
}
