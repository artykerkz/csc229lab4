package csc229lab4;

public class recursion {

// print hello world n times recursively
			    public static void printHelloWorld(int n) {
			        if (n <= 0) {
			            return;
			        }
			        System.out.println("Hello World");
			        printHelloWorld(n - 1);
			    }
// return sum of all numbers between n1 and n2 that are multiples of 7
			    public static int sumMultiplesOfSeven(int n1, int n2) {
			        if (n1 > n2) {
			            return 0;
			        }
			        if (n1 % 7 == 0) {
			            return n1 + sumMultiplesOfSeven(n1 + 1, n2);
			        } else {
			            return sumMultiplesOfSeven(n1 + 1, n2);
			        }
			    }
// recursive binary search
			    public static int binarySearch(int[] arr, int target, int low, int high) {
			        if (low > high) {
			            return -1;
			        }
			        int mid = (low + high) / 2;
			        if (arr[mid] == target) {
			            return mid;
			        } else if (arr[mid] > target) {
			            return binarySearch(arr, target, low, mid - 1);
			        } else {
			            return binarySearch(arr, target, mid + 1, high);
			        }
			    }
// main method
			    public static void main(String[] args) {
			        System.out.println("---- Hello World ----");
			        printHelloWorld(3);

			        System.out.println("\n---- Sum of Multiples of 7 ----");
			        System.out.println(sumMultiplesOfSeven(1, 30));

			        System.out.println("\n---- Binary Search ----");
			        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
			        int target = 7;
			        int result = binarySearch(arr, target, 0, arr.length - 1);
			        System.out.println("Index of " + target + ": " + result);


		}

	}
