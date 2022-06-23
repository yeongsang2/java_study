package interfaceex;

public class MyClass implements MyInterface{

    @Override
    public void myMethod() {
        System.out.println("myMethod()");
    }

    @Override
    public void x() {
        System.out.println("y()");
    }

    @Override
    public void y() {
        System.out.println("x()");
    }
}
