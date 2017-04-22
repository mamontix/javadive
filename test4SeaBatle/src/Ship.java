import java.util.Random;

/**
 * Created by oi07 on 20.04.2017.
 */
public class Ship {
    int position;
    boolean isVertical;
    int size;

    public Ship(int position, boolean isVertical, int size) {
        this.position = position;
        this.isVertical = isVertical;
        this.size = size;
    }

    public Ship() {
        Random random = new Random();
        size = 1 + random.nextInt(3);
        isVertical = random.nextBoolean();
        position = 1 + random.nextInt(9);
    }
}
