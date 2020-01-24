package Practice.ClassConcept;

public class MyMainClass {

    public static void main(String[] args) {

        //Create an object
        //Classname objectName = new ClassName();

        MyClass m1 = new MyClass();

        System.out.println(m1.getA());

        m1.setA(200);
        System.out.println(m1.getA());

    }


}
