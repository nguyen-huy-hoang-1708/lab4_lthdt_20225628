package hust.soict.dsai.aims;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Tạo danh sách Media
        ArrayList<Media> mediaList = new ArrayList<>();

        // Thêm các đối tượng Media vào danh sách
        Book book = new Book(1, "Effective Java", "Programming", 45.5f);
        book.addAuthor("Joshua Bloch");

        DigitalVideoDisc dvd = new DigitalVideoDisc(2, "Inception", "Sci-Fi", 20.0f, 148, "Christopher Nolan");

        CompactDisc cd = new CompactDisc(3, "Abbey Road", "Music", 15.0f, 47, "George Martin", "The Beatles");

        mediaList.add(book);
        mediaList.add(dvd);
        mediaList.add(cd);

        // Lặp qua danh sách và in thông tin của từng Media
        for (Media media : mediaList) {
            System.out.println(media.toString());
        }
    }
}
