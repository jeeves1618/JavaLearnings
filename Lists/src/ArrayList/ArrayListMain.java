package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record Book(int bookId, String bookTitle, String bookGenre, String authorFirstName, String authorLastName, String publisherName, double costOfPurchase){
    Book(int bookId, String bookTitle, String bookGenre, String authorFirstName, String authorLastName, String publisherName, double costOfPurchase) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookGenre = bookGenre;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.publisherName = publisherName;
        this.costOfPurchase = costOfPurchase;
    }
}
public class ArrayListMain {
    public static void main(String[] args) {

        /*
        Below declaration can hold all type of Objects.
        The compiler will not type check what type of objects are added.
         */
        ArrayList rawObjectList = new ArrayList();

        rawObjectList.add(new Book(1, "Shell Scripting", "Technology","Jason","Cannon","Amazon",231.0));
        rawObjectList.add("No gatekeeping for type, I can add anything I want");
        System.out.println(rawObjectList); /* This is result in
        [Book[bookId=1, bookTitle=Shell Scripting, bookGenre=Technology, authorFirstName=Jason, authorLastName=Cannon, publisherName=Amazon, costOfPurchase=231.0], No gatekeeping for type, I can add anything I want]
        */
        System.out.println("---------------------------------------------------------");
        /*
        Now let us make this array list type safe by passing the class as parameter
         */

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "Shell Scripting", "Technology","Jason","Cannon","Amazon",231.0));
        books.add(new Book(2, "In Search Of Schrodinger's Cat", "Popular Science","John","Gribbin","Black Swan",310.0));
        //books.add("No gatekeeping for type, I can add anything I want"); This statement will fail the compilation.

        //Providing an index will add the object to the specified index
        books.add(0, new Book(3, "Godel, Escher, Bach", "Popular Science","Douglas R","Hofstadter","Basic Books",779.0));
        System.out.println(books);
        System.out.println("---------------------------------------------------------");
        books.remove(0);
        System.out.println(books);
        System.out.println("---------------------------------------------------------");

        String[] team83 = { "Kapil Dev",
                "Mohinder Amarnath",
                "Kirti Azad",
                "Roger Binny",
                "Sunil Gavaskar",
                "Syed Kirmani",
                "Madan Lal",
                "Sandip Patil",
                "Balwinder Sandhu",
                "Yashpal Sharma",
                "Ravi Shastri",
                "Krishnamachari Srikkanth",
                "Sunil Valson",
                "Dilip Vengsarkar"};
        List<String> list = List.of(team83);
        System.out.println(books.getClass().getName() + " , " + list.getClass().getName());
        //list.add("Sachin Tendulkar");
        /*
        java.util.ArrayList , java.util.ImmutableCollections$ListN
        As you can see from the output of above, list is immutable. That is, list.add("Sachin Tendulkar"); will result in run time failure.

        We can make this immutable list Mutable by passing it to an ArrayList as below.
         */

        ArrayList<String> legends = new ArrayList<>(list);
        legends.add("Sachin Tendulkar");
        System.out.println("---------------------------------------------------------");
        System.out.println(legends);

        ArrayList<String> captain = new ArrayList<>(List.of(team83[0]));
        System.out.println("---------------------------------------------------------");
        System.out.println(captain);

        ArrayList<String> fewMoreLegends = new ArrayList<>(List.of("Rahul Dravid","Saurav Ganguly","Virat Kohli"));
        legends.addAll(fewMoreLegends);
        System.out.println("---------------------------------------------------------");
        System.out.println(legends);

        //We can do index read using get method
        System.out.println(legends.get(12));
        //contains will not work on partial values
        System.out.println(legends.contains("Sachin"));//returns false
        System.out.println(legends.contains("Sachin Tendulkar"));//returns true
        System.out.println(legends.indexOf("Sachin Tendulkar"));//returns 14
        legends.add("Sachin Tendulkar");
        System.out.println(legends.indexOf("Sachin Tendulkar"));//returns 14
        System.out.println(legends.lastIndexOf("Sachin Tendulkar"));//returns 18
        System.out.println(legends.removeAll((List.of("Rahul Dravid","Saurav Ganguly","Virat Kohli"))));
        System.out.println(legends);
        System.out.println(legends.retainAll((List.of("Kapil Dev",
                "Mohinder Amarnath",
                "Kirti Azad"))));
        System.out.println(legends);
        legends.clear();
        System.out.println(legends);

        legends.addAll(List.of(team83));
        //Another way of writing List.of - Arrays.asList
        legends.addAll(Arrays.asList("Rahul Dravid","Saurav Ganguly","Virat Kohli"));
        legends.sort(Comparator.naturalOrder());
        System.out.println(legends);
        legends.sort(Comparator.reverseOrder());
        System.out.println(legends);

        //To convert a list into an array, use toArray method.

        //ArrayList doesn't support primitive type. List<int> listOfNumbers = new ArrayList<>(); won't work.
        List<Integer> listOfNumbers = new ArrayList<>(); //This will work.
    }
}
