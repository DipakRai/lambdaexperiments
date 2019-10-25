package mulshankar13.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		
		int [] nums = {2, 7, 11, 15};
		int target=33;
		int [] tgtIndices = new int [2];
		int revisedTgt=0;
		for(int i=0;i<nums.length;i++) {
			revisedTgt = target-nums[i];
			tgtIndices=twoSum(nums,revisedTgt);
			if(tgtIndices[0]!=-1) {
				System.out.println(nums[i]+","+tgtIndices[0]+","+tgtIndices[1]);				
				break;
			}
		}
		//tgtIndices=twoSum(nums,target);
		//System.out.println(tgtIndices[0]+","+tgtIndices[1]);
		
	}
	
	public static int[] twoSum(int[] nums, int target) {
	    
		Map<Integer,Integer> numMap = new HashMap<Integer,Integer>();
		int [] tgtIndices = new int [] {-1,-1};
		for(int i=0;i<nums.length;i++) {
			if(numMap.containsKey(target-nums[i])) {
				tgtIndices[0]=numMap.get(target-nums[i]);
				tgtIndices[1]=i;
			} else {
				numMap.put(nums[i],	i);
			}			
		}        
		return tgtIndices;
    }
}
