import java.util.Scanner;

/**
 * Created by oi07 on 20.04.2017.
 */
public class Player {
    Shoot getShoot(){
        Shoot shoot = new Shoot();
        String y = "";
        String x = "";
        System.out.println("Куда стрелять?");
        Scanner scanner = new Scanner(System.in);
        do {y = scanner.nextLine();} while (y.isEmpty());
        do {x = scanner.nextLine();} while (x.isEmpty());
        System.out.printf("Вы ввели: %s:%s\n", y, x);
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
