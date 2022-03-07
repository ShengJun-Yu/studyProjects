package AlgorithmClass;

/**
 * @author : Bojack
 * @date : Created in 10:37 2022.03.07
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

 class 移除链表元素 {
    public ListNode removeElements(ListNode head, int val) {
//         创建一个假的头结点
        ListNode dummyNode = new ListNode(-1, head);
        ListNode cur = head;
        ListNode pre = dummyNode;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return dummyNode.next;
    }
}
