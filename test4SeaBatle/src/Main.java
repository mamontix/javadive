/**
 * Created by oi07 on 20.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        Player player = new Player();
//        Ship ship = new Ship();

        System.out.println("Начало игры");

        field.init(player.getFieldSize());
        field.setShip();

        do {
            field.show();
            field.doShoot(player.getShoot());
        }while (field.isNotGameOver());
        System.out.println("Корабль потоплен!");
    }
}
