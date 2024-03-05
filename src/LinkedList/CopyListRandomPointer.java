// https://leetcode.com/problems/copy-list-with-random-pointer/description/?envType=study-plan-v2&envId=top-interview-150
// A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.

// Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.

// For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the corresponding two nodes x and y in the copied list, x.random --> y.

// Return the head of the copied linked list.

// The linked list is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:

// val: an integer representing Node.val
// random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or null if it does not point to any node.
// Your code will only be given the head of the original linked list.
import java.util.HashMap;
import java.util.Map;

class CopyListRandomPointer {
    public static void main (String[] args){
        CopyListRandomPointer obj = new CopyListRandomPointer();
        // obj.copyRandomList()
    }
    public Node copyRandomList(Node head) {
        Node h = new Node(0);
        Node tail = h;
        Node pointer1 = head;
        Node newNode = new Node(0);
        Node old = new Node(0);
        HashMap<Node, Node> map = new HashMap<Node, Node>();
        while (pointer1 != null) {
            Node node = new Node(pointer1.val);
            map.put(node, pointer1);
            tail.next = node;
            tail = tail.next;
            pointer1 = pointer1 != null ? pointer1.next : null;
        }
        tail = h.next;
        while (tail != null) {
            old = map.get(tail);
            if (old.random == null) {
                tail = tail != null ? tail.next : null;
                continue;
            } else {
                for (Map.Entry<Node, Node> entry : map.entrySet()) {
                    if (entry.getValue() == old.random)
                        newNode = entry.getKey();
                }
                tail.random = newNode;
                tail = tail != null ? tail.next : null;
            }
        }
        return h.next;
    }
    // public Node copyRandomList(Node head) {
    //     Node h = new Node(0);
    //     Node tail = h;
    //     Node start = head;
    //     while (start != null) {
    //         Node node = new Node(start.val);
    //         tail.next = node;
    //         tail = tail.next;
    //         start = start != null ? start.next : null;
    //     }
    //     start = head;
    //     tail = h.next;
    //     while (start != null) {
    //         System.out.println("Main list pointer" + start.val);
    //         if (start.random == null) {
    //             tail = tail != null ? tail.next : null;
    //             start = start != null ? start.next : null;
    //             continue;
    //         } else {
    //             Node tail2 = h.next;
    //             Node start2 = head;
    //             System.out.println("Random node value " + start.random.val);
    //             while (tail2 != null) {
    //                  System.out.println(" Tail2 val " + tail2.val);
    //                 if (start.random.val == start2.val && start.random.val == start2.val) {
    //                     System.out.println(" Tail2 val matches " + tail2.val);
    //                     tail.random = tail2;
    //                     break;
    //                 } else {
    //                     tail2 = tail2.next;
    //                 }
    //                 start2 = start2 != null ? start2.next : null;
    //             }
    //             tail = tail != null ? tail.next : null;
    //             start = start != null ? start.next : null;

    //         }

    //     }
    //     return h.next;
    // }
}