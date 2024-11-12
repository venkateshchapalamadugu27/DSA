package linearSearch;

public class searchChar {
    public static void main(String[] args) {
        String name="venkatesh";
        char target='s';
        System.out.println(linear2(name,target));

    }
    static boolean linear2(String str,char target){
        if(str.length()==0){
            return false;
        }

        for(char ch:str.toCharArray()){
            if(target==ch){
                return true;
            }
        }
        return false;

    }
    static boolean linear(String str,char target){
        if(str.length()==0){
            return false;
        }

        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;

    }
}
