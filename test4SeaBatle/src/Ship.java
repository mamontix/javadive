import java.util.Random;

/**
 * Created by oi07 on 20.04.2017.
 */
public class Ship {
    int positionX;
    int positionY;
    boolean isVertical;
    int size;

    public Ship(int positionX, int positionY, boolean isVertical, int size) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.isVertical = isVertical;
        this.size = size;
    }

    public Ship(int fieldSize) {
        Random random = new Random();
        size = 1 + random.nextInt(3);
        isVertical = random.nextBoolean();
        positionX = 1 + random.nextInt(fieldSize-1);
        positionY = 1 + random.nextInt(fieldSize-1);
    }
}
