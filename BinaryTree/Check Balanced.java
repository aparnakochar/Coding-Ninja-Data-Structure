// Check Balanced
// Send Feedback
// Given a binary tree, check if it is balanced. Return true if given binary tree is balanced, false otherwise.
// Balanced Binary Tree:
// A empty binary tree or binary tree with zero nodes is always balanced. For a non empty binary tree to be balanced, following conditions must be met:
// 1. The left and right subtrees must be balanced.
// 2. |hL - hR| <= 1, where hL is the height or depth of left subtree and hR is the height or depth of right subtree.    
// Input format:
// The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have a left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
// Output format
// The first and only line of output contains true or false.
// Constraints
// Time Limit: 1 second
// Sample Input 1 :
// 5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
// Sample Output 1 :
// false
// Sample Input 2 :
// 1 2 3 -1 -1 -1 -1
// Sample Output 2 :
// true


/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
 if(root==null)
            return true;
        int ans1,ans2;
        ans1=height(root.left);
        ans2=height(root.right);
        if(checkBalanced(root.left)){
            if(checkBalanced(root.right)){
                if(Math.abs(ans1-ans2)<=1){
                      return true;
                }
            }
          
        }
        return false;
	}
    public static int height(BinaryTreeNode<Integer> root){
        if (root==null)
            return 0;
        int a=Math.max(height(root.left),height(root.right));
        return a+1;
    }

}
 */

public class Solution {

	public static boolean checkBalanced(BinaryTreeNode<Integer> root) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        
        if(root==null)
            return true;
        
        int ans1=height(root.left);
        int ans2=height(root.right);
        
        if(checkBalanced(root.left) && checkBalanced(root.right)){
            if(Math.abs(ans1-ans2)<=1)
                return true;
        }
        
        return false;
        
	}
    
    public static int height(BinaryTreeNode<Integer> root){
        if(root==null)
            return 0;
        
        int ans=Math.max(height(root.left),height(root.right));
        return ans+1;
    }

}
