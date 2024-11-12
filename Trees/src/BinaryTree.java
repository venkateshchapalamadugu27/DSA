import java.util.Scanner;

public class BinaryTree {
    class Node{
        int value;
        Node right;
        Node left;

        public Node(int value){
            this.value=value;
        }
    }
    private Node root;

    public void populate(Scanner s){
        System.out.println("Enter the root Node :- ");
        int val=s.nextInt();
        root=new Node(val);
        populate(s,root);
    }
    private void populate(Scanner s,Node node){
        System.out.println("Do you want to add new value left of :- "+node.value);
        boolean left=s.nextBoolean();
        if(left){
            System.out.println("Enter the value :- ");
            int val=s.nextInt();
            node.left=new Node(val);
            populate(s,node.left);
        }
        System.out.println("Do you want to add new value right of :- "+node.value);
        boolean right=s.nextBoolean();
        if(right){
            System.out.println("Enter the value :- ");
            int val=s.nextInt();
            node.right=new Node(val);
            populate(s,node.right);
        }

    }
    public void display(){
        display(root,"");
    }
    private void display(Node node,String space){
        if(node==null){
            return ;
        }
        System.out.println(space+node.value);
        display(node.left,space+"\t");
        display(node.right,space+"\t");
    }
    public void prettyDisplay(){
        prettyDisplay(root,0);
    }
    private void prettyDisplay(Node node,int level){
        if(node==null){
            return;
        }
        prettyDisplay(node.right,level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|----->"+node.value);
        }
        else{
            System.out.println(node.value);
        }
        prettyDisplay(node.left,level+1);
    }


}

class Mains{
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BinaryTree tree=new BinaryTree();
        Scanner s=new Scanner(System.in);
        tree.populate(s);
        tree.prettyDisplay();
    }
}
