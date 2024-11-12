package intro;

import intro.Student;

public class ClassObjectsIntro {
    public static void main(String[] args) {
        int[] roll=new int[5];
        String[] name=new String[5];
        float[] marks=new float[5];
        Student[] students=new Student[5];


        Student venki=new Student();
//        venki.roll=23;
//       venki.name="venkatesh";
//        venki.marks=40f;
//        System.out.println(venki.roll);
//        System.out.println(venki.name);
//        System.out.println(venki.marks);
//        venki.changeGame("Venkatesh");
//        venki.greeting();

        Student hemanth=new Student(1,"Hemanth",40f);
//        System.out.println(hemanth.roll);
//        System.out.println(hemanth.name);
//        System.out.println(hemanth.marks);

        Student random=new Student(venki);
        System.out.println(random.roll);
        System.out.println(random.name);
        System.out.println(random.marks);
    }
}


