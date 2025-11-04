public class Main {
    public static void main(String[] args) {
        DataGenerator generator = new DataGenerator();
        linkedlist list_kecilBubble = new linkedlist();
        linkedlist list_kecilQuick = new linkedlist();
        // linkedlist list_menengahBubble = new linkedlist();
        // linkedlist list_menengahQuick = new linkedlist();
        // linkedlist list_besarBubble = new linkedlist();
        // linkedlist list_besarQuick = new linkedlist();

        list_kecilBubble = generator.generateData(1000);
        list_kecilQuick = generator.generateData(1000);

        // list_menengahBubble = generator.generateData(500000);
        // list_menengahQuick = generator.generateData(500000);

        // list_besarBubble = generator.generateData(100000000);
        // list_besarQuick = generator.generateData(100000000);

        bubblesort bubblesortKecil = new bubblesort();

        long startTime = System.nanoTime();
        bubblesortKecil.bubbleSort(list_kecilBubble.getHead());
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Bubble Sort execution time in milliseconds: " + (duration / 1_000_000.0));

        quicksort quickKecil = new quicksort();

        startTime = System.nanoTime();
        quickKecil.quickSort(list_kecilQuick.getHead());
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Quick Sort execution time in milliseconds: " + (duration / 1_000_000.0));
    }
}
