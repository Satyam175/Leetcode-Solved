public class MergeTwoSortedLists {
    public static void main(String[] args) {

    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode head = new ListNode();
        ListNode tail = head;

        while (l1 != null || l2 != null) {
            if (l2 == null || (l1 != null && l1.val < l2.val)) {
                tail.next = l1;
                tail = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                tail = l2;
                l2 = l2.next;
            }
        }

        return head.next;
    }
}
//Thoughts Before Coding
//    - We can implement a two pointer approach
//        - One pointer will be inside 'l1'
//        - Another pointer will be inside 'l2'
//    - In each of the iteration
//        - We will be comparing the node values at the current pointers
//        - We will retrieve the node with a smaller value to be
//          appended to our merged sorted list
//
//Answer
//    - Create the following variables
//        - head, the sentinel head of the merged sorted list
//        - tail, the sentinel tail of the merged sorted list
//    - While 'l1' OR 'l2' is not equal to 'null'
//        - If 'l2' is null OR 'l1' is not null AND 'l1.val' is less
//          than 'l2.val'
//            - Set 'tail.next' to 'l1'
//            - Set 'tail' to 'l1'
//            - Set 'l1' to 'l1.next'
//        - Else
//            - Set 'tail.next' to 'l2'
//            - Set 'tail' to 'l2'
//            - Set 'l2' to 'l2.next'
//    - Return 'head.next'
//
//What is the Time and Space Complexity?
//    - Time Complexity = O(m + n), where m,n are the length of the
//        two input list
//        - O(m + n), visit each node once
//    - Space Complexity = O(1)