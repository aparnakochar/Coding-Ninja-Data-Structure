// Binary Search (Recursive)
// Send Feedback
// Given an integer sorted array (sorted in increasing order) and an element x, find the x in given array using binary search. Return the index of x.
// Return -1 if x is not present in the given array.
// Note : If given array size is even, take first mid.
// Input format :

// Line 1 : Array size

// Line 2 : Array elements (separated by space)

// Line 3 : x (element to be searched)

// Sample Input :
// 6
// 2 3 4 5 6 8 
// 5 
// Sample Output:
// 3 

public class solution {

	// element - number to be searched
	public static int binarySearch(int input[], int element) {
		// Write your code here
		
        return result(0,input.length-1,element,input);
	}
    public static int result(int s,int e,int element,int input[]){
        int mid=(s+e)/2;
        if(s>=e)
            return -1;
        if(input[mid]==element)
            return mid;
        else if(input[mid]>element)
            return result(s,mid-1,element,input);
        else if(input[mid]<element)
            return result(mid+1,e,element,input);
        return -1;
    }
}
