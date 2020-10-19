package Problem3;

import java.util.UUID;

public abstract class Book implements StoreMediaOperations {
    UUID id;
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = UUID.randomUUID();
    }

    // copy constructor
    public Book(Book anotherBook) {
        title = anotherBook.title;
        author = anotherBook.author;
        id = anotherBook.id;
    }

    //This override I saw was from https://www.infoworld.com/article/3305792/comparing-java-objects-with-equals-and-hashcode.html
    //The way they implemented made sense in this case because we are seeing if
    //The contents of one object equals another object. Also it uses the the parameter of
    //If it uses another object from a different class and comparing it to this class.
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Book b1 = (Book) obj;
        return title.equals(b1.title) && author.equals(b1.author) && id == b1.id;
    }
}
