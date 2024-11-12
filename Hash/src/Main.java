import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
         HashMap<String,Integer> map=new HashMap<>();
         map.put("venki",23);
         map.put("hemanth",1);
         map.put("range",56);


        System.out.println(map.get("venki"));

        HashSet<Integer> set=new HashSet<>();
        set.add(4);
        set.add(2);
        set.add(1);
        set.add(6);
        set.add(3);
        set.add(4);

        System.out.println(set);
        System.out.println(Arrays.toString(set.toArray()));
    }
}