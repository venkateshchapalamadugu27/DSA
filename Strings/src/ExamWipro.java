import java.util.Scanner;

public class ExamWipro {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int cases=s.nextInt();
        s.nextLine();   // mistake
        String[] arr=new String[cases];

        for(int i=0;i<cases;i++){
            arr[i]=s.nextLine();
        }

        String upper="QWERTYUIOPASDFGHJKLZXCVBNM";

        for(int i=0;i<arr.length;i++){
            int count=0;
            String name=arr[i];

            for(int k=0;k<name.length();k++){
                if(upper.contains(String.valueOf(name.charAt(k)))){
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
