import javax.sound.midi.SysexMessage;

public class characters {
    public static void main(String[] args) {
        String arr="";
        for(int i=0;i<26;i++){
            char ch=(char) ('A'+i);
            arr+=ch;
        }
        System.out.print(arr);

    }
}
