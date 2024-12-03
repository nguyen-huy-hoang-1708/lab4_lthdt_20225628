
package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;
import java.util.Collections;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.add(media);
        }
    }

    public void removeMedia(Media media) {
        itemsOrdered.remove(media);
    }

    public float totalCost() {
        return (float) itemsOrdered.stream().mapToDouble(Media::getCost).sum();
    }

    public void print() {
        for (Media media : itemsOrdered) {
            System.out.println(media.toString());
        }
    }
    //Phương thức sắp xếp theo giá và tiêu đề
    /* public void sortByCostTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE); 
    } */
    // Phương thức sắp xếp theo tiêu đề và giá
    /* public void sortByTitleCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }  */
}
