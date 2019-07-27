import java.util.*;
class ListNode{
	int value;
	ListNode next;
	ListNode(int value){
		this.value = value;
	}
}
public class PalindromeLinkedList {
	public static void main(String[] args){
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(1);
		head.next.next.next.next = null;
		
		ListNode p1 = head;
		while(p1!=null){
			System.out.print(p1.value+"->");
			p1 = p1.next;
		}
		System.out.print("null"+"\n");
		boolean b1 = checkPalindrome(head);
		if(b1)
			System.out.println("It is palindrome");
		else 
			System.out.println("Not palindrome");
	}
	public static boolean checkPalindrome(ListNode head){
		if(head == null || head.next == null)
			return false;
		
		//Find the list center
		ListNode fast = head;
		ListNode slow = head;
		while(fast.next !=null && fast.next.next!=null)
		{
			fast = fast.next.next;
			slow = slow.next;
		}
		 //Divide the list in two parts from slow pointer
		// The fast pointer reached to center.Create secondHead for second half list 
		ListNode secondHead = slow.next; 
		
		//and break the first half list after slow pointer.
	    //Break the original list at slow pointer, considering first half
		slow.next = null;  
		
		//reverse second half list
		ListNode p1 = secondHead;
		ListNode p2 = secondHead.next;
		while(p1!=null && p2!=null){
			ListNode tmp = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = tmp;
		}
		secondHead.next = null;
		
		//Compare the two sublist now.
		
		ListNode p = (p2==null)?p1:p2;  //P is pointing to second half list
		ListNode q = head;		        //q will point to first half list.
		while(p!=null){
			if(p.value!=q.value)
				return false;
			p = p.next;
			q = q.next;
		}
		return true; 
	}
}
