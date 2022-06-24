package generic;

public class GenericPrinterTest {
    public static void main(String args[]){
        GenericPrinter<Powder> powderPrinter= new GenericPrinter<Powder>(); //Poweder 형으로 GenericPrinter생성

        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();

        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic =plasticPrinter.getMaterial();
        System.out.println(plasticPrinter);


    }
}
