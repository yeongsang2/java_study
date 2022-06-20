package template;

public class ManualCar extends Car{


    @Override
    public void drive() {
        System.out.println("사람이운전");
    }

    @Override
    public void stop() {
        System.out.println("브레이크로 정지");
    }
}
