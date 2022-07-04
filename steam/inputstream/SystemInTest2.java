package steam.inputstream;

public class SystemInTest2 {
    public static void main(String[] args){
        System.out.println("알파벳 여러개 enter");

        int i ;
        try {
            while((i= System.in.read()) != -1){ //enter -> null값
                System.out.print((char)i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
