public class Book {

    private String name;
    private String author;
    private int categoryNumber;


    public Book(String name, String author, int categoryNumber){
        this.name = name;
        this.author = author;
        this.categoryNumber =  categoryNumber;

    }

    public Book(Book other){
        this.name = other.name;
        this.author = other.author;
        this.categoryNumber =  other.categoryNumber;
    }

    public String toString(){

        return ("name: " + name + "\nauthor: " + author + "\ncategory number: " + categoryNumber);

    }


    public String getName(){return name;}
    public String getAuthor(){return author;}
    public int getCategoryNumber(){return categoryNumber;}

    public void setName(String name){
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategoryNumber(int categoryNumber) {
        this.categoryNumber = categoryNumber;
    }

    public boolean isSameCategory(Book other){

        if (this.categoryNumber == other.getCategoryNumber())
            return true;
        else
            return false;
    }
}
