// Quick Sort Code
// Send Feedback
// Sort an array A using Quick Sort.
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
// 1 5 2 7 3
// Sample Output 2 :
// 1 2 3 5 7 

public class Solution {
	
	public static void quickSort(int[] input) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		quickSort( input, 0, input.length-1);
		
	}
    public static void quickSort(int[] input, int start, int end){
        
        if(start>=end){
            return;
        }
     
        int pivotindex= partition(input,start,end);
        quickSort(input,start,pivotindex-1);
            quickSort(input, pivotindex+1, end);
     }
    public static int partition(int[] input,int start,int end){
        
        int count=0;
        int pivot = input[start];
        for(int i=start+1;i<=end;i++){
            if(input[i]<=pivot){
                count++;
            }
        }
        
        int pivotindex= start+count;
        
        int temp= input[pivotindex];
        input[pivotindex]= input[start];
        input[start]= temp;
        int i=start;
        int j=end;
        while(i<pivotindex && j>pivotindex){
            if(input[i]<= pivot){
                i++;
            }
           else if(input[j]>pivot){
                j--;
            }
            else{
             
               temp=input[i];
                input[i]=input[j];
                input[j]=temp;
                i++;
                j--;
            }
        }
        
       return pivotindex; 
    }
	
}
