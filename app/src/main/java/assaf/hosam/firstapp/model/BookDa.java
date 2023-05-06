package assaf.hosam.firstapp.model;

import java.util.ArrayList;
import java.util.List;

public class BookDa {
    private ArrayList<Book> Books;
    public BookDa(){
        Books=new ArrayList<>();
        Books.add(new Book("begining MYsql","programing",99));
        Books.add(new Book("java","programing",105));


    }
    public ArrayList<Book>getBookByType(String type){
        List<Book> result=new ArrayList<Book>();
        for(Book b :Books){
            if(b.getType().equals(type)){
                result.add(b);
            }
        }
        return (ArrayList<Book>) result;
    }
}
