import java.lang.reflect.Array;

/**
 * Created by oi07 on 20.04.2017.
 */
public class Field {
    //final int SIZE = 10;
    char[][] cells;
    Ship ship;

    void init(int size) {
        cells = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cells[i][j] = '.';

            }

        }
    }

    void setShip(Ship ship){
        cells[ship.position][ship.position] = 'X';
        this.ship = ship;
    }

    void doShoot(Shoot shoot){
        switch (cells[shoot.X][shoot.Y]){
            case '.':
                System.out.println("Промах");
                cells[shoot.X][shoot.Y] = '*';
                break;
            case 'X':
                System.out.println("Корабль подбит!");
                cells[shoot.X][shoot.Y] = '-';
//                System.out.println(cells);
                break;
            case '*':
                System.out.println("Уже стреляли!");
                break;
            default:
                System.out.println("ERROR");
        }
    }

    void show() {
        for (char[] cell : cells) {
            for (char c : cell) {
                System.out.print(c);
            }
            System.out.println();
        }

    }

    boolean isNotGameOver(){
        for (char[] cell : cells) {
            for (char c : cell) {
                if (c=='X')
                    return true;
            }
        }
        return false;
    }
}
