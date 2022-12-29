package projecteuler.tasks;

public class Main {
	public static void main(String[] args) {
		System.out.println("The sum of all the multiples of 3 or 5 below 1000: " + Solution.calculateSum(1000));
		System.out.println("The sum of the even-valued Fibonacci terms whose values do not exceed four million: "
				+ Solution.calculateSumFibonacciEvenValuedTerms(4_000_000));
		System.out.println("The largest palindrome made from the product of two 3-digit numbers: "
				+ Solution.calculateLargestPalindrom());
		System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20: "
				+ Solution.calculateSmallestEvenlyDivisibleNumber());
		System.out.println(
				"The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum: "
						+ Solution.calculateDifference(100));
		System.out.println("The 10 001st prime number: " + Solution.calculateNthPrimenumber(10_001));
		String number = "73167176531330624919225119674426574742355349194934"
				+ "96983520312774506326239578318016984801869478851843"
				+ "85861560789112949495459501737958331952853208805511"
				+ "12540698747158523863050715693290963295227443043557"
				+ "66896648950445244523161731856403098711121722383113"
				+ "62229893423380308135336276614282806444486645238749"
				+ "30358907296290491560440772390713810515859307960866"
				+ "70172427121883998797908792274921901699720888093776"
				+ "65727333001053367881220235421809751254540594752243"
				+ "52584907711670556013604839586446706324415722155397"
				+ "53697817977846174064955149290862569321978468622482"
				+ "83972241375657056057490261407972968652414535100474"
				+ "82166370484403199890008895243450658541227588666881"
				+ "16427171479924442928230863465674813919123162824586"
				+ "17866458359124566529476545682848912883142607690042"
				+ "24219022671055626321111109370544217506941658960408"
				+ "07198403850962455444362981230987879927244284909188"
				+ "84580156166097919133875499200524063689912560717606"
				+ "05886116467109405077541002256983155200055935729725"
				+ "71636269561882670428252483600823257530420752963450";
		int lengthAdjacentDigits = 13;
		System.out.println("The thirteen adjacent digits in the 1000-digit number that have the greatest product: "
				+ Solution.calculateAdjacentDigitsWithGreatestProduct(number, lengthAdjacentDigits));
		System.out.println("The value of this product: " + Solution
				.calculateProduct(Solution.calculateAdjacentDigitsWithGreatestProduct(number, lengthAdjacentDigits)));
		System.out.println("The product of Pythagorean triplet: " + Solution.calculateProductOfPythagoreanTriplet());
		System.out.println(
				"The sum of all the primes below two million: " + Solution.calculateSumOfPrimesBelowNumber(2_000_000));
		System.out.println("The largest prime factor of the number 600851475143: "
				+ Solution.calculateLargestPrimeFactor(600_851_475_143L));
	}
}
