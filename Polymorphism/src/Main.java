public class Main {

    public static void main(String[] args) {
        Movie movie = new Adventure("Matrix");
        movie.watchMovie();

        Movie movie1 = new Adventure("The Boring Movie");
        movie1.watchMovie();

        Movie movie2 = new Comedy("The Laughing Movie");
        movie2.watchMovie();

        Movie movie3 = Movie.getMovie("Adventure", "Lord of the Rings");
        movie3.watchMovie();

        Movie movie4 = Movie.getMovie("Romance", "Pride and Prejudice");
        movie4.watchMovie();

        Movie movie5 = Movie.getMovie("Comedy", "Pink Panther");
        movie5.watchMovie();
    }
}
