package Day37;
import java.util.Scanner;

public class doubleNum {
    public static class ListNode {
        int data;
		ListNode next;
		ListNode(int key){
			this.data=key;
		}
    }

    public static ListNode doubleIt(ListNode head) {
        ListNode temp = head;
        if (head.data > 4) {
            ListNode node = new ListNode(1);
            node.next = head;
            head = node;
        }
        while (temp != null) {
            int carry = 0;
            if (temp.next != null && temp.next.data > 4) {
                carry = 1;
            }
            int newVal = (temp.data * 2 + carry) % 10;
            temp.data = newVal;
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the linked list:");
        int n = scanner.nextInt(); //3
        
        System.out.println("Enter the elements of the linked list:");
        ListNode head = null;
        ListNode tail = null;
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();        //1 8 9
            ListNode newNode = new ListNode(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
        }

        ListNode result = doubleIt(head);

        System.out.println("Resulting linked list:");
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}
