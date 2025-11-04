public class Main {
    public static linkedlist copyList(linkedlist original) {
        linkedlist copy = new linkedlist();
        node current = original.getHead();
        while (current != null) {
            copy.add(current.data);
            current = current.next;
        }
        return copy;
    }
    public static void main(String[] args) {
        DataGenerator generator = new DataGenerator();
        linkedlist originalList1 = generator.generateData(1000);
        linkedlist list_kecilBubble = copyList(originalList1);
        linkedlist list_kecilQuick = copyList(originalList1);
        
        linkedlist originalList2 = generator.generateData(10000); 
        linkedlist list_menengahBubble = copyList(originalList2);
        linkedlist list_menengahQuick = copyList(originalList2);

        linkedlist originalList3 = generator.generateData(50000);
        linkedlist list_besarBubble = copyList(originalList3);
        linkedlist list_besarQuick = copyList(originalList3);

        // list_kecilBubble = generator.generateData(1000);
        // list_kecilQuick = generator.generateData(1000);

        // list_menengahBubble = generator.generateData(5000);
        // list_menengahQuick = generator.generateData(5000);

        // list_besarBubble = generator.generateData(10000);
        // list_besarQuick = generator.generateData(10000);

        bubblesort bubbleKecil = new bubblesort();
        quicksort quickKecil = new quicksort();

        long startTime = System.nanoTime();
        bubbleKecil.bubbleSort(list_kecilBubble.getHead());
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Bubble Sort execution time in milliseconds: " + (duration / 1_000_000.0) + "(" + list_kecilBubble.size() + " data)");

        startTime = System.nanoTime();
        quickKecil.quickSort(list_kecilQuick.getHead());
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Quick Sortexecution time in milliseconds: " + (duration / 1_000_000.0) + "(" + list_kecilQuick.size() + " data)");

        bubblesort bubbleMenengah = new bubblesort();
        quicksort quickMenengah = new quicksort();

        startTime = System.nanoTime();
        bubbleMenengah.bubbleSort(list_menengahBubble.getHead());
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("\nBubble Sort execution time in milliseconds: " + (duration / 1_000_000.0) + "(" + list_menengahBubble.size() + " data)");

        startTime = System.nanoTime();
        quickMenengah.quickSort(list_menengahQuick.getHead());
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Quick Sort data execution time in milliseconds: " + (duration / 1_000_000.0) + "(" + list_menengahQuick.size() + " data)");

        bubblesort bubbleBesar = new bubblesort();
        quicksort quickBesar = new quicksort();

        startTime = System.nanoTime();
        bubbleBesar.bubbleSort(list_besarBubble.getHead());
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("\nBubble sort execution time in milliseconds: " + (duration / 1_000_000.0) + "(" + list_besarBubble.size() + " data)");

        startTime = System.nanoTime();
        quickBesar.quickSort(list_besarQuick.getHead());
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Quick Sort data execution time in milliseconds: " + (duration / 1_000_000.0)+ "(" + list_besarQuick.size() + " data)");
    }
}
