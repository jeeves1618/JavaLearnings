import java.util.Scanner;

public class InteractiveMain {
    //THis is the BEAUTY of polymorphism at its best.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.printf("%s%n".repeat(Movie.addGenre().size()),Movie.addGenre().toArray());
            String type = scanner.nextLine();
            if ("Qq".contains(type)){
                break;
            }
            System.out.println("Enter the title of the movie : ");
            String title = scanner.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();
        }
    }
}
