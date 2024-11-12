import java.util.Arrays;
import java.util.Comparator;

public class Sorting {
    public static void main(String[] args) {
        S venki=new S(23);
        S hemu=new S(1);
        S sasi=new S(33);
        S dinesh=new S(44);
        S[] arr={sasi,hemu,dinesh,venki};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] array={2,4,5,2,4,5};
        System.out.println(array[0]);
    }
}
