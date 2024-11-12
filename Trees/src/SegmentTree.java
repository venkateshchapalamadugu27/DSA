public class SegmentTree {
    private static class Node{
        int data;
        int startIndex;
        int endIndex;

        Node left;
        Node right;

        public Node(int startIndex,int endIndex){
            this.startIndex=startIndex;
            this.endIndex=endIndex;
        }
    }
    Node root;
    public SegmentTree(int[] arr){
          this.root= constructTree(arr,0,arr.length-1) ;
    }
    public Node constructTree(int[] arr,int start,int end){
        if(start==end){
            //we are at the leaf node
            Node leaf=new Node(start,end);
            leaf.data=arr[start];
            return leaf;
        }

        Node node=new Node(start,end);

        int mid=start+(end-start)/2;

        node.left=constructTree(arr,start,mid);
        node.right=constructTree(arr,mid+1,end);

        node.data=node.left.data+node.right.data;
        return node;
    }

    public void display(){
        display(this.root);
    }
    private void display(Node node){
        String str="";

        if(node.left!=null){
            str=str+"Interval = ["+node.left.startIndex+" - "+node.left.endIndex+"] and data : "+ node.left.data + " => ";
        }else{
            str=str+" No left child =>";
        }

        str=str+"Interval = ["+ node.startIndex+ " - "+node.endIndex+"] and data : "+ node.data + " <= ";

        if(node.right!=null){
            str=str+"Interval = ["+ node.right.startIndex+ " - "+ node.right.endIndex +"] and data : "+ node.data;
        }
        else{
            str=str+"No Right child";
        }
        System.out.println(str+"\n");
        if(node.left!=null){
            display(node.left);
        }
        if(node.right!=null){
            display(node.right);
        }
    }

    //Querying

    public int query(int qsi,int qei){
        //qsi => query start index ,  qei => query end index
        return this.query(this.root,qsi,qei);
    }
    private int query(Node node,int qsi,int qei){
        if(node==null) return 0;
        if(node.startIndex>=qsi && node.endIndex<=qei){
            //completely lies inside
            return node.data;
        }else if(node.startIndex>qei && node.endIndex<qsi){
            //completely lies outside
            return 0;
        }else{
            //overlapping
            return this.query(node.left,qsi,qei)+this.query(node.right,qsi,qei);
        }
    }
    public void update(int index,int value){
        this.root.data=update(this.root,index,value);
    }
    private int update(Node node,int index,int value){
        if(index>=node.startIndex && index<= node.endIndex){
            if(index==node.startIndex && index==node.endIndex){
                node.data=value;
                return node.data;
            }else{
                int leftAns=update(node.left,index,value);
                int rightAns=update(node.right,index,value);
                node.data=leftAns+rightAns;
                return node.data;
            }
        }
        return node.data;
    }
}

class SegmentTreeMain{
    public static void main(String[] args){
        int[] arr={3,8,7,6,-2,-8,4,9};
        SegmentTree tree=new SegmentTree(arr);
//        tree.display();
        System.out.println(tree.query(4,5));
    }


}
