package tree;

public class MergeTwoSortedList {

    // way 1: recursive
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

//    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
//        if(list1 == null || list2 == null){
//            return (list1 != null) ? list1 : list2;
//        }
//
//        if(list1.val > list2.val){
//            ListNode temp = list1;
//            list1 = list2;
//            list2 = temp;
//        }
//
//        list1.next = mergeTwoLists(list1.next, list2);
//
//        return list1;
//    }

    // way 2: iterative
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
//        ListNode dummy = new ListNode(-1);
//        ListNode current = dummy;
//
//        while(list1 != null && list2 != null){
//            if(list1.val < list2.val){
//                current.next = list1;
//                list1 = list1.next;
//            }else{
//                current.next = list2;
//                list2 = list2.next;
//            }
//            current = current.next;
//        }
//
//        current.next = (list1 != null) ? list1 : list2;
//
//        return dummy.next;
//    }

    public static void main(String[] args) {
        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode result = mergeTwoSortedList.mergeTwoLists(list1, list2);

        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

}
