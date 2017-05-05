import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by oi07 on 20.04.2017.
 */
public class Field {
    int size;
    char[][] cells;
    Ship ship;

    void init(int size) {
        this.size = size;
        cells = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cells[i][j] = '.';

            }

        }
    }

    void setShip(){
//        cells[ship.position][ship.position] = 'X';
        Ship ship;
        boolean isCreate = false;
        do {
            ship = new Ship(size);
            if (ship.isVertical)
            {
                if (ship.positionY + ship.size < size) {
                    for (int i = 0; i < ship.size; i++) {
                        cells[ship.positionX][ship.positionY + i] = 'X';
                    }
                    isCreate = true;
                }
            }
            if (!ship.isVertical)
            {
                if (ship.positionX + ship.size < size) {
                    for (int i = 0; i < ship.size; i++) {
                        cells[ship.positionX + i][ship.positionY] = 'X';
                    }
                    isCreate = true;
                }
            }
        } while (!isCreate);
        this.ship = ship;
    }

    void doShoot(Shoot shoot) {
        if (shoot.X == -1 && shoot.Y == -1) {
            showShips();
            for (int i = 0; i < size; i++) {
                System.out.print("=");
            }
            System.out.println();
            return;
        }
        if (shoot.X > size - 1 || shoot.Y > size - 1 || shoot.X < 0 || shoot.Y < 0) {
            System.out.println("Выход за пределы боевого поля!");
            return;
        }
        switch (cells[shoot.X][shoot.Y]) {
            case '.':
                System.out.println("Промах");
                cells[shoot.X][shoot.Y] = '*';
                break;
            case 'X':
                System.out.println("Корабль подбит!");
                cells[shoot.X][shoot.Y] = '-';
                showShoots();
                break;
            case '*':
                System.out.println("Уже стреляли!");
                break;
            case '-':
                System.out.println("Уже стреляли!");
                break;
            default:
                System.out.println("ERROR");
        }
    }

    void showShoots() {
        for (char[] cell : cells) {
            for (char c : cell) {
//                System.out.print(c);
                if (c == 'X') {
                    System.out.print('.');
                } else System.out.print(c);
            }
            System.out.println();
        }

    }

    void showShips() {
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
