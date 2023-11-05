import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("OK");
//        list.add(5);
//        list.add(new StringBuilder("ygfg"));
//        list.add(new Car());
        list.add("privet");
        list.add("privet");
        list.add("poka");
        list.add("ok");
//        list.add(new Car());
        for (Object o : list) {
            System.out.println(o + " lungimea " + ((String) o).length());
        }
    }
}