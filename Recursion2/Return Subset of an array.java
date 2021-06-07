Return subset of an array
Send Feedback
Given an integer array (of length n), find and return all the subsets of input array.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important.
Input format :

Line 1 : Size of array

Line 2 : Array elements (separated by space)

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

	// Return a 2D array that contains all the subsets
	public static int[][] subsets(int input[]) {
		// Write your code here

		// Write your code here
return subsets(input, 0);
        
    }
    
    public static int[][] subsets(int input[], int start) {
        // Write your code here
        if (start == input.length) {
            int[][] myans = new int[1][0];
            return myans;
        }
        int cn = input[start];
        int[][] smallanswer = subsets(input, start + 1);
        int[][] myans = new int[2 * smallanswer.length][];
        int k = 0;
        
        for (int i = 0; i < smallanswer.length; i++) {
            myans[k] = new int[smallanswer[i].length];
            for (int j = 0; j < smallanswer[i].length; j++) {
                myans[k][j] = smallanswer[i][j];

            }
            k++;
        }
        for (int i = 0; i < smallanswer.length; i++) {
            myans[k] = new int[smallanswer[i].length + 1];
            myans[k][0]=cn;
            for (int j = 1; j <= smallanswer[i].length; j++) {
                myans[k][j] = smallanswer[i][j - 1];
            }
            k++;
        }
        
return myans;
	}
	}

