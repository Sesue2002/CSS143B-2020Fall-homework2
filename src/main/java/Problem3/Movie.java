package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        this.id = UUID.randomUUID();
        // homework
        this.rating = rating;
        this.title = title;
    }

    //copy constructor
    public Movie(Movie anotherMovie) {
        // homework
        rating = anotherMovie.rating;
        title = anotherMovie.title;
        id = anotherMovie.id;
    }

    //This override I saw was from https://www.infoworld.com/article/3305792/comparing-java-objects-with-equals-and-hashcode.html
    //The way they implemented made sense in this case because we are seeing if
    //The contents of one object equals another object. Also it uses the the parameter of
    //If it uses another object from a different class and comparing it to this class.
    @Override
    public boolean equals(Object obj) {
        // homework
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Movie m1 = (Movie) obj;
        return rating.equals(m1.rating) && title.equals(m1.title) && id == m1.id;
    }
}
