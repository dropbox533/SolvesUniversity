//Задание : нахождение гипотенузы и площади прямоугольного треугольника.(Абрамов 6 задание).

 package SolvesUniversity;

 import java.util.Scanner;//импорт класса для считывания ввода данных пользователем.

 public class OneSolve {
    public static void main(String[] args) {
        double a, b;


        System.out.print("Ввведите  катеты:" + " ");

        Scanner s = new Scanner(System.in);
        a = s.nextDouble();
        b = s.nextDouble();

        System.out.println("Гипотенуза равна:" + " " +  (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))));

        System.out.print("Площадь прямоугольного треугольника равна:" +" " + (a*b)/2);
    }
}
