import java.util.Scanner;

public class RemDupsSortedList {
	static ListNode head;
	class ListNode{
		int val;
		ListNode next;
		public ListNode(int d) {
		val=d;
		next=null;
		}
	}
	
	public void pushNode(int i){
		ListNode node=new ListNode(i);
		node.next=head;
		head=node;
		
	}
	
	public void printList(ListNode head){
		while(head!=null){
			System.out.println(head.val+" ");
			head=head.next;
		}
		System.out.println();
	}
	
	public ListNode deleteDuplicates(ListNode head){
		ListNode node=head;
		while(node!=null){
			if(node.next==null){
				break;
			}
			else if(node.val==node.next.val){
				node.next=node.next.next;
			}
			else{
				node=node.next;
			}
		}
		return head;
	}
	
	public static void main(String[] args) {
		RemDupsSortedList obj=new RemDupsSortedList();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter list : ");
		for(int i=0;i<8;i++){
			obj.pushNode(input.nextInt());
		}
		System.out.println("List is : ");
		obj.printList(head);
		ListNode output=obj.deleteDuplicates(head);
        obj.printList(output);
	}
}
