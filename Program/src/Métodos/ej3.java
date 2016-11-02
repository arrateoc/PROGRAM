package Program;

import java.util.Scanner;

public class EsMayor {

    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        n1 = sc.nextInt();
        System.out.println("Introduzca otro número: ");
        n2 = sc.nextInt();
        boolean mayor = esMayor(n1, n2);
        if (mayor == true) {
            System.out.println("El número " + n1 + " es mayor que " + n2);
        } else {
            System.out.println("El número " + n2 + " es mayor que " + n1);
        }

    }

    public static boolean esMayor(int n1, int n2) {
        if (n1 < n2) {
            return true;
        } else {
            return false;
        }
    }
}
