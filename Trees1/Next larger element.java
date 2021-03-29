// Next larger element
// Send Feedback
// Given a generic tree and an integer n. Find and return the node with next larger element in the Tree i.e. find a node with value just greater than n.
// Return NULL if no node is present with value greater than n.
// Input format :

// Line 1 : Integer n

// Line 2 : Elements in level order form separated by space (as per done in class). Order is -

// Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

// Output format : Node with value just greater than n.

// Sample Input 1 :
// 18
// 10 3 20 30 40 2 40 50 0 0 0 0 
// Sample Output 1 :
// 20
// Sample Input 2 :
// 21
// 10 3 20 30 40 2 40 50 0 0 0 0 
// Sample Output 2:
// 30


import java.util.*;
public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		
		// Write your code here
		Queue<TreeNode<Integer>> queue=new LinkedList();
        TreeNode<Integer> res=null;
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            TreeNode<Integer> frontNode=queue.remove();
            if(frontNode==null){
                if(queue.isEmpty()){
                    break;
                }
                queue.add(null);
            }
            else{
                if(frontNode.data>n){
                    if(res==null || frontNode.data<res.data){
                        res=frontNode;
                    }
                }
                for(int i=0;i<frontNode.children.size();i++){
                    queue.add(frontNode.children.get(i));
                }
            }
        }
        return res;
	}
	
}
