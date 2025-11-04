import java.util.Random;

public class DataGenerator {
    private Random random;
    public DataGenerator() {
        this.random = new Random();
    }
    public linkedlist generateData(int size) {
        linkedlist list = new linkedlist();
        for (int i = 0; i < size; i++) {
            int data = random.nextInt(1000) + 1; // angka 1-1000
            list.add(data);
        }
        return list;
    }

}
