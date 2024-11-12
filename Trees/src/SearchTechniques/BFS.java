package SearchTechniques;
import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public void main(String[] args) {
       TreeNode root=new TreeNode(10);
        List<List<Integer>> list=levelOrder(root);
        System.out.println();
    }
    private static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> list=new ArrayList<>();

        if(root==null) return list;

        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize=queue.size();
            List<Integer> currentList=new ArrayList<>(levelSize);
            for(int i=0;i<levelSize;i++){
               TreeNode current=queue.poll();
               currentList.add(current.val);
               if(current.left!=null){
                   queue.offer(current.left);
               }
               if(current.right!=null){
                   queue.offer(current.right);
               }
            }
            list.add(currentList);
        }

        return list;
    }

    private static TreeNode LevelOrderSuccessor(TreeNode root,int key){
        if(root==null){
            return null;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode current=queue.poll();
            if(current.left!=null) queue.offer(current.left);
            if(current.right!=null) queue.offer(current.right);

            if(current.val==key){
                break;
            }
        }

        return queue.peek();
    }
}
