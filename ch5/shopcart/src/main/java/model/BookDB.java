package model;

import java.util.Arrays;
import java.util.List;

public class BookDB {
    public static List<Book> ALL_BOOKS = Arrays.asList(
            new Book("1",
                    "You don't just pass the new J2EE 1.5 SCWCD exam, you'll understand this stuff and put it to work immediately.",
                    "Servlets and JSP", 49.9),
            new Book("2",
                    "Thinking in Java has earned raves from programmers worldwide for its extraordinary clarity, careful organization, and small, direct programming examples.",
                    "Thinking in Java", 20.0),
            new Book("3",
                    " It examines how a number of seemingly insignificant events in 1587 might have caused the downfall of the Ming dynasty.",
                    "1587, a Year of No Significance", 74.9));
    // note: it has a bug!
    // If `id` is not found, there will be an exception.
    public static Book getBookByID(String id) {
        return ALL_BOOKS.stream().filter(book -> book.getId().equals(id)).findFirst().get();
    }
}
