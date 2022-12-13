/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package pooej10;

import java.util.Arrays;

/**
 *
 * @author Mile
 */
public class POOEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] A = new double[50];
        double[] B = new double[20];
        
        for (int i = 0; i < 49; i++){
            A[i] = Math.random() * 20;
        }
        
        Arrays.sort(A);  
        
        for (int i = 0; i < 20; i++){
            B[i] = 0.5;
            if (i <= 9){
                B[i] = A[i];
            }          
        }
        
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
    }
    
}
