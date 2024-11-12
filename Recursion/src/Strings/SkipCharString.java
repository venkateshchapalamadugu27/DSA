package Strings;

public class SkipCharString {
    public static void main(String[] args) {
        skipchar("naaaandishaahh","");
        System.out.println(skipword("baccappleaef"));
        System.out.println(skipword2("baccappleappef"));
    }
    static void skipchar(String given, String ans){
        if(given.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch=given.charAt(0);
        if('a' == ch){
            skipchar(given.substring(1),ans);
        }
        else{
            skipchar(given.substring(1),ch+ans);
        }

    }
    static String skipword(String given){
        if(given.isEmpty()){
            return "";
        }
        if(given.startsWith("apple")){
            return skipword(given.substring(5));
        }
        else{
           return given.charAt(0) + skipword(given.substring(1));
        }
    }
    static String skipword2(String given){
        if(given.isEmpty()){
            return "";
        }
        if(given.startsWith("app") && !given.startsWith("apple")){
            return skipword(given.substring(3));
        }
        else{
            return given.charAt(0) + skipword(given.substring(1));
        }
    }
}
