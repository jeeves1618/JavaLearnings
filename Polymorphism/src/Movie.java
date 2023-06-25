public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(this.title + " is a " + instanceType + " flim.");
    }

    public static Movie getMovie(String type, String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'R' -> new Romance(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie{

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "A thrilling chase through a raging river",
                "The plot thickens further",
                "Something unusual happens to an otherwise boring character");
    }
}

class Comedy extends Movie{

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "A not so smart and not so interesting person",
                "Does something stupid",
                "People around pretend that they are smarter and laugh");
    };
}

class Romance extends Movie{

    public Romance(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "A pretty girl and a pretty boy can't be together",
                "Usually because of the unrealistic imagination of the story writers",
                "Then they either kiss or kill themselves in the end");
    };
}

