package lambda;

public class TestStringConcat {
    public static void main(String[] args){
        String s1 = new String("hello");
        String s2 = new String("world");
        //StringConCatImpl concat1 = new StringConCatImpl();
        //concat1.makeString(s1,s2);
        StringConcat concat = (s,v) -> System.out.println( s + " " + v);
        concat.makeString(s1,s2);

    }
}
