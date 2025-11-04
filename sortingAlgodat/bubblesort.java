<<<<<<< HEAD
public class bubblesort {
    node head;
    public void bubbleSort() {
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
=======
public class bubblesort {    
>>>>>>> e2fb95fb89883e190156ad62a91ce3af69c9b7da
}

