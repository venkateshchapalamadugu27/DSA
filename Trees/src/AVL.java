public class AVL {
    public AVL(){
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
    public int height(){

        return root.height;
    }
    public int height(Node node){

        return node==null? -1:node.height;
    }
    public boolean display(){

        display(root,"Root Node : ");
        return false;
    }
    public void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.getValue());
        display(node.left,"Left child of "+node.getValue()+" is : ");
        display(node.right,"Right child of "+node.getValue()+" is : ");
    }
    public void prettyDisplay(){
        prettyDisplay(root,0);
    }
    private void prettyDisplay(Node node, int level){
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
        return rotate(node);
    }

    private Node rotate(Node node){
        if(height(node.left)-height(node.right)>1){//left heavy
            if(height(node.left.left)-height(node.left.right)>0){
                //left-left case ==> only left rotate
                return rightRotate(node);
            }

            if(height(node.left.left)-height(node.left.right)<0){
                //left-right case ==> left and then right
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if(height(node.left)-height(node.right)<-1){
            //right heavy
            if(height(node.right.left)-height(node.right.right)<0){
                //right-right case ==> left rotate
                return leftRotate(node);
            }
            if(height(node.right.right)-height(node.right.right)>0){
                //right-left case ==> right and then left
                node.right=rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node leftRotate(Node node){
        Node c=node;
        Node p=c.right ;
        Node t=p.left;

        p.left=c;
        c.right=t;

        p.height=Math.max(height(p.left),height(p.right)+1);
        c.height=Math.max(height(c.left),height(c.right)+1);

        return p;
    }
    private Node rightRotate(Node node){
        Node p=node;
        Node c=node.left;
        Node t=node.left.right;

        c.right=p;
        p.left=t;

        p.height=Math.max(height(p.left),height(p.right)+1);
        c.height=Math.max(height(c.left),height(c.right)+1);
        return c;
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

}


class Solution{
    public static void main(String[] args) {
        AVL tree=new AVL();
        for(int i=0;i<1000;i++){
            tree.insert(i);
        }
//        tree.prettyDisplay();
        System.out.println(tree.balanced());
        System.out.println(tree.height());
    }
}
