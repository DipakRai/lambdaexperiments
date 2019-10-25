package mulshankar13.leetcode.sorting;

public class FirstBadVersion {

	public static void main(String[] args) {
		
		int n [] = {0,1,2,3,4,5,6,7,8,9};
		// if 4 isBadVersion(4)=>true then after 4 all are bad versions
		// fallback is to 3
		
		int begin=0,end=n.length,mid=0,firstBadVersion=-1;
		
		while(begin<end) {
			mid = begin+(end-begin)/2;
			if(isBadVersion(mid)) {
				firstBadVersion=mid;
				end=mid-1;
			} else {
				begin=mid+1;
			}
		}	
		
	}
	
	public static boolean isBadVersion(int n) {
		return true;
	}

}
