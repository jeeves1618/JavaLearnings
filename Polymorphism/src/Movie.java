public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(this.title + " is a " + instanceType + " flim.");
    }
}

class Adventure extends Movie{

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),"A thrilling chase through a raging river", "The plot thickens further", "Something unusual happens to an otherwise boring character");
    }
}
