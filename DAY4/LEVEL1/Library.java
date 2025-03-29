class book{
    static String NameLibrary="IST";

    String title;
    String author;
    final int isbn;
    public book(String title,String author,int isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    public void displayDetails(){
        System.out.println("title "+title);
        System.out.println("author "+author);
        System.out.println("isbn "+isbn);
    }

    public static void LibName(){
        System.out.println("NameLibrary "+NameLibrary);
    }
}

public class Library{
    public static void main(String[] args) {
        book obj = new book("sherlock holmes", "doyle", 12345);
         
        System.out.println();
        book.LibName();
        System.out.println();
        obj.displayDetails();
        
        
    }
}