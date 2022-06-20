package template;

public class AiCar extends Car{


    @Override
    public void drive() {
        System.out.println("자율주행차임");
    }

    @Override
    public void stop() {
        System.out.println("알아서 멈춤");
    }
}
