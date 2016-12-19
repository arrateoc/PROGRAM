/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraybi1;

import java.util.Scanner;

/**
 *
 * @author admin1
 */
public class Arraybi1 {

    /**
     * @param args the command line arguments
     */
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
 String[] alumnos = {"Ana", "Kepa", "Miren", "Jon"};
        String[] asignaturas = {"PROG", "LM", "BD"};
        double array[][] = cargarTabla();
        double mediaAl[]=new double[4];
        double mediaAs[]=new double[3];
        mostrarArray(array, alumnos, asignaturas);
        mostrarMediaAlumno(array, alumnos,mediaAl);
        mostrarMediaAsignatura(array, asignaturas,mediaAs);
        mostrarCompleto(array,alumnos,asignaturas,mediaAs,mediaAl);
    }

    public static double[][] cargarTabla() {
        double[][] array = {
            {5.2, 3.2, 6.7},
            {5.3, 6.5, 3.4},
            {2.3, 5.8, 9.7},
            {2.4, 5.5, 7.4},};
        return array;
    }

    public static void mostrarArray(double array[][], String nombres[], String asignaturas[]) {
        System.out.println("\t" + asignaturas[0] + "\t" + asignaturas[1] + "\t" + asignaturas[2]);
        for (int i = 0; i < array.length; i++) {
            System.out.print(nombres[i] + "\t");
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();

        }
    }

    public static void mostrarMediaAlumno(double array[][], String nombres[],double media[]) {
        double suma=0;
        System.out.println("\nMedias por alumno:\n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                suma+=array[i][j];
                media[i]=suma/3;    
            }
            suma=0;
        }
        for (int a = 0; a < media.length; a++) {
            System.out.println(nombres[a] + "  " + media[a]);
        }
    }
    public static void mostrarMediaAsignatura(double array[][],String asignaturas[], double media[]){
        double suma=0;
        System.out.println("\nMedias por asignatura:\n");
        for (int j = 0; j < array[0].length; j++) {   
            for (int i = 0; i < array.length; i++) {
                 suma+=array[i][j];
                 media[j]=suma/4; 
            }
            suma=0;
        }
        for (int a = 0; a < media.length; a++) {
            System.out.println(asignaturas[a] + "  " + media[a]);
        }
    }
     public static void mostrarCompleto(double array[][], String nombres[], String asignaturas[],double mediaAs[], double mediaAl[]) {
        System.out.println("\t" + asignaturas[0] + "\t" + asignaturas[1] + "\t" + asignaturas[2]+"\tMedia\t\t\t\t");
        for (int i = 0; i < array.length; i++) {
            System.out.print(nombres[i] + "\t");
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
               
            }
            System.out.print(mediaAl[i]);
            System.out.println();
        }
        for(int a=0;a<asignaturas.length;a++){
            System.out.print("\t"+mediaAs[a]);
        }
    }
}
