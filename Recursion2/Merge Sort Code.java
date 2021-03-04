// Merge Sort Code
// Send Feedback
// Sort an array A using Merge Sort.
// Change in the input array itself. So no need to return or print anything.
// Input format :
// Line 1 : Integer n i.e. Array size
// Line 2 : Array elements (separated by space)
// Output format :
// Array elements in increasing order (separated by space)
// Constraints :
// 1 <= n <= 10^3
// Sample Input 1 :
// 6 
// 2 6 8 5 4 3
// Sample Output 1 :
// 2 3 4 5 6 8
// Sample Input 2 :
// 5
// 2 1 5 2 3
// Sample Output 2 :
// 1 2 2 3 5 

public class solution {

	public static void mergeSort(int[] input){
		// Write your code here
		
        merge(input,0,input.length-1);
	}
    
    public static void merge(int[] input,int start,int end){
        int mid=(start+end)/2;
        if(start<end){
            merge(input,start,mid);
            merge(input,mid+1,end);
        }
        
        int i=0,first=start,last=mid+1;
        int temp[]=new int[end-start+1];
        
        while(first<=mid && last<=end){
            if(input[first]<input[last]){
                temp[i++]=input[first++];
            }
            else{
                temp[i++]=input[last++];
            }
        }
        while(first<=mid){
            temp[i++]=input[first++];
        }
        while(last<=end){
            temp[i++]=input[last++];
        }
        i=0;
        while(start<=end){
            input[start++]=temp[i++];
        }
    }
}
