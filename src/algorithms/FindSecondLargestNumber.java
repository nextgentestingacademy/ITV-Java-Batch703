package algorithms;

public class FindSecondLargestNumber {
	
	// Given an array of integers, find the second largest number in the array.
	public static int findSecondLargest(int[] arr) {
		if (arr.length < 2) {
			throw new IllegalArgumentException("Array must have at least two elements.");
		}
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for (int num : arr) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}
		
		if (secondLargest == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("There is no second largest number in the array.");
		}
		
		return secondLargest;
	}	

	public static void main(String[] args) {
		int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
		int secondLargest = findSecondLargest(arr);
		System.out.println("The second largest number in the array is: " + secondLargest);
	}

}
