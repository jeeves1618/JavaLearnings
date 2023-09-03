package CollectionsOverview;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class Collections {

    public static void main(String[] args) {

        Collection<String> myAuthorList = new LinkedList<>();
        String[] authors = {"Richard Dawkins", "Robert Caro", "V.S.Naipaul", "Robert Fisk", "Ayn Rand"};
        myAuthorList.addAll(Arrays.asList(authors));
        System.out.println(myAuthorList);
        //Since we used Collection as the type for myAuthorList, we can use only the functions
        //from Collection interface. There are addional functions in LinkedList implementation
        //For instance myAuthorList.sort() will not work
    }
}
