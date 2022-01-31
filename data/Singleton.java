package anirudh.assignment.data;

public class Singleton {
    String str;
    public static Object show(String stringVariable){
        str = stringVariable;
        Singleton obj= new Singleton();
        return obj;
    }
    public void display(){
        System.out.println(str);//non static variable cannot be referenced from a static context
    }
}
