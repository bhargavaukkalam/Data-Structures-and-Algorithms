
/*
Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.


Example 1:

Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
Example 2:

Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
Example 3:

Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false
*/
class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int x) {
			val=x;
		}
	}

public class SameTree {
	
		TreeNode root;
		
		SameTree(){
			root=null;
		}
	
	public boolean isSameTree(TreeNode p,TreeNode q){
		if(p==null && q==null){
			return true;
		}
		if(p==null || q==null){
			return false;
		}
		
		return (p.val==q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
	}
	
	public void inOrder(TreeNode root){
		if(root==null){
			return;
		}
		inOrder(root.left);
		System.out.print(root.val+" ");
		inOrder(root.right);
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		SameTree tree1=new SameTree();
		tree1.root=new TreeNode(1);
		tree1.root.left=new TreeNode(2);
		tree1.root.right=new TreeNode(3);
		
		SameTree tree2=new SameTree();
		tree2.root=new TreeNode(1);
		tree2.root.left=new TreeNode(2);
		tree2.root.right=new TreeNode(3);
		tree1.inOrder(tree1.root);
		tree2.inOrder(tree2.root);
		
		SameTree tree=new SameTree();
		boolean result=tree.isSameTree(tree1.root,tree2.root);
		System.out.println("Result is : "+result);
		
		
	}
}
