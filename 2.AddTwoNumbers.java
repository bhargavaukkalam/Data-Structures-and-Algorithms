import java.util.Scanner;

public class AddTwoNumbers {
	
	 static ListNode head1, head2;
	
	 static class ListNode {
		 
	        int val;
	        ListNode next;
	 
	        ListNode(int d) {
	            val = d;
	            next = null;
	        }
	    }
	public ListNode addTwoNumbers(ListNode l1,ListNode l2){
		ListNode p1=l1;
		ListNode p2=l2;
		ListNode resultHead=new ListNode(0);
		ListNode d=resultHead;
		int sum=0;
		
		while(p1!=null|| p2!=null){
			sum=sum/10;
			if(p1!=null){
				sum+=p1.val;
				p1=p1.next;
			}
			
			if(p2!=null){
				sum+=p2.val;
				p2=p2.next;
			}
			
			d.next=new ListNode(sum%10);
			d=d.next;
		}
		
		if(sum/10==1){
			d.next=new ListNode(1);
			
		}
		
		return resultHead.next;
		
	}
	// Defining Node 1 input
	public void pushNode1(int i){
		ListNode node=new ListNode(i);
		node.next=head1;
		head1=node;
	}
	
	//Defining Node 2 input
	public void pushNode2(int i){
		ListNode node=new ListNode(i);
		node.next=head2;
		head2=node;
	}
	
	void printList(ListNode head){
		while(head!=null){
			System.out.print(head.val+" ");
			head=head.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		AddTwoNumbers list=new AddTwoNumbers();
	//+---------------Giving default input values---------+	
		// creating first list
//        list.head1 = new ListNode(7);
//        list.head1.next = new ListNode(5);
//        list.head1.next.next = new ListNode(9);
//        list.head1.next.next.next = new ListNode(4);
//        list.head1.next.next.next.next = new ListNode(6);
//        System.out.print("First List is ");
//        list.printList(head1);
 
        // creating seconnd list
//        list.head2 = new ListNode(8);
//        list.head2.next = new ListNode(4);
//        System.out.print("Second List is ");
//        list.printList(head2);
		
	//+--------------Giving Default inputs using methods--------------------+
//		
//		list.pushNode1(7);
//		list.pushNode1(5);
//		list.pushNode1(9);
//		list.pushNode1(4);
//		list.pushNode1(6);
//		System.out.print("First List is ");
//        list.printList(head1);
//        
//        list.pushNode2(8);
//        list.pushNode2(4);
//        System.out.print("Second List is ");
//        list.printList(head2);
        
        //+----------------Giving user inputs-----------------+
		
        System.out.println("Enter values for list 1");
        for(int i=0;i<10;i++){
        	list.pushNode1(input.nextInt());
        }
        System.out.print("First list is");
        list.printList(head1);
        
        System.out.println("Enter values for list 2");
        for(int i=0;i<10;i++){
        	list.pushNode2(input.nextInt());
        }
        System.out.print("Second list is");
        list.printList(head2);
        	
        
		
 
        // add the two lists and see the result
        ListNode rs = list.addTwoNumbers(head1, head2);
        System.out.print("Resultant List is ");
        list.printList(rs);
		
	}
}
