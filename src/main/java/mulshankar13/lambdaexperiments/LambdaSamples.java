package mulshankar13.lambdaexperiments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Lambda Samples :https://winterbe.com/posts/2014/03/16/java-8-tutorial/
 *
 */
public class LambdaSamples 
{
    public static void main( String[] args )
    {
    	List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

    	//Collections.sort(names);
    	System.out.println(names);
//    	Collections.sort(names, new Comparator<String>() {
//    	    @Override
//    	    public int compare(String a, String b) {
//    	        return b.compareTo(a);
//    	    }
//    	});
    	Collections.sort(names,(a,b)->a.compareTo(b));
    	System.out.println(names);
    	Collections.sort(names,(a,b)->b.compareTo(a));
    	System.out.println(names);
    	
    	List<String> myList =Arrays.asList("a1", "a2", "b1", "c2", "c1");
    	myList
    			.stream()
    		    .filter(s -> s.startsWith("c"))
    		    .map(String::toUpperCase)
    		    .sorted()
    		    .forEach(System.out::println);
    	System.out.println(myList);

    }
}
