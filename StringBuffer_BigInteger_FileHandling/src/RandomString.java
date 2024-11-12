import java.util.Random;

public class RandomString {
     static String generateRandomString(int size){
        StringBuffer sb=new StringBuffer();
        Random random=new Random();
        for(int i=0;i<size;i++){
            int randomInt= (int) (97+(26*random.nextFloat()));
            sb.append((char)randomInt);
        }
        return sb.toString();
    }
}
