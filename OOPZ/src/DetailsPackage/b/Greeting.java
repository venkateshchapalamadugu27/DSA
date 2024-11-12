package DetailsPackage.b;

import StaticExample.Human;

import static DetailsPackage.b.Message.message;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("hello venkie from packae b ");
        message();
        Human venkie=new Human(21,"venkie",10000,false);
        Human venkat=new Human(21,"venkie",20000,false);
       System.out.println(Human.population);

    }
}
