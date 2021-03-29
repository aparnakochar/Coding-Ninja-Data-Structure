// Second Largest Element In Tree
// Send Feedback
// Given a generic tree, find and return the node with second largest value in given tree. Return NULL if no node with required value is present.
// Input format :
// Elements in level order form separated by space (as per done in class). Order is - 

// Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
// Output format:
// Second Largest node data
// Sample Input 1 :
// 10 3 20 30 40 2 40 50 0 0 0 0 
// Sample Output 1 :
// 40


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
	
		
	
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){

      if(root.children.size() == 0){
              return null;
          }
        TreeNode<Integer> f1=root,s1=null;
        int data=0;
         
   Queue<TreeNode<Integer>> queue=new LinkedList();
        queue.add(root);
       // queue.add(null);
        while(!queue.isEmpty()){
         TreeNode<Integer> frontEnd = queue.remove();
//             if(frontEnd == null){
//                 if(queue.isEmpty()){
//                     break;
//                 }
               
//                 queue.add(null);
//             }
            
                 for(int i=0;i<frontEnd.children.size();i++)
                    queue.add(frontEnd.children.get(i));
                
                if(frontEnd.data>data){
                    if(frontEnd.data>f1.data){
                        s1=f1;
                        data=f1.data;
                        f1=frontEnd;
                    }
                    else if(frontEnd.data<f1.data){
                        s1=frontEnd;
                        data=s1.data;
                    }
                }
               
            
       }
            return s1;
        
        
	}
	
}
