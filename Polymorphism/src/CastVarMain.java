public class CastVarMain {

    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A","Matrix Reloaded");
        movie.watchMovie();
        //Below code will not work, since experienceAdventure() is not
        //in movie class.
        //movie.experienceAdventure();

        Adventure movieAdventure = (Adventure)movie;
        movieAdventure.experienceAdventure();//This will work now.
    }
}
