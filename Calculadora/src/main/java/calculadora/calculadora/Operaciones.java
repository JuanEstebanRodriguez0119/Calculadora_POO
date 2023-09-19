package calculadora.calculadora;

import java.util.Scanner;

public class Operaciones {
    Scanner txt = new Scanner (System.in);   
    
    int cant_num = 0;
    int num;
    int operacion = 0;
    double resul = 0;
    
            public void mostrar_suma() {
                System.out.println("Por favor digite la cantidad de numeros a sumar: ");
                cant_num = txt.nextInt();
                 for(int i=1; i<=cant_num; i++){
                     System.out.println("Digite el numero " + i);
                     num = txt.nextInt();
                     operacion+= num; 
                 }
                 System.out.println("El resultado de la suma total de los numeros es  " + operacion);       
            }
   
            public void mostrar_resta() {
                System.out.println("Por favor digite la cantidad de numeros a restar: ");
                cant_num = txt.nextInt();
                System.out.print("Ingrese el número inicial: ");
                int operacion = txt.nextInt();
                
                for (int i=2; i<=cant_num; i++) {
                System.out.print("Ingrese el número "+ i + ": ");
                int numero = txt.nextInt();
                operacion -= numero;
        }
                System.out.println("El resultado de la resta total de los numeros es  " + operacion);
            }
            
            public void mostrar_multi() {
                System.out.println("Por favor digite la cantidad de numeros a multiplicar: ");
                cant_num = txt.nextInt();
                System.out.print("Ingrese el número inicial: ");
                int operacion = txt.nextInt();
                
                for (int i=2; i<=cant_num; i++) {
                System.out.print("Ingrese el número "+ i + ": ");
                int numero = txt.nextInt();
                operacion *= numero;
        }
                System.out.println("El resultado de la multiplicacion total de los numeros es  " + operacion);
            }
            public void mostrar_divi() { 
                double dividendo;
                double divisor;
                double operacion2;
                System.out.println("Por favor digite la cantidad de divisiones que desea realizar: ");
                cant_num = txt.nextInt();
                for (int i=1; i<=cant_num; i++) {
                    System.out.println("Digite el dividendo de la division "+i+":");
                    dividendo= txt.nextDouble();
                    System.out.println("Digite el divisor: ");
                    divisor= txt.nextDouble();
                    operacion2 = dividendo / divisor;
                    System.out.println("El resultado de la division "+ i +" es " + operacion2);     
                    System.out.println("____________________________________________________");
                }
            }
   
    
    
}
