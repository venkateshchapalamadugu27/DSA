import java.util.Scanner;

public class sum {
 public static void main(String[] args) {
      int res=sum(1,2,6,9,0,5);
      System.out.println("The result is :"+res);
 }
  static int sum(int ...v){
  int sum=0;
  for(int i : v){
      sum+=i;
  }
  return sum;
 }

}
