package live.xiaoxu;

public class ChainReverseTest {

    public static void main(String[] args) {

        Node nodeOne = new Node(1);
        Node nodeTwo = new Node(2);
        Node nodeThree = new Node(3);
        nodeOne.next = nodeTwo;
        nodeTwo.next = nodeThree;
        Node reverseByFor = reverseByFor(nodeOne);

        Node nodeFour = new Node(4);
        Node nodeFive = new Node(5);
        Node nodeSix = new Node(6);
        nodeFour.next = nodeFive;
        nodeFive.next = nodeSix;
        Node reverseByRecursion = reverseByRecursion(nodeFour);

        Node nodeSeven = new Node(7);
        Node nodeEight = new Node(8);
        Node nodeNine = new Node(9);
        nodeSeven.next = nodeEight;
        nodeEight.next = nodeNine;
        Node reverseByRecursion2 = reverseByRecursion2(nodeSeven);

        System.out.println("end.");
    }

    public static Node reverseByRecursion(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head.next;
        Node newHead = reverseByRecursion(head.next);
        temp.next = head;
        head.next = null;
        return newHead;
    }

    public static Node reverseByRecursion2(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseByRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static Node reverseByFor(Node node) {
        Node pre = null;
        Node next = null;
        while (node != null) {
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
            System.out.println();
        }
        return pre;
    }

    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }
}