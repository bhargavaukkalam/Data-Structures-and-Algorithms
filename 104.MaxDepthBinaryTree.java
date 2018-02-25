/*
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

For example:
Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
*/class TreeNode3{
	int val;
	TreeNode3 left;
	TreeNode3 right;
	public TreeNode3(int x) {
		val=x;
	}
	
}
public class MaxDepthBinaryTree {
	TreeNode3 root;

	public MaxDepthBinaryTree() {
		root=null;
	}
	
	public int maxDepth(TreeNode3 root){
		if(root==null){
			return 0;
		}
		int left=maxDepth(root.left);
		int right=maxDepth(root.right);
		
		return 1+Math.max(left, right);
	}
	
	public void inOrder(TreeNode3 node){
		if(node==null){
			return;
		}
		inOrder(node.left);
		System.out.print(node.val+" ");
		inOrder(node.right);
		
	}
	
	public static void main(String[] args) {
		MaxDepthBinaryTree btree=new MaxDepthBinaryTree();
		btree.root=new TreeNode3(3);
		btree.root.left=new TreeNode3(2);
		btree.root.right=new TreeNode3(7);
		btree.root.left.left=new TreeNode3(1);
		btree.root.right.left=new TreeNode3(6);
		btree.root.right.left.left=new TreeNode3(5);
		btree.inOrder(btree.root);
		System.out.println();
		int output=btree.maxDepth(btree.root);
		System.out.println("Maximum depth is : "+ output);
	}
}
