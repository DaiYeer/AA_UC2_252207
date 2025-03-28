/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmos;

import Algoritmos.Ordenamientos;
import java.util.Arrays;

/**
 *
 * @author castr
 */
public class Pruebas {
    public static void main(String[] args) {
        int[] array = {64,25,12,11,22};
        
        System.out.println("Arreglo original: " + Arrays.toString(array));
        Ordenamientos.selectionSort(array);
        System.out.println("Arreglo ordenado: " + Arrays.toString(array));
    }
}
