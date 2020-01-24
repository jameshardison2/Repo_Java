package Classwork.ClassConceptPkg;

public class MyMainClass {

    public static void main(String[] args) {

        //ClassName objName = new ClassName();
        //int num = 10;

        MyClass m1 = new MyClass(); // m1 is an object- or- variable of MyClass
         String name = "James";

        System.out.println(m1.getA());//use the object m1 to get the value of a

        m1.setA(1);

        MyClass m2 = new MyClass();

        System.out.println(m1.getA());//1
        System.out.println(m1.a); //1

        System.out.println(m2.getA());//1
        System.out.println(m2.a); //1



    }


}
