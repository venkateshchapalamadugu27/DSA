public class SBuilder {
    public static void main(String[] args) {
//        StringBuilder arr=new StringBuilder();
//        for(int i=0;i<26;i++){
//            arr.append((char)('A'+i));
//        }
//        arr.deleteCharAt();
//
//        System.out.println(arr.substring(2,8));
        String s = "abcbddddd", p = "abcd";
        int[] removable = {3,2,1,4,5,6};
        System.out.println(maximumRemovals(s,p,removable));
    }
    public static int maximumRemovals(String s, String p, int[] removable) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<removable.length;i++){
            sb.deleteCharAt(removable[i]);
//            sb.append("0",0,1);
//            System.out.println(sb.toString());
            if(!sb.toString().contains(p)){
                return i;
            }
        }
        return -1;
    }
}
