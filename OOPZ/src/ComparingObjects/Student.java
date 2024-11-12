package ComparingObjects;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno,float marks) {
        this.marks = marks;
        this.rollno = rollno;
    }


    @Override
    public int compareTo(Student o) {

        return (int)(this.marks-o.marks);
    }

    @Override
    public String toString() {
        return  marks+" ";
    }
}
