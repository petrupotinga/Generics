public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Salut", 12);
        System.out.println("Valoarea perechii: value1= " + pair1.getFirstValue()
                + " , value2 = " + pair1.getSecondValue());
        Pair<Double, Integer> pair2 = new Pair<>(2.54, 12);
        System.out.println("Valoarea perechii: value1= " + pair2.getFirstValue()
                + " , value2 = " + pair2.getSecondValue());
        OtherPair<Integer> otherpair = new OtherPair<>(2, 12);
        System.out.println("Valoarea perechii: value1= " + otherpair.getFirstValue()
                + " , value2 = " + otherpair.getSecondValue());
    }
}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}

class OtherPair<V> {
    private V value1;
    private V value2;

    public V abc(V val) {
        return val;
    }

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getFirstValue() {
        return value1;
    }

    public V getSecondValue() {
        return value2;
    }
}
