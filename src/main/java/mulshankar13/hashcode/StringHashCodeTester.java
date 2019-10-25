package mulshankar13.hashcode;

public class StringHashCodeTester {

public static void main(String[] args) {
	
	String a=new String("foo");
	String b=new String ("foo");
	System.out.println(a.equals(b));//true
	System.out.println(a==b);//false
	System.out.println(a.hashCode());//101574:hashcode
	System.out.println(b.hashCode());//101574:hashcode same as a because Java overrides the hashcode for String class and only for String class
}
}