

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
