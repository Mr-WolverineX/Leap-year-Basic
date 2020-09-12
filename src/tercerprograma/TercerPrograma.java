


package tercerprograma;

import java.util.Scanner;

public class TercerPrograma {


    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner (System.in);

    int nummes;  // tambien puedo separa las variables por coma ejemplo (int nummes,año;)
    int año;
    int biciesto;
    
    System.out.println(" Ingrese año para saber si es biciesto ");
    año = sc.nextInt();
    
    biciesto = año % 4; // cada 4 años febrero es biciento por tener 1 dia mas.
    
    if( biciesto == 0 ){ // si el residuo de año es diferente a 0 no es biciesto si es igual a 0 si es biciesto
        System.out.println(" El año es biciesto ");
    }
    
    System.out.println(" Ingrese en numero el mes ");
    nummes = sc.nextInt();
    
    while (nummes <= 0 || nummes >= 13){
            System.out.println(" Error... Ingrese numeros del 1 al 12 ");
            nummes = sc.nextInt();
    }
    
    if ( nummes == 1){
        System.out.println(" El mes es enero y tiene 31 días ");
    }
    
        if ( nummes == 2 && biciesto == 0){
             System.out.println(" El mes es Febrero y tiene 29 días ");
         }
        
             if ( nummes == 2 && biciesto != 0){
                 System.out.println(" El mes es Febrero y tiene 28 días ");
             }
             
                 if ( nummes == 3){
                     System.out.println(" El mes es Marzo y tiene 31 días ");
                 }
                 
                        if ( nummes == 4){
                            System.out.println(" El mes es Abril y tiene 30 días ");
                         }
                        
                        
    if ( nummes == 5){
         System.out.println(" El mes es Mayo y tiene 31 días ");
    }
    
        if ( nummes == 6){
               System.out.println(" El mes es Junio y tiene 30 días ");
        }
        
             if ( nummes == 7){
                System.out.println(" El mes es Julio y tiene 31 días ");
            }
             
                if ( nummes == 8){
                     System.out.println(" El mes es Agosto y tiene 31 días ");
                 }
                
                    if ( nummes == 9){
                         System.out.println(" El mes es Septiembre y tiene 30 días ");
                     }
                    
                    
    if ( nummes == 10){
        System.out.println(" El mes es Octubre y tiene 31 días ");
    }
    
        if ( nummes == 11){
             System.out.println(" El mes es Noviembre y tiene 30 días ");
         }
        
            if ( nummes == 12){
                System.out.println(" El mes es Diciembre y tiene 31 días ");
            }
        
        
        }
    
}
