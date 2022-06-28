package generic;

public class Plastic extends Material{

    @Override
    public  void doPrinting(){
        System.out.println("platic재료 출력");
    }
    public String toString(){
        return "재료는 plastic";
    }
}
