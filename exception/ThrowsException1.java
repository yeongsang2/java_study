package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException1 {

    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args){
        ThrowsException1 test = new ThrowsException1();
        try{
            test.loadClass("a.txt", "java.lang.String");
        }catch (FileNotFoundException  | ClassNotFoundException e){
            e.printStackTrace();
        //}catch (ClassNotFoundException e){
          //  e.printStackTrace();
        }catch (Exception e){  //Execption 클래스로 항상 예외처리
            e.printStackTrace();
        }
    }
}
