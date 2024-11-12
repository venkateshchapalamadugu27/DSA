package Maze;
/*
Maze problem, Pathway from one place to another place in a matrix .
i  . count of paths
ii . printing the paths seperately
iii. returning the list of the paths
iv . path with obstacles
v  . All directions
vi . BackTracking
 */
import java.util.ArrayList;
import java.util.*;
//import static com.sun.tools.classfile.Module_attribute.RequiresEntry.length;

public class MatrixDownRight {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//       path("",3,3);
         boolean[][] maze={
            {true,true,true},
            {false,true,true},
            {true,true,true}
        };
//        pathListRestriction("", maze, 0,0);
        int count=pathListRestriction("", maze, 0,0,0);
        System.out.println(count);
//        System.out.println(pathList("",3,3));
    }
    static int count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int down=count(r-1,c);
        int right=count(r,c-1);

        return down+right;
    }

    static void path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
           path(p+'D',r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }

    }

    public static ArrayList<String> pathList(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(r>1){
           list.addAll(pathList(p+'D',r-1,c));
        }
        if(c>1){
            list.addAll(pathList(p+'R',r,c-1));
        }
        return list;
    }

    public static void pathListRestriction(String p,boolean[][] maze,int r, int c){
        if(r==maze.length-1  && c==maze[0].length-1){
            System.out.println(p);
            return ;
        }
        if(maze[r][c]==false){
            return ;
        }

        if(r< maze.length-1){
            pathListRestriction(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            pathListRestriction(p+'R',maze,r,c+1);
        }
    }

    public static int pathListRestriction(String p, boolean[][] maze, int r, int c, int count) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return count + 1; // Increase count as a valid path is found
        }

        if (!maze[r][c]) {
            return count; // If the current cell is blocked, return the current count
        }

        int originalCount = count; // Store the original count before any recursion

        if (r < maze.length - 1) {
            count = pathListRestriction(p + 'D', maze, r + 1, c, count); // Move Down
        }

        if (c < maze[0].length - 1) {
            count = pathListRestriction(p + 'R', maze, r, c + 1, count); // Move Right
        }

        return count; // Return the accumulated count
    }

}
