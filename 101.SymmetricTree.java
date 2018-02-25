import java.util.Stack;

class TreeNode2{
	int val;
	TreeNode2 left;
	TreeNode2 right;
	public TreeNode2(int x) {
		val=x;
	}
	
}
public class SymmetricTree {
		TreeNode2 root;

		public SymmetricTree() {
			root=null;
		}
		
		// Recursive Implementation
//		public boolean isSymmetric(TreeNode2 root){
//			return (root==null) || same(root,root);
//		}
//		
//		public boolean same(TreeNode2 p,TreeNode2 q){
//			if(p==null && q==null){
//				return true;
//			}
//			if(p==null || q==null){
//				return false;
//			}
//			return (p.val==q.val) && same(p.left,q.right) && same(q.left,p.right);
//		}
		
		//Iterative way using Stacks
		public boolean isSymmetric(TreeNode2 root){
			Stack<TreeNode2> left=new Stack<>();
			Stack<TreeNode2> right=new Stack<>();
			left.push(root.left);
			right.push(root.right);
			
			while(!left.isEmpty() && !right.isEmpty()){
				TreeNode2 l=left.pop();
				TreeNode2 r=right.pop();
				if(l==null && r==null){
					continue;
				}
				else if((l==null ||r==null) || (l.val!=r.val)){
					return false;
				}
				left.push(l.left);
				left.push(r.left);
				right.push(r.right);
				right.push(l.right);
			}
			return true;
		}
		
		public void inOrder(TreeNode2 root){
			if(root==null){
				return;
			}
			inOrder(root.left);
			System.out.print(root.val+" ");
			inOrder(root.right);
			//System.out.println();
			
		}
		
		public static void main(String[] args) {
			SymmetricTree tree=new SymmetricTree();
			tree.root=new TreeNode2(1);
			tree.root.left=new TreeNode2(2);
			tree.root.right=new TreeNode2(2);
			tree.root.left.left=new TreeNode2(3);
			tree.root.right.right=new TreeNode2(3);
			tree.root.left.right=new TreeNode2(4);
			tree.root.right.left=new TreeNode2(5);
			tree.inOrder(tree.root);
			System.out.println();
			System.out.println("Output is : ");
			boolean output=tree.isSymmetric(tree.root);
			System.out.println(output);
		}
		
		
		
}
