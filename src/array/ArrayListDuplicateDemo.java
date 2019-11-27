package array;

import java.util.*;
//WAP to remove all duplicates from Array list
public class ArrayListDuplicateDemo {
	public static void main(String args[]) {
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(7);
		primes.add(7);
		primes.add(11);
		System.out.println("list of prime numbers : " + primes);
		Set<Integer> primesWithoutDuplicates = new LinkedHashSet<Integer>(primes);
		primes.clear();
		primes.addAll(primesWithoutDuplicates);
		System.out.println("list of primes without duplicates : " + primes);

	}
}
