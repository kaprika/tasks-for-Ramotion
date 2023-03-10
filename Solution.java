package projecteuler.tasks;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	// Multiples of 3 or 5
	//
	// Problem 1
	// If we list all the natural numbers below 10 that are multiples of 3 or 5, we
	// get 3, 5, 6 and 9. The sum of these multiples is 23.
	//
	// Find the sum of all the multiples of 3 or 5 below 1000.
	public static int calculateSum(int numberBorder) {
		int sum = 0;
		for (int i = 1; i < numberBorder; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}

//	Even Fibonacci numbers
//	 
//	Problem 2
//	Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
//
//	1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//
//	By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
	public static int calculateSumFibonacciEvenValuedTerms(int numberBorder) {
		int firstFibonacciTerm = 1;
		int secondFibonacciTerm = 2;
		int sumEvenValuedTerms = secondFibonacciTerm;
		int currentFibonacciTerm = 0;
		while (currentFibonacciTerm < numberBorder) {
			currentFibonacciTerm = firstFibonacciTerm + secondFibonacciTerm;
			if (currentFibonacciTerm % 2 == 0 && currentFibonacciTerm <= numberBorder) {
				sumEvenValuedTerms += currentFibonacciTerm;
			}
			firstFibonacciTerm = secondFibonacciTerm;
			secondFibonacciTerm = currentFibonacciTerm;
		}
		return sumEvenValuedTerms;
	}

//	Largest prime factor
//
//	Problem 3
//	The prime factors of 13195 are 5, 7, 13 and 29.
//
//	What is the largest prime factor of the number 600851475143?
	public static long calculateLargestPrimeFactor(long number) {
		long largestPrimeFactor = 1;
		for (long i = 2; i <= number / 2; i++) {
			if (number % i == 0 && isPrime(i)) {
				largestPrimeFactor = i;
			}
		}
		return largestPrimeFactor;
	}

	private static boolean isPrime(long number) {
		if (number == 1) {
			return false;
		}
		for (long i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

//	Largest palindrome product
//
//	Problem 4
//	A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 ?? 99.
//
//	Find the largest palindrome made from the product of two 3-digit numbers.
	public static int calculateLargestPalindrom() {
		List<Integer> threeDigitNumbers = new ArrayList<Integer>();
		fillThreeDigitNumbers(threeDigitNumbers);
		int largestPalindrome = 0;
		for (Integer firstValue : threeDigitNumbers) {
			for (Integer secondValue : threeDigitNumbers) {
				int product = firstValue * secondValue;
				if (isPalindrome(product)) {
					if (product > largestPalindrome) {
						largestPalindrome = product;
					}
				}
			}
		}
		return largestPalindrome;
	}

	private static boolean isPalindrome(int product) {
		int copyProduct = product;
		int reverseProduct = 0;
		while (copyProduct != 0) {
			reverseProduct = reverseProduct * 10 + copyProduct % 10;
			copyProduct /= 10;
		}
		if (product == reverseProduct) {
			return true;
		} else {
			return false;
		}
	}

	private static void fillThreeDigitNumbers(List<Integer> threeDigitNumbers) {
		for (int i = 100; i <= 999; i++) {
			threeDigitNumbers.add(i);
		}
	}

//	Smallest multiple
//
//	Problem 5
//	2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//	What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	public static long calculateSmallestEvenlyDivisibleNumber() {
		long smallestNumber = 0;
		do {
			smallestNumber++;
			if (isEvenlyDivisible(smallestNumber)) {
				return smallestNumber;
			}
		} while (true);
	}

	private static boolean isEvenlyDivisible(long smallestNumber) {
		for (long i = 1; i <= 20; i++) {
			if (smallestNumber % i != 0) {
				return false;
			}
		}
		return true;
	}

//	Sum square difference
//
//	Problem 6
//	The sum of the squares of the first ten natural numbers is,
//
//	The square of the sum of the first ten natural numbers is,
//
//	Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .
//
//	Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
	public static long calculateDifference(int number) {
		long sumOfSquares = calculateSumOfSquares(number);
		long sum = calculateSumOfNumbers(number);
		return sum * sum - sumOfSquares;

	}

	private static long calculateSumOfSquares(int number) {
		long sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i * i;
		}
		return sum;
	}

	private static long calculateSumOfNumbers(int number) {
		long sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}

//	10001st prime
//
//	Problem 7
//	By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//	What is the 10 001st prime number?
	public static long calculateNthPrimenumber(int nth) {
		long number = 2;
		int counter = 1;
		while (counter != nth) {
			number++;
			if (isPrime(number)) {
				counter++;
			}
		}
		return number;
	}

//	Largest product in a series
//	
//	Problem 8
//	The four adjacent digits in the 1000-digit number that have the greatest product are 9 ?? 9 ?? 8 ?? 9 = 5832.
//
//	73167176531330624919225119674426574742355349194934
//	96983520312774506326239578318016984801869478851843
//	85861560789112949495459501737958331952853208805511
//	12540698747158523863050715693290963295227443043557
//	66896648950445244523161731856403098711121722383113
//	62229893423380308135336276614282806444486645238749
//	30358907296290491560440772390713810515859307960866
//	70172427121883998797908792274921901699720888093776
//	65727333001053367881220235421809751254540594752243
//	52584907711670556013604839586446706324415722155397
//	53697817977846174064955149290862569321978468622482
//	83972241375657056057490261407972968652414535100474
//	82166370484403199890008895243450658541227588666881
//	16427171479924442928230863465674813919123162824586
//	17866458359124566529476545682848912883142607690042
//	24219022671055626321111109370544217506941658960408
//	07198403850962455444362981230987879927244284909188
//	84580156166097919133875499200524063689912560717606
//	05886116467109405077541002256983155200055935729725
//	71636269561882670428252483600823257530420752963450
//
//	Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
	public static String calculateAdjacentDigitsWithGreatestProduct(String number, int lengthAdjacentDigits) {
		long greatestProduct = 1;
		long product = 1;
		int counterDigits = 0;
		int startIndex = 0;
		int endIndex = 0;
		for (int j = 0; j < number.length(); j++) {
			for (int i = j; i < number.length(); i++) {
				counterDigits++;
				if (counterDigits <= lengthAdjacentDigits) {
					product *= (Integer.valueOf(number.charAt(i)) - 48);
				} else if (counterDigits == lengthAdjacentDigits + 1) {
					if (product > greatestProduct) {
						greatestProduct = product;
						startIndex = i - lengthAdjacentDigits;
						endIndex = i - 1;
					}
					product = Integer.valueOf(number.charAt(i)) - 48;
					counterDigits = 1;
				}
			}
		}
		return number.substring(startIndex, endIndex + 1);
	}

	public static long calculateProduct(String number) {
		long product = 1;
		for (int i = 0; i < number.length(); i++) {
			product *= (Integer.valueOf(number.charAt(i)) - 48);
		}
		return product;
	}

//	Special Pythagorean triplet
//
//	Problem 9
//	A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
//	a2 + b2 = c2
//	For example, 32 + 42 = 9 + 16 = 25 = 52.
//
//	There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//	Find the product abc.
	public static int calculateProductOfPythagoreanTriplet() {
		int product = 1;
		for (int a = 1; a < 1000; a++) {
			for (int b = a + 1; b < 1000; b++) {
				for (int c = b + 1; c < 1000; c++) {
					if (a * a + b * b == c * c && a + b + c == 1000) {
						product = a * b * c;
					}
				}
			}
		}
		return product;
	}

//	Summation of primes
//
//	Problem 10
//	The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
//	Find the sum of all the primes below two million.
	public static long calculateSumOfPrimesBelowNumber(int number) {
		long sum = 0;
		for (int i = 1; i < number; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		return sum;
	}
}
