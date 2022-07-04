package steam.serialization;

import java.io.*;

class Dog implements Externalizable{
    String name;

    public Dog(){
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException{
        out.writeUTF(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException{
        name = in.readUTF();
    }

    @Override
    public String toString(){
        return this.name;
    }


}

public class ExternalizableTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Dog myDog= new Dog();
        myDog.name = "멍멍이";

        FileOutputStream fos = new FileOutputStream("external.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        try(fos; oos){
            oos.writeObject(myDog);
        } catch (Exception e) {
            e.printStackTrace();
        }


        FileInputStream fis = new FileInputStream("external.out");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Dog dog = (Dog)ois.readObject();
        System.out.println(dog);
    }
}
