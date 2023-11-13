import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
//        List<Number>list1 = new ArrayList<Integer>();
//        List<Object>list2 = new ArrayList<Integer>();
        List<? extends Number> list3 = new ArrayList<Integer>();

        List<Double> list4 = new ArrayList<>();
        list4.add(3.14);
        list4.add(3.15);
        list4.add(3.16);
        showListInfo(list4);
        List<String> list5 = new ArrayList<>();
        list5.add("salut");
        list5.add("OK");
        list5.add("Pa");
        showListInfo(list5);

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(3.14);
        ald.add(3.15);
        ald.add(3.16);
        System.out.println(sum(ald));

        ArrayList<String> als = new ArrayList<>();
//        System.out.println(sum(als)); -nu permite
    }

    static void showListInfo(List<?> list) {
        System.out.println("Lista mea este : " + list);
    }

    public static double sum(ArrayList<? extends Number> al) {
        double sum = 0;
        for (Number n : al) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
