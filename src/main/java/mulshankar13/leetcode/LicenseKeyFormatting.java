package mulshankar13.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LicenseKeyFormatting {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();//"2-5g-3-J";
		int k = sc.nextInt();
		String licenseKey = licenseKeyFormatting(str,k);
		System.out.println("licenseKey:"+licenseKey);
		sc.close();
	}
	
	public static String licenseKeyFormatting(String S, int K) {		
		S=S.replace("-", "");
		StringBuilder sbr = new StringBuilder(S);
		System.out.println(sbr);
		int startIndexFrmEnd =0;
		List<String> stringList = new ArrayList<String>();
		while(S.length()>K) {
			startIndexFrmEnd=S.length()-K;
			stringList.add(S.substring(startIndexFrmEnd));
			S=S.substring(0, startIndexFrmEnd);
			System.out.println("S="+S);
		}
		stringList.add(S);
		stringList.forEach(e->{
			System.out.println(e);
		});
		String formatString ="";
		StringBuilder sb = new StringBuilder();
		    for(int i=stringList.size()-1;i>=0;i--) {
		        sb.append(stringList.get(i).concat("-"));
		    }
		    formatString= sb.toString();  
		System.out.println("formatString ="+formatString);
		
		return formatString.substring(0, formatString.length()-1).toUpperCase();
	}
	
	/**
	 * 19 ms submission
	 * TODO Read the code
	 * @param S
	 * @param K
	 * @return
	 */
	public String licenseKeyFormatting2(String S, int K) { 
        S = S.replace("-","");
        int size = S.length();
        StringBuffer sb = new StringBuffer();
        int count = 0;
        for(int i=size-1; i>=0; i--){
            if(count == K){
                sb.append("-");
                count = 0;
            }
            sb.append(S.charAt(i));
            count++;
        }
        return sb.reverse().toString().toUpperCase();
    }

}
