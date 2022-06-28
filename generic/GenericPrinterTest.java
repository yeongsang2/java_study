package generic;

public class GenericPrinterTest {
    public static void main(String args[]){

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
        powderPrinter.setMaterial(new Powder());
        powderPrinter.toString();

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        plasticPrinter.setMaterial(new Plastic());
        plasticPrinter.toString();
    }
}
