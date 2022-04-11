import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCollections {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("anh");
        list.add("Hoang");
        list.add("Sang");
        list.add("Hoang");
        list.add("tuan");

        Collections.sort(list);

        for (String e: list) {
            System.out.println(e);
        }
        System.out.println("----------------------------------------------------------------");

        list.add("An");
        Collections.sort(list, new ComparatorImpl());
        for (String e: list) {
            System.out.println(e);
        }
    }
}
