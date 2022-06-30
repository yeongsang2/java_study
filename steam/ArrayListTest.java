package steam;


import javax.swing.plaf.SliderUI;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {
    public static void main(String[] args){
        List<String> sList = new ArrayList<String>();
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");

        Stream<String> stream = sList.stream();
        stream.forEach(s->System.out.println(s+ " ")); //foreach 자료 소모
        System.out.println();

        //stream.forEach(s->System.out.println(s)); //실행 안됨
        sList.stream().sorted().forEach(s->System.out.println(s));

    }
}
