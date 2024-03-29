// Code : Sum of nodes
// Send Feedback
// Given a generic tree, count and return the sum of all nodes present in the given tree.
// Input format :
// Elements in level order form separated by space (as per done in class). Order is - 
// Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
// Output Format :
// Sum of all nodes
// Sample Input :
// 10 3 20 30 40 2 40 50 0 0 0 0 
// Sample Output :
// 190



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
	
	
	
	public static int sumOfAllNode(TreeNode<Integer> root){
	
        int sum=0;
        Queue<TreeNode<Integer>> queue=new LinkedList();
        queue.add(root);
        queue.add(null);
        
        while(!queue.isEmpty()){
            TreeNode<Integer> frontNode=queue.remove();
            
            if(frontNode==null){
                if(queue.isEmpty()){
                    break;
                }
                else{
                    queue.add(null);
                }
            }
            else{
                sum+=frontNode.data;
                for(int i=0;i<frontNode.children.size();i++){
                    queue.add(frontNode.children.get(i));
                }
            }
        }
    return sum;
	}
}
