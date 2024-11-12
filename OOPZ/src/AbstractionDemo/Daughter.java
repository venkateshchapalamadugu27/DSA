package AbstractionDemo;

public class Daughter extends Parent{
    @Override
    void Intro(String name){
        System.out.println("The Daughter name is "+name);
    }
    @Override
    void Intro(String name,int age){
        System.out.println("The Daughter name is "+name +" and her age is "+age);
    }
    void career(){
        System.out.println("I want to be a Teacher");
    }
}
