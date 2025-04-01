package da4;
class Pair<K, V> {
    private K key;
    private V value;
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public String display() {
        return "Pair{" + "key=" + key + ", value=" + value + '}';
    }
}
public class PairTest {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Age", 30);
        System.out.println(pair1.display());
        Pair<Boolean, Integer> pair2 = new Pair<>(true, 25);
        System.out.println(pair2.display());
    }
}
