// Number of Nodes greater than x
// Send Feedback
// Given a tree and an integer x, find and return number of Nodes which are greater than x.
// Input format :
// Single Line : First Integer denotes x and rest of the elements in level order form separated by space. Order is - 
// Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
// Output Format :
// Count of nodes greater than x
// Sample Input 1 :
// 35 10 3 20 30 40 2 40 50 0 0 0 0 
// Sample Output 1 :
// 3
// Sample Input 2 :
// 10 10 3 20 30 40 2 40 50 0 0 0 0 
// Sample Output 2:
// 5

import java.util.*;
public class Solution {

/*	TreeNode class 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/

	
	public static int numNodeGreater(TreeNode<Integer> root,int x){
int count=0;
		// Write your code here		
				Queue<TreeNode<Integer>> queue=new LinkedList();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            TreeNode<Integer> frontEnd=queue.remove();
            if(frontEnd==null){
                if(queue.isEmpty()){
                
                   break;
                }
                queue.add(null);
            }
            else{
                if(frontEnd.data>x){
                    count++;
                  //  break;
                }
                for(int i=0;i<frontEnd.children.size();i++){
                    queue.add(frontEnd.children.get(i));
                }
            }
        }
        return count;
	}
	
}
