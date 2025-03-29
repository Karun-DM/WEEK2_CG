class book{
    String title;
    int publicationYear;
    book(String title,int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }
    public void displaydetails(){
        System.out.println("title "+title);
        System.out.println("year "+publicationYear);
    }

}
class author extends book{
    String name;
    String bio;
    public author(String title,int publicationYear,String name,String bio){
        super(title,publicationYear);
        this.name=name;
        this.bio=bio;
    }
    public void displaydetails(){
        super.displaydetails();
        System.out.println("name "+name);
        System.out.println("bio "+bio);
    }
}
public class libra{
    public static void main(String[] args) {
        book obj=new author("sherlock",1800,"doyle","goat");
        obj.displaydetails();
    }
}