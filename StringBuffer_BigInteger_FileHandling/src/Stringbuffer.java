import java.text.DecimalFormat;
import java.util.*;
public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("Venkatesh");

        sb.insert(sb.length()," Chapalamadugu ");
        sb.append("27");
//        sb.delete(0,9);
//        sb.deleteCharAt(10);
//        sb.replace(0,9,"Aruna");
//        sb.reverse();
        String s=sb.toString();

        System.out.println(s);


         int n=5;
         String rs=RandomString.generateRandomString(n);
        System.out.println(rs);

        String rem="Hi hello qwerty uiop";
        System.out.println(rem.replaceAll("\\s",""));
        String[] arr=rem.split(" ");
        System.out.println(Arrays.toString(arr));
//        String[] arr1=rem.split(" \\s+");
//        System.out.println(Arrays.toString(arr1));

        DecimalFormat df=new DecimalFormat("0.00");
        System.out.println(df.format(7.268469977));

//        HashMap<Integer,Integer> map=new HashMap<>();
//        map.put(1,0);

//         List<Integer> list=new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);  
//         list.add(0,5);
//        System.out.println(list);
//        list.remove(0);
//        System.out.println(list);
    }


}
