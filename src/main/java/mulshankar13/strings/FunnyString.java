package mulshankar13.strings;

public class FunnyString {

	public static void main(String[] args) {
		
		String str = "acxz";
		String rstr ="";		
		for(int i=str.length()-1;i>=0;i--) {
			rstr+=(str.charAt(i));
		}
		System.out.println(str);
		System.out.println(rstr);
		
		int[] charArray = new int[str.length()-1];
		int[] reverseCharArray = new int[str.length()-1];
		
		for(int i=0;i<str.length()-2;++i) {
			System.out.println(i);
			for(int j=i+1;j<str.length();++j) {
				charArray[i]=Math.abs(((int)str.charAt(i)-(int)str.charAt(j)));
			}
		}
		
		for(int i=0;i<str.length()-2;i++) {
			System.out.println(i);
			for(int j=i+1;j<rstr.length();++j) {
				reverseCharArray[i]=Math.abs(((int)rstr.charAt(i)-(int)rstr.charAt(j)));
			}
		}

		boolean flag = false;
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]!=reverseCharArray[i]) {
				flag=true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Not Funny");
		} else {
			System.out.println("Funny");
		}
		
	}
}
