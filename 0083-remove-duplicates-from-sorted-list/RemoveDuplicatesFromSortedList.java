import org.w3c.dom.Node;

/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/12 14:15
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 * 鉴于已排序链表的 head，删除所有重复元素，使每个元素只出现一次。也要返回已排序的链表。
 * <p>
 * <p>
 * <p>
 * Example 1:
 * 示例1：
 * <p>
 * <p>
 * Input: head = [1,1,2]
 * Output: [1,2]
 * Example 2:
 * 示例2：
 * <p>
 * <p>
 * Input: head = [1,1,2,3,3]
 * Output: [1,2,3]
 * <p>
 * <p>
 * Constraints:
 * 限制条件：
 * <p>
 * The number of nodes in the list is in the range [0, 300].
 * 列表中的节点数范围为 [0, 300]。
 * -100 <= Node.val <= 100
 * -100 <= Node.val <= 100
 * The list is guaranteed to be sorted in ascending order.
 * 列表保证按升序排列。
 */
public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);
        RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();
        ListNode out = removeDuplicatesFromSortedList.deleteDuplicates(head);
        while (out.next != null) {
            System.out.println(out.val);
        }
    }

}
