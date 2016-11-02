package Métodos;

import java.util.Scanner;

public class ej9 {

    public static void main(String[] args) {
        int n1;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca un año: ");
            n1 = sc.nextInt();
            boolean bisiesto = esBisiesto(n1);
            if (bisiesto == true) {
                System.out.println("Es bisiesto");
            } else {
                System.out.println("No es bisiesto");
            }
        } while (n1 != 0);
    }

    public static boolean esBisiesto(int n1) {
        if (n1 % 4 == 0 && n1 % 100 != 0 || n1 % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
