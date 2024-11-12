import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BinaryTree tree=new BinaryTree();
        Scanner s=new Scanner(System.in);
        tree.populate(s);
        tree.prettyDisplay();
    }
}