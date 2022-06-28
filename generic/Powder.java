package generic;

public class Powder extends Material{


    @Override
    public void doPrinting(){
        System.out.println("powder재료출력");
    }

    public String toString(){
        return "재료는 Powder 입니다";
    }
}

