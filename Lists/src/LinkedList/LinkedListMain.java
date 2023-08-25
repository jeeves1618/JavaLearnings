package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

    public static void main(String[] args) {
        /*
        A link list can be created in two ways.
        Either using LinkedList class or using var

        When using var, we can't leave the diamond operator as empty.
         */

        LinkedList<String> booksToRead = new LinkedList<>();
        var booksAlreadyRead = new LinkedList<String>();

        //Generic Add Methods
        booksToRead.add("The Big Short");
        booksToRead.add(0,"Madras Miscellany");
        System.out.println(booksToRead);
        System.out.println("---------------------------------------------------------");

        //These two methods are not in array list
        booksToRead.addFirst("South Vs North");
        booksToRead.addLast("How Innovation Works");

        System.out.println(booksToRead);
        System.out.println("---------------------------------------------------------");

        String[] bookArray = {"The Rub of Time","Languages of Truth","Fury"};
        booksToRead.addAll(List.of(bookArray));
        //Queue methods
        booksToRead.offer("Desire and Pursuit");
        booksToRead.offerFirst("River out of Eden");
        booksToRead.offerLast("Liar's poker");

        System.out.println(booksToRead);
        System.out.println("---------------------------------------------------------");

        //Stack methods
        booksToRead.push("Digital Gold");
        System.out.println(booksToRead);
        System.out.println("---------------------------------------------------------");

        //Retrieval Methods
        System.out.println("booksToRead.get(1) will give : " + booksToRead.get(1));
        System.out.println("booksToRead.getFirst() will give : " + booksToRead.getFirst());
        System.out.println("booksToRead.getLast() will give : " + booksToRead.getLast());
        System.out.println("booksToRead.indexOf(\"The Rub of Time\") will give : " + booksToRead.indexOf("The Rub of Time"));
        System.out.println("---------------------------------------------------------");
        System.out.println(booksToRead);
        //Queue Retrieval Methods
        System.out.println("booksToRead.element() will give : " + booksToRead.element());
        //Stack Retrieval Methods
        System.out.println("booksToRead.peek() will give : " + booksToRead.peek());
        System.out.println("booksToRead.peekFirst() will give : " + booksToRead.peekFirst());
        System.out.println("booksToRead.peekLast() will give : " + booksToRead.peekLast());
        //Generic Remove Methods
        booksToRead.remove(1);
        booksToRead.remove("How Innovation Works");
        booksToRead.remove();//Removes the first element
        System.out.println(booksToRead);
        System.out.println("---------------------------------------------------------");

        booksToRead.removeFirst();
        booksToRead.removeLast();
        System.out.println(booksToRead);
        System.out.println("---------------------------------------------------------");

        //Dequeue Methods
        booksToRead.poll();//Removes the first element
        booksToRead.pollFirst();//Removes the first element
        booksToRead.pollLast();//Removes the last element

        System.out.println(booksToRead);
        System.out.println("---------------------------------------------------------");

        booksToRead.pop();
        System.out.println(booksToRead);//Removes the first element
        System.out.println("---------------------------------------------------------");
    }
}
