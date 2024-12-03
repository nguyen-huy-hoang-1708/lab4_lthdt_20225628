package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc {
	public DigitalVideoDisc(int id, String title, String category, float cost, int length, 
			String director) {
        super(id, title, category, cost, length, director);
    }

    public void play() {
        if (getLength() > 0) {
            System.out.println("Playing DVD: " + getTitle());
            System.out.println("DVD length: " + getLength());
        } else {
            System.out.println("DVD cannot be played.");
        }
    }
}
