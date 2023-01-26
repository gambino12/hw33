public class ListNodeUtils {
    public static void main(String[] args) {
        ListNode ls = new ListNode(1,new ListNode(2,new ListNode(4)));
        System.out.println(ls);
        System.out.println(addFirst(4,ls)); //1 task
        System.out.println(removeFirst(ls)); //1.2 task
        System.out.println(reverse(ls));   //2 task

    }
    public static ListNode addFirst(int value, ListNode listForAdd) {
        ListNode newNode = new ListNode();
        newNode.val = value;
        if (listForAdd != null) {
            newNode.next = listForAdd;
        }
        return newNode;
    }

    public static ListNode removeFirst(ListNode listForRemove) {
        if (listForRemove != null) {
            listForRemove = listForRemove.next;
        }
        return listForRemove;
    }

    public static ListNode reverse(ListNode listForReverse) {
        ListNode previous = null;
        while (listForReverse != null) {
            ListNode nextElement = listForReverse.next;
            listForReverse.next = previous;
            previous = listForReverse;
            listForReverse = nextElement;
        }
        return previous;
    }

    public static class ListNode {
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

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
