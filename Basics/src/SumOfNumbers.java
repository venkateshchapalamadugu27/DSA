import java.util.*;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int option = 0;
        System.out.println("Enter options to select the particular 1.Sum 2.Average");
        switch (option){
            case 1: {
                int sum = 0;
                for (int num : arr) {
                    sum += num;
                }
                System.out.println("Sum : " + sum);
            }

        }
    }
}
