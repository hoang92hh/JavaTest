import java.util.*;

public class TestSet {

    public static void main(String[] args) {
//        Set<String>  setList = new LinkedHashSet<>();
//
//
//        setList.add("5");
//        setList.add("2");
//        setList.add("1");
//        setList.add("a");
//        setList.add("1");
//        setList.add("z");
//        setList.add("Z");
//        setList.add("2");
//
//        Iterator<String> iterator = setList.iterator();
//
//        while(iterator.hasNext()) {
//            String element = iterator.next();
//            System.out.println(element);
//        }


        String a = new String("hoang");
        System.out.println(a.hashCode());
        String b = new String("hoang");
        System.out.println(b.hashCode());
        String c = "hoang";
        System.out.println(c.hashCode());







        System.out.println(a==b);
        System.out.println(a.equals(b));

//        System.out.println(a==c);
//        System.out.println(a.equals(c));

    }


}
