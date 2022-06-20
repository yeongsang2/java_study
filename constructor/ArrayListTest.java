package constructor;


import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String args[]){
        ArrayList<Book> library = new ArrayList<Book>();
        library.add(new Book("태백산택","조정래"));
        library.add(new Book("데미안","헤르만"));
        library.add(new Book("토지","박경리"));

        for(int i=0; i < library.size(); i++){
            Book book = library.get(i);
            book.showBookInfo();
        }

        System.out.println();

        for(Book book : library){
            book.showBookInfo();
        }
    }
}
