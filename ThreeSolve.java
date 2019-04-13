//Абрамов (задание 23в).Найти биссектрисы по сторонам треугольника.

package SolvesUniversity;

 import java.util.Scanner;

public class ThreeSolve {
    public static void main(String[] args){

        double j, m, k;

        System.out.print("Введите стороны тругольника:");

        Scanner s = new Scanner(System.in);
        j = s.nextDouble();
        m = s.nextDouble();
        k = s.nextDouble();

        System.out.println("Биссектрисы треугльника равны:" + " "

               + ((Math.sqrt(j*m*(j+m+k)*(j+m-k)))/(j+m)) + ";" + " "

                + (Math.sqrt(j*k*(j+k+m)*(j+k-m))/(j+k)) + ";" + " "

                +  (Math.sqrt(m*k*(m+k+j)*(m+k-j))/(m+k)));


    }
}
