/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmos;

/**
 *
 * @author castr
 */
public class Ordenamientos {
    
    public static void selectionSort(int[] array){
        int n = array.length;
        
        for (int i = 0;i < n - 1; i++){
            int minIdx = i;
            
            //se busca el elemento de menor valor
            for (int j = i + 1; j < n; j++){
                if (array[j] < array[minIdx]){
                    
                }
            }
            
            //se intarcambia el elemento de menor valor con el elemento actual
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }
}
