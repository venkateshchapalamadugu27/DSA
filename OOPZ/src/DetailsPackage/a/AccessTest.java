package DetailsPackage.a;

import Access.Access;

public class AccessTest extends Access {
    public AccessTest(int age,String name){
        super(age,name);
    }
    public static void main(String[] args) {
        AccessTest venki=new AccessTest(23,"Venkatesh");
        System.out.println(venki.age);
    }

}
