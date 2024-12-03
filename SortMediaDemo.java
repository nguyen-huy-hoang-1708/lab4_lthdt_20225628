package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.CompactDisc;

public class SortMediaDemo {
    public static void main(String[] args) {
        Cart cart = new Cart();

        // Thêm các Media vào giỏ hàng
        cart.addMedia(new Book(1, "Effective Java", "Programming", 45.5f));
        cart.addMedia(new DigitalVideoDisc(2, "Inception", "Sci-Fi", 20.0f, 148, "Christopher Nolan"));
        cart.addMedia(new CompactDisc(3, "Abbey Road", "Music", 15.0f, 47, "George Martin", "The Beatles"));
        cart.addMedia(new Book(4, "Effective Java", "Programming", 50.0f));

        // Sắp xếp theo tiêu đề, sau đó là giá
        /* System.out.println("Sort by Title then Cost:");
        cart.sortByTitleCost();
        cart.print(); */

        // Sắp xếp theo giá, sau đó là tiêu đề
       /* System.out.println("\nSort by Cost then Title:");
        cart.sortByCostTitle();
        cart.print(); */
    }
}
