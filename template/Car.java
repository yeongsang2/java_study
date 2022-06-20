package template;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public void startCar(){
        System.out.println("시동을킴");
    }
    public void turnOff(){
        System.out.println("시동껌");
    }

    final public void run(){//template method 하위 클래스에서 재정의 불가능
        startCar();
        drive();
        stop();
        turnOff();
    }

}
