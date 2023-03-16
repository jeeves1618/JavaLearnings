public class Main {

    public static void main(String[] args) {
        Movie movie = new Movie("Matrix");
        movie.watchMovie();

        Movie movie1 = new Adventure("The Boring Movie");
        movie1.watchMovie();

        Movie movie2 = new Comedy("The Laughing Movie");
        movie2.watchMovie();
    }
}
