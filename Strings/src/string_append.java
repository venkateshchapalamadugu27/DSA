public class string_append {
    public static void main(String[] args) {
        String s="venkatesh";
        String res=s.substring(2,s.length())+s.substring(0,2);
        String res1=s.substring(s.length()-2,s.length())+s.substring(0,s.length()-2);
        System.out.println(res);
        System.out.println(res1);
    }
}
