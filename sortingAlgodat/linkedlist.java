public class linkedlist {
    private node head;

    public void add(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
        } else {
            node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public node getHead() {
        return head;
    }

    public int size() {
        int count = 0;
        node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void printList() {
        
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

}

