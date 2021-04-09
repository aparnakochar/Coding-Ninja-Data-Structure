// Check if a Binary Tree is BST
// Send Feedback
// Given a binary tree with N number of nodes, check if that input tree is BST (Binary Search Tree). If yes, return true, return false otherwise.
// Note: Duplicate elements should be kept in the right subtree.
// Input format :
// The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have a left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
// Output format :
// The first and only line of output contains either true or false.
// Constraints :
// Time Limit: 1 second
// Sample Input 1 :
// 3 1 5 -1 2 -1 -1 -1 -1
// Sample Output 1 :
// true
// Sample Input 2 :
// 5 2 10 0 1 -1 15 -1 -1 -1 -1 -1 -1
// Sample Output 2 :
// false


public class Solution {

	public static boolean isBST(BinaryTreeNode<Integer> root) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        
        if(root==null)
            return true;
        
        int left=maximum(root.left);
        int right=minimum(root.right);
        
        // if(root.data>left && root.data<right)
        //     return true;
           if(root.data<=left){
            return false;
        }
        if(root.data>right){
            return false;
        }
        boolean leftN=isBST(root.left);
        boolean rightN=isBST(root.right);
        
        if(leftN==true && rightN==true)
            return true;
        
        return false;
	}
    
    public static int maximum(BinaryTreeNode<Integer> root){
        if(root==null)
           return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));
        
    }
   // return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));
    
       public static int minimum(BinaryTreeNode<Integer> root){
        if(root==null)
              return Integer.MAX_VALUE;
           
        return Math.min(root.data,Math.min(minimum(root.left),minimum(root.right)));
        
    }
    

}
