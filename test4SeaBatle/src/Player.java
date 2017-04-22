import java.util.Scanner;

/**
 * Created by oi07 on 20.04.2017.
 */
public class Player {
    Shoot getShoot(){
        Shoot shoot = new Shoot();
        System.out.println("Куда стрелять?");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        String y = scanner.nextLine();
        System.out.printf("Вы ввели: %s:%s\n", x, y);
        shoot.X = Integer.parseInt(x)-1;
        shoot.Y = Integer.parseInt(y)-1;
        return shoot;
    }

    int getFieldSize() {
        System.out.println("Введите размер поля:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.printf("Размер поля: %s\n", s);
        return Integer.parseInt(s);
    }
}
