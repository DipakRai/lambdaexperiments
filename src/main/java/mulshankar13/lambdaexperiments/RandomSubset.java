package mulshankar13.lambdaexperiments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Generating a random subset with equal probability 
 * of a given collection of numbers using Lambda:
 * Cracking The Coding Interview
 * @author mulshankar13
 *
 */
public class RandomSubset {
	
	static List<Integer> getRandomSubset(List<Integer> list){
		Random random = new Random();
		Predicate<Object> flipCoin = o->{
			return random.nextBoolean();
		};
		return list.stream()
		.filter(flipCoin)
		.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
	
		List <Integer> list = new ArrayList<Integer>();
		
		Integer a[]={33,3,4,5};//declaration, instantiation and initialization  
		list.addAll(Arrays.asList(a)); // adding arrays as a list
		for(int i=0;i<list.size();i++) {
			System.out.println(getRandomSubset(list));
		}		
	}
}
