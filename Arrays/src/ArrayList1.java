import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        ArrayList<Integer> list=new ArrayList<>();
//
//        int n=s.nextInt();
//        for(int i=0;i<n;i++){
//            list.add(s.nextInt());
//        }
//
//        for(int i=0;i<n;i++){
//            System.out.print(list.get(i)+" ");
//        }

//        ArrayList<Integer> list=new ArrayList<>();
//        int[] nums={3,1,4,1,5};
//        for(int num:nums){
//            if(!list.contains(num)){
//                list.add(num);
//            }
//        }
//        System.out.println(list);

        StringBuilder sb=new StringBuilder();
        sb.append("0110");
        String s="0110";
        boolean y=s.contains("0110");
        int n=3;
        System.out.println(y);
        int num=Integer.parseInt(s,2);
        System.out.println(num);
    }
}
