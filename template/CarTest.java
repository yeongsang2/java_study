package template;

public class CarTest {
    public static void main(String args[]){

        System.out.println("자율주행");
        Car myCar = new AiCar();
        myCar.run();

        System.out.println("사람운전차");
        Car hisCar = new ManualCar();
        hisCar.run();
    }
}
