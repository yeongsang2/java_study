package steam.serialization;

import java.io.*;

class Person implements Serializable{
    private static final long serialVersionUID = -150325402544036183L;
    String name;
    transient String job;

    public Person(){}
    public Person(String name, String job){
        this.name =name;
        this.job = job;
    }
    @Override
    public String toString(){
        return name + "," + job;
    }
}

public class SerializationTest {
    public static void main(String[] args) throws ClassNotFoundException{
        Person person1 = new Person("안재용", "대펴이사");
        Person person2 = new Person("김철수" , "쌍무이사");

        try(FileOutputStream fos = new FileOutputStream("serial.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
                oos.writeObject(person1);
                oos.writeObject(person2);
            } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
