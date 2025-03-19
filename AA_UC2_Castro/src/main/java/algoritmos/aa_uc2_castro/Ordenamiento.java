/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos.aa_uc2_castro;

/**
 *
 * @author castr
 */
public class Ordenamiento {
    
    /**
     * Metodo para implementar el algoritmo de ordenamiento por insercion
     */
    
    public static void insertionSort(int[]arr) {
        int f = arr.length;
        for(int i = 1; i < f; i++){
            int key = arr[i];
            int m = i - 1;
            
            //Se mueven los elementos del arreglo que son mayores a key una posicion adelante
            while(m >= 0 && arr[m] > key){
                arr[m + 1] = arr[m];
                m = m - 1;
            }
            arr[m + 1] = key;
        }
    }
}
