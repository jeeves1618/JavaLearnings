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

        Object movie4 = Movie.getMovie("Romance", "Pride and Prejudice");
        Romance romanceMovie = (Romance)movie4;
        romanceMovie.watchMovie();

        var movie5 = Movie.getMovie("Comedy", "Pink Panther");
        movie5.watchMovie();

        //Different ways of casting.

        Object unknownMovieType = Movie.getMovie("Adventure", "Fast and Fearless");
        //Way 1
        Adventure adventure = (Adventure) unknownMovieType;
        adventure.watchMovie();
        //Way 2
        ((Adventure) unknownMovieType).watchMovie();
        //Way 3
        if (unknownMovieType instanceof Adventure adv){
            adv.watchMovie();
        }

        System.out.println("------------------------------- TYPE TESTING -------------------------------");
        Adventure a1 = new Adventure("The Matrix");
        Movie a2 = new Adventure("Jaws");
        Movie a3 = a2;
        Adventure a4 = a1;
        //Adventure a5 = a2; Will not work. Since the compiler doesn't know at compile time whether the reference type a2 corresponds to adventure or not.
        Movie a5 = a1; //This will work. Moving the reference of child to parent will work, but not parent to child
    }
}
