Print Subsets of Array
Send Feedback
Given an integer array (of length n), find and print all the subsets of input array.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important. Just print the subsets in different lines.
Input format :
Line 1 : Integer n, Size of array
Line 2 : Array elements (separated by space)
Constraints :
1 <= n <= 15
Sample Input:
3
15 20 12
Sample Output:
[] (this just represents an empty array, don't worry about the square brackets)
12 
20 
20 12 
15 
15 12 
15 20 
15 20 12 
    
    
public class solution {
    
   public static int[] temp;
	public static int i = 0;
	public static int j = 0;
	public static void printSubsets(int input[]) {
		// Write your code here
temp = new int[input.length];
		printSubsets(input, temp, 0);
	}
	
	public static void printSubsets(int[] input, int[] subset, int a) {
		if (a == input.length) {
			for (j = 0; j < a; j++) {
				if (i == (int)Math.pow(2, input.length) - 1) {
					System.out.print(input[j] + " ");
				}
			}
			return;
		} else {
			int count = 0;
			temp[a] = 0;
			printSubsets(input, subset, a + 1);
			for (j = 0; j < subset.length; j++) {
				if (subset[j] == 0) {
					count++;
					if (count == 3) {
						System.out.print("");
					}
					continue;
				} else {
					System.out.print(subset[j] + " ");
				}
			}
			System.out.println();
			i++;
			subset[a] = input[a];
			printSubsets(input, subset, a + 1);
		}
	}
}
