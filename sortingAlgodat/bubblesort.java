public class bubblesort {
    public void bubbleSort(node head) {
        if (head == null || head.next == null) return;

        boolean swapped;
        do {
            swapped = false;
            node current = head;
            while (current.next != null) {
                if (current.data > current.next.data) {
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
}

