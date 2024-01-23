// 1) Base Class - MediaItem :
// - Create a base class named MediaItem with the following attributes:
//        - title (string)
//        - duration (integer - in minutes)
//        - media_type (string, e.g., "Book," "Movie," "Music")
// - Implement a constructor to initialize these attributes.
// - Include a method named display_info that prints out the basic information about the media item (title, duration, and media type).
// 2) Derived Classes :
// - Create three derived classes: Book, Movie, and MusicAlbum.
//      - Each derived class should inherit from the MediaItem class.
//      - Include additional attributes specific to each type (e.g., author for Book, director for Movie, artist for MusicAlbum).
//      - Implement constructors for each derived class to initialize their unique attributes.
// 3) Method Overriding :
// - Override the display_info method in each derived class to display additional information relevant to that specific media type. For example, a Book might display the author, a Movie might display the director, and a MusicAlbum might display the artist.
// 4) Main class
// - Write a program that creates instances of each media type (Book, Movie, MusicAlbum).
// - Demonstrate the use of the display_info method for each instance to showcase the overridden behavior.

public class App {
    public static class MediaItem {
        String title, media_type;
        int duration;

        public MediaItem(String title, String media_type, int duration) {
            this.title = title;
            this.media_type = media_type;
            this.duration = duration;
        }

        public void display_info() {
            System.out.println("Title is " + title);
            System.out.println("Duration in minutes " + duration);
            System.out.println("Media type is " + media_type);
        }
    }

    public static class Book extends MediaItem {
        String Author;

        public Book(String title, String media_type, String Author, int duration) {
            super(title, media_type, duration);
            this.Author = Author;
        }

        public void display_info() {
            super.display_info();
            System.out.println("Author is " + Author);
        }
    }

    public static class Movie extends MediaItem {
        String director;

        public Movie(String title, String media_type, String dir, int duration) {
            super(title, media_type, duration);
            this.director = dir;
        }

        public void display_info() {
            super.display_info();
            System.out.println("Director is " + director);
        }
    }

    public static class MusicAlbum extends MediaItem {
        String Artist;

        public MusicAlbum(String title, String media_type, String Artist, int duration) {
            super(title, media_type, duration);
            this.Artist = Artist;
        }

        public void display_info() {
            super.display_info();
            System.out.println("Artist is " + Artist);
        }
    }

    public static void main(String[] args) {
        MediaItem item = new Book("Harry Potter", "Book", "J.K.Rowling", 0);
        System.out.println("\n");
        item.display_info();

        Movie movie = new Movie("Animal", "Movie", "Sandeep Reddy Vanga", 180);
        System.out.println("\n");
        movie.display_info();

        MusicAlbum alubm = new MusicAlbum("Pehle bhi main", "Music", "Vishal Mishra", 4);
        System.out.println("\n");
        alubm.display_info();

    }
}