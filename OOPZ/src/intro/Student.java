package intro;

public class Student {
    int roll;
    String name;
    float marks;

    Student(){
        this.roll=23;
        this.name="venkie";
        this.marks=40f;
    }
    Student(Student other){
        this.name=other.name;
        this.roll=other.roll;
        this.marks= other.marks;
    }
    Student(int roll,String name,float marks){
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }
//    void greeting(){
//        System.out.println("Hello "+name);
//    }
//    void changeGame(String newName){
//        name=newName;
//    }

    public static void main(String[] args) {
        Student venki=new Student(23,"venkie",99f);
        System.out.println(venki.name+" "+venki.roll+" "+venki.marks);
    }
}

