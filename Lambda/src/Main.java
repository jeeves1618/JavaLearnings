public class Main {

    record Book(String title, String authorName){
        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", authorName='" + authorName + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");


    }
}