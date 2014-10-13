
package bol2ej7;

import java.util.Scanner;

public class Bol2Ej7 {

    public static void main(String[] args) {
        
        float n = 0;
        float i = 0;
        float t = 0;
        float resultado = 0;
        
        System.out.println("Introduzca la cantidad a financiar:");
        Scanner cant= new Scanner (System.in);
        n= cant.nextFloat();
        System.out.println("Introduca el porcentaje de interés:");
        Scanner porc= new Scanner (System.in);
        i= porc.nextFloat();
        System.out.println("Introduzca el numero de años:");
        Scanner anos= new Scanner(System.in);
        t = anos.nextFloat();
        
        resultado = (n / (t * 12))*i;
        
        System.out.println("La cuota será de " + resultado + " euros al mes");
   
    }
    
}
