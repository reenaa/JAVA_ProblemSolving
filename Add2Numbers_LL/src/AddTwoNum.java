class ListNode{
	int val;
	ListNode next;
	ListNode(int value){
		val = value;
		ListNode next = null;
	}
}
public class AddTwoNum {
	public static void main(String[] args){
		ListNode l1 = new ListNode(2);
		l1.next  = new ListNode(4);
		l1.next.next  = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next  = new ListNode(6);
		l2.next.next  = new ListNode(4);
		System.out.print("l1:");
		ListNode head = l1;
		while(head!=null){
			System.out.print(head.val+"->");
			head = head.next;
		}
		System.out.println("");
		System.out.print("l2:");
		ListNode head2 = l2;
		while(head2!=null){
			System.out.print(head2.val+"->");
			head2 = head2.next;
		}
		ListNode result = new ListNode(0);
		int carry = 0;
		ListNode l3 = result;
		while(l1!=null || l2!=null){
			int sum = carry;
			if(l1!=null){
				sum = sum+l1.val;
			}
			if(l2!=null){
				sum = sum+l2.val;
			}
			ListNode tmp = new ListNode(sum%10);
			l3.next = tmp;
			carry = sum/10;
			if(l1!=null){
				l1 = l1.next;
			}
			if(l2!=null){
				l2 = l2.next;
			}
			l3 = l3.next;
		}
		if(carry > 0){
			ListNode tmp = new ListNode(carry);
			l3.next = tmp;
		}
		result = result.next;
		System.out.println("");
		System.out.print("result:");
		ListNode r = result;
		while(r!=null){
			System.out.print(r.val+"->");
			r = r.next;
		}
	}	
}
