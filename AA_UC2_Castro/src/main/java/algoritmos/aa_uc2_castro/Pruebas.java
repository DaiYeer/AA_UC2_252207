/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos.aa_uc2_castro;

import java.util.Arrays;

/**
 *
 * @author castr
 */
public class Pruebas {
    public static void main(String[] args) {
        int[] array = {12,11,97,2,16,42,9,4,77};
        
        System.out.println("Arreglo original: " + Arrays.toString(array));
        Ordenamiento.insertionSort(array);
        System.out.println("Arreglo ordenado: " + Arrays.toString(array));
    }
}
