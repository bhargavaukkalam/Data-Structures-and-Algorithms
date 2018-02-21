/*
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

*/
import java.util.Scanner;

public class MergeTwoSortedLists {
	
	 static ListNode head1, head2;
		
	 static class ListNode {
		 
	        int val;
	        ListNode next;
	 
	        ListNode(int d) {
	            val = d;
	            next = null;
	        }
	    }
	 
	public ListNode mergeTwoSortedLists(ListNode l1,ListNode l2){
		ListNode l3=new ListNode(0);
		ListNode resultHead=l3;
		
		while(l1!=null && l2!=null){
			if(l1.val <l2.val){
				l3.next=l1;
				l1=l1.next;
			}
			else{
				l3.next=l2;
				l2=l2.next;
			}
			l3=l3.next;
		}
		
		if(l1!=null){
			l3.next=l1;
		}
		
		if(l2!=null){
			l3.next=l2;
		}
		
		return resultHead.next;
	}
	
	public void pushNode1(int i){
		ListNode node=new ListNode(i);
		node.next=head1;
		head1=node;	
	}
	
	public void pushNode2(int i){
		ListNode node=new ListNode(i);
		node.next=head2;
		head2=node;	
	}
	
	public void printList(ListNode head){
		while(head!=null){
		System.out.println(head.val+" ");
		head=head.next;
		}
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		MergeTwoSortedLists list=new MergeTwoSortedLists();
		//List 1 input :
//		list.head1=new ListNode(1);
//		list.head1.next=new ListNode(2);
//		list.head1.next.next=new ListNode(4);
//		System.out.println("First list l1 is : ");
//		list.printList(head1);
//		//List 2 input :
//		list.head2=new ListNode(1);
//		list.head2.next=new ListNode(3);
//		list.head2.next.next=new ListNode(4);
//		System.out.println("First list l2 is : ");
//		list.printList(head2);
		
//		+--------------User Input--------------+
		System.out.println("Enter the number of list 1 value :");
		int value1=input.nextInt();
		System.out.println("Enter the number of list 2 value :");
		int value2=input.nextInt();
		
		System.out.println("Enter values for list 1");
        for(int i=0;i<value1;i++){
        	list.pushNode1(input.nextInt());
        }
        System.out.println("First list is :");
        list.printList(head1);
        
        System.out.println("Enter values for list 2");
        for(int i=0;i<value2;i++){
        	list.pushNode2(input.nextInt());
        }
        System.out.print("Second list is :");
        list.printList(head2);
		
		ListNode result=list.mergeTwoSortedLists(head1, head2);
		System.out.println("output List is :");
		list.printList(result);
			
		
	}
}	
