
public class BinarySearchTree {
    public BinarySearchTree(){
    }

    public class Node{
        int height,value;
        private Node right,left;

        public Node(int value){
            this.value=value;
        }
        public int getValue(){
            return value;
        }
    }

    private Node root;

    public boolean isEmpty(){

        return root==null;
    }
    public int height(Node node){

        return node==null? -1:node.height;
    }
    public void display(){

        display(root,"Root Node : ");
    }
    public void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.getValue());
        display(node.left,"Left child of "+node.getValue()+" is : ");
        display(node.right,"Right child of "+node.getValue()+" is : ");
    }
    public void populate(int[] nums){
        for(int i=0;i<nums.length;i++){
            insert(nums[i]);
        }
    }
    public void pupulateSorted(int[] nums){
        populateSorted(nums,0,nums.length);
    }
    private void populateSorted(int[] nums,int start,int end){
        if(start>=end){
            return;
        }
        int mid=(end+start)/2;
        insert(nums[mid]);
        populateSorted(nums,start,mid);
        populateSorted(nums,mid+1,end);
    }
    public void insert(int value){
       root=insert(value,root);
    }
    private Node insert(int value,Node node){
        if(node==null){
            node=new Node(value);
            return node;
        }
        if(value<node.value){
            node.left=insert(value,node.left);
        }
        if(value>node.value){
            node.right=insert(value,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }

    //Traversals
    //preOder
    public void preOrder(){

        preOrder(root);
    }
    private void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.value+" -> ");
        preOrder(node.left);
        preOrder(node.right);
    }
    //InOrder
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+" -> ");
        inOrder(node.right);
    }

    //PostOrder
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" -> ");
    }
}


class MainsBST{
    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        int[] nums={5,2,7,1,4,6,9,8,3,10};
        int[] nums1={1,2,3,4,5,6,7,8,9,10};
        bst.pupulateSorted(nums);
        bst.display();
        System.out.println(bst.balanced());


    }
//        public static void main(String[] args) {
//                //Traversals
//            BinarySearchTree bst=new BinarySearchTree();
//            int[] nums={5,2,7,1,4,6,9,8,3,10};
//            bst.populate(nums);
//            bst.display();

//            bst.preOrder();
//            System.out.println(" ");
//            bst.inOrder();
//            System.out.println(" ");
//            bst.postOrder();
//        }
}

/*
PreOrder --->  N->L->R
inOrder  --->  L->N->R
postOrder -->  L->R->N
Balanced binary tree  ->  height difference between left subtree and right subtree  is -1,0,1
 */