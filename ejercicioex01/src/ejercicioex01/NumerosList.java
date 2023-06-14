/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package ejercicioex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class NumerosList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>();
        int num, cont = 0,sum=0;

        System.out.println("Ingrese número a sumar");
        num = leer.nextInt();
        while (num != -99) {
            numList.add(num);
            sum=sum+num;
            cont++;
            System.out.println("Ingrese número a sumar");
            num = leer.nextInt();
        }
        for (int i = 0; i < numList.size(); i++) {
            Integer get = numList.get(i);
            System.out.print("("+get+")");
        }
        System.out.println("");
        System.out.println("Suma de todos los números es: "+sum+",  el promedio: "+(sum/cont));

    }

}
