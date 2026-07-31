/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/31 15:13
 *
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * 给定head，即链表的头，判断链表中是否包含一个环。
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 * 如果链表中存在某个节点，可以通过连续跟踪 next 指针再次到达，则表示链表中存在一个循环。内部，pos 用于表示尾部 next 指针所连接节点的索引 。 注意， pos 不作为参数传递。
 *
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 * 如果链表中有循环，true返回 。否则，退false。
 *
 *
 *
 * Example 1:
 * 示例1：
 *
 *
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 * Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
 * Example 2:
 * 示例2：
 *
 *
 * Input: head = [1,2], pos = 0
 * Output: true
 * Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
 * Example 3:
 * 示例3：
 *
 *
 * Input: head = [1], pos = -1
 * Output: false
 * Explanation: There is no cycle in the linked list.
 *
 *
 * Constraints:
 * 限制条件：
 *
 * The number of the nodes in the list is in the range [0, 104].
 * 列表中节点的数量属于范围 [0, 104]。
 * -105 <= Node.val <= 105
 * -105 <= Node.val <= 105
 * pos is -1 or a valid index in the linked-list.
 * pos 是链接列表中的-1或有效索引。
 *
 *
 * Follow up: Can you solve it using O(1) (i.e. constant) memory?
 * 后续：你能用O(1)（即常数）内存来解吗？
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }


}
