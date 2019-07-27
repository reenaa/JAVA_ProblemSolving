import java.util.*;
class ListNode{
	int val;
	ListNode next;
	ListNode(int value){
		this.val = value;
	}
}
public class MergeTwoSortedLists {
	public static void main(String[] args){
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		l1.next.next.next = null;
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		l2.next.next.next = null;
		
		printList(l1);
		printList(l2);
		
		ListNode mergedList = mergeLists(l1,l2);
		System.out.println("Merged List: ");
		printList(mergedList);
		
	}
	public static ListNode mergeLists(ListNode l1,ListNode l2){
		if(l1==null){
			return l2;
		}
		if(l2==null){
			return l1;
		}
		if(l1.val < l2.val){
			l1.next = mergeLists(l1.next, l2);
			return l1;
		}
		else{
			l2.next = mergeLists(l2.next, l1);
			return l2;
		}
	}
	public static void printList(ListNode head){
		System.out.println("");
		while(head!=null){
			System.out.print(head.val+"->");
			head = head.next;
		}
	}
}



	
		
