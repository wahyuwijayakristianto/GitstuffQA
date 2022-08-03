package streams;
import java.util.*;
public class lambda {
    public static void main(String[] args) {

        List<String> list=new ArrayList<String>();
        list.add("Rick");
        list.add("Negan");
        list.add("Daryl");
        list.add("Glenn");
        list.add("Carl");
        list.forEach(
                // lambda expression
                System.out::println);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }



}
