package AbstractionDemo;

public class Son extends Parent{
    @Override
    void Intro(String name){
        System.out.println("The Son name is "+name);
    }
    @Override
    void Intro(String name,int age){
        System.out.println("The Son name is "+name +" and his age is "+age);
    }
    void career(){
        System.out.println("I want to be a coder");
    }
}
