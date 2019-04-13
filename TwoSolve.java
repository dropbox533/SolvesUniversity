
//Абрамов ( Задание 11е).

package SolvesUniversity;

import java.util.Scanner;

public class TwoSolve {
    public static void main(String[] args){

        double x, y, z;

        System.out.print("Введите x, y, z: ");

        Scanner s = new Scanner(System.in);
        x = s.nextDouble();
        y = s.nextDouble();
        z = s.nextDouble();

        System.out.println("A равно" + " " + (1+Math.pow(Math.sin(x+y),2))/(2+Math.abs(x-2*x/(1+Math.pow(x,2)*Math.pow(y,2)))) );

        System.out.print("B равно" + " " + (Math.pow(Math.cos(Math.atan(1/z)),2)));

    }

}
