package mulshankar13.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * leetcode google
 * @author mulshankar13
 *
 */

public class UniqueEmailAddress {

	public static void main(String[] args) {
		String[] emails = new String[] { "testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com" };
		  
  		Set<String> emailSet= new HashSet<String>();
		for (String string : emails) {
		String arr [] = string.split("@");
        String localName=arr [0];
        if(arr[0].contains("+")){
           localName=arr[0].substring(0,arr[0].indexOf("+"));        
        }			
        if(arr[0].contains(".")){
		   localName = localName.replace(".", "");
        }
        String sanitizedEmail="";
         	sanitizedEmail= localName.concat("@").concat(arr[1]);
       emailSet.add(sanitizedEmail);
	}
    emailSet.forEach(e->{
    	System.out.println(e);
    });
    
	}

}
