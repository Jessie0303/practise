package per.practise;

public class MyListNode {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 创建一个新链表，表头值为0
        ListNode head = new ListNode(0);
        ListNode cur = head;
        // tmp是进位值
        int tmp = 0;
        // 当两个链表至少有一个没有遍历结束
        while(l1 != null || l2 != null){
            // 两个链表当前节点的值相加，并加上进位符，则是新链表的当前节点值       
            cur.val = (l1 == null?0:l1.val) + (l2 == null?0:l2.val)+tmp;
            // 进位值清零
            tmp = 0;
            // 如果新链表当前节点值为mod10的余数，进位则是商
            tmp = cur.val/10;
            cur.val = cur.val%10;
                  
            // 如果两个链表都遍历完了，并且进位值为0，则新链表结束，否则创建一个新节点，继续遍历
            
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
            ListNode pre = new ListNode(0);
            cur.next = pre;
            cur = pre;
             
        }
        // 如果两个链表都遍历完了，但是有进位值，那么新节点的值为进位值
        if(tmp!= 0){
            cur.val = tmp;
        }
        return head;
    }
	
	public static void main(String[] args) {
		MyListNode test = new MyListNode();
		ListNode head1 = new ListNode(9);
		ListNode l1 = head1;
		ListNode head2 = new ListNode(9);
		ListNode l2 = head2;
		int index = 0;
		while(index < 7) {
			l1.next = new ListNode(9);
			index++;
			l1 = l1.next;
		}
		index = 0;
		while(index < 4) {
			l2.next = new ListNode(9);
			index++;
			l2 = l2.next;
		}
		test.addTwoNumbers(head1, head2);
	}
}
