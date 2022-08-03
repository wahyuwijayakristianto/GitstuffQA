package streams;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.zeromq.SocketType.type;

public class test1 {
    public static void main(String[] args) {
        streamFiler();
    }
    
    public void regular(){
        ArrayList <String> names = new ArrayList<>();
        names.add("Abhijeet");
        names.add("Don");
        names.add("Alekhya");
        names.add("Adam");
        names.add("Ram");
        int count = 0;
        for (int i = 0; i < names.size(); i++) {
            String actual = names.get(i);
            if(actual.startsWith("A")){
                count++;
            }
        }
        System.out.println(count);
    }

    @Test
    public static void streamFiler(){
        ArrayList <String> names = new ArrayList<>();
        names.add("Abhijeet");
        names.add("Don");
        names.add("Alekhya");
        names.add("Adam");
        names.add("Ram");

        long c =  names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(c);
    }
}
