public class quicksort {

    // Fungsi utama untuk Quick Sort
    public node quickSort(node head) {
        
        if (head == null || head.next == null)
            return head;

        node pivot = head;
        node current = head.next;

        node smallerHead = null, smallerTail = null;
        node greaterHead = null, greaterTail = null;

        while (current != null) {
            node next = current.next;
            current.next = null;

            if (current.data < pivot.data) {
                if (smallerHead == null) {
                    smallerHead = smallerTail = current;
                } else {
                    smallerTail.next = current;
                    smallerTail = current;
                }
            } else {
                if (greaterHead == null) {
                    greaterHead = greaterTail = current;
                } else {
                    greaterTail.next = current;
                    greaterTail = current;
                }
            }
            current = next;
        }

        smallerHead = quickSort(smallerHead);
        greaterHead = quickSort(greaterHead);

        return concat(smallerHead, pivot, greaterHead);
    }

    private node concat(node left, node pivot, node right) {
        node head = null;

        if (left != null) {
            head = left;
            node temp = left;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = pivot;
        } else {
            head = pivot;
        }

        pivot.next = right;
        return head;
    }

    public void printList(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
