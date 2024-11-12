package Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        for (int i = 1; i < 6; i++) {
              list.add(i*5);
        }
        list.add(-2);
        list.add(23);
        Collections.sort(list);
        System.out.println(list);
    }
}
