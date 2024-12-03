package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Store {
    // Thay đổi mảng itemsInStore[] thành ArrayList<Media>
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    // Phương thức thêm Media vào store
    public void addMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            itemsInStore.add(media);
        }
    }

    // Phương thức xóa Media khỏi store
    public void removeMedia(Media media) {
        itemsInStore.remove(media);
    }

    // In ra tất cả các Media trong store
    public void print() {
        System.out.println("Items in Store:");
        for (Media media : itemsInStore) {
            System.out.println(media.toString());
        }
    }

    // Tìm Media trong Store theo title (ví dụ)
    public Media searchByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;  // Nếu không tìm thấy
    }
}
