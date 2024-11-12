package ComparingObjects;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student venki=new Student(23,60.0f);
        Student hemu=new Student(1,50.0f);
        Student sanjay=new Student(18,52.0f);
        Student dinesh=new Student(44,45.0f);
        Student sasi=new Student(33,55.0f);

//        if(venki.compareTo(hemu)<0){
//            System.out.println("Hemu is Topper");
//        }
//        else{
//            System.out.println("Venki is Topper");
//
//        }
        Student[] list={venki,hemu,sanjay,dinesh,sasi};
        System.out.println(Arrays.toString(list)) ;
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -(int)(o1.marks-o2.marks);
            }
        });
        System.out.println(Arrays.toString(list));

    }
}
