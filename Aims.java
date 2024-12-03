package hust.soict.dsai.aims;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.media.Media;


public class Aims {
    public static void main(String[] args) {
        // Tạo store
        Store store = new Store();

        // Tạo các Media
        Book book = new Book(1, "Effective Java", "Programming", 45.5f);
        book.addAuthor("Joshua Bloch");

        DigitalVideoDisc dvd = new DigitalVideoDisc(2, "Inception", "Sci-Fi", 20.0f, 148, "Christopher Nolan");

        CompactDisc cd = new CompactDisc(3, "Abbey Road", "Music", 15.0f, 47, "George Martin", "The Beatles");

        // Thêm Media vào store
        store.addMedia(book);
        store.addMedia(dvd);
        store.addMedia(cd);

        // In danh sách Media trong store
        System.out.println("Media in Store:");
        store.print();

        // Tìm kiếm một Media theo title
        Media foundMedia = store.searchByTitle("Inception");
        if (foundMedia != null) {
            System.out.println("\nFound Media: " + foundMedia);
        } else {
            System.out.println("\nMedia not found.");
        }

        // Xóa Media khỏi store
        store.removeMedia(dvd);

        // In lại danh sách sau khi xóa
        System.out.println("\nAfter removing a DVD:");
        store.print();
    }
} 

