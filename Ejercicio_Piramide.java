package ejercicio_piramide;

import java.util.Scanner;

public class Ejercicio_Piramide {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tam; 
        
        do{
            System.out.println("");
            System.out.print("Digite el tamaño de la piramide: ");
            tam = entrada.nextInt();
            System.out.println("");
            
            int i, j, s = tam;
            for(i = tam; i >= 1; i--){ //I es igual al tamaño y se restara hasta llegar a 1
                for(j=1; j<=i; j++){ //J es igual a 1 y se sumara hasta llegar a ser igual a I
                 
                    System.out.print("JAVA");
                }   
                System.out.println("");
                
                s--; //S es igual al tamaño, pero por cada iteración se resta 1
                if( i > 0){ //SI I ES MAYOR A 0, COMENZAMOS A CREAR ESPACIOS
                    for(int f = s; f <= tam; f++ ){ //F es igual a S y se sumara hasta llegar a ser igual a TAM
                        System.out.print(" "); //Se crean F espacios
                    }
                }//FIN DE IF
            }
        }while( tam != 0);
    }
    
}
