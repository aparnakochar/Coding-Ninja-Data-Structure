// Sum of Array
// Send Feedback
// Given an array of length N, you need to find and return the sum of all elements of the array.
// Do this recursively.
// Input Format :
// Line 1 : An Integer N i.e. size of array
// Line 2 : N integers which are elements of the array, separated by spaces
// Output Format :
// Sum
// Constraints :
// 1 <= N <= 10^3
// Sample Input 1 :
// 3
// 9 8 9
// Sample Output 1 :
// 26
// Sample Input 2 :
// 3
// 4 2 1
// Sample Output 2 :
// 7    


public class Solution {

	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
	// 	if(input.length==1){
	// return input[0];
	// }
	// 	int smallerInput[]=new int[input.length-1];
	// for(int index=1;index<input.length;index++){
	// smallerInput[index-1]=input[index];
	// }
	// int total=sum(smallerInput);
	// total+=input[0];
	// return total;
	// }
        
        
        		return result(input,0);
	}
    static int sum=0;
    public static int result(int input[],int a){
        // if(a==input.length-1)
        //     return -1;
        if(a>input.length-1)
            return 0;
        sum+=input[a];
        result(input,a+1);
        return sum;
    }
}
