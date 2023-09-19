
package calculadora.calculadora;
import java.util.Scanner;
public class Menu {
        
        Operaciones tipo_op= new Operaciones ();    // Objeto operaciones (Va a tener los metodos de suma resta etc...)
    
    public void mostrar_menu () { 
        int opc = 0;
        
       do { 
        System.out.println("Bienvenido a la calculadora de suma, resta, multiplicacion y division");
        System.out.println("Por favor digite la operacion que desea realizar: ");
        System.out.println(" Opcion (1)= Suma \n Opcion (2)= Resta \n Opcion (3)= Multiplicacion \n Opcion (4)= Division \n Opcion (5)= Salir \n ");
        Scanner txt = new Scanner (System.in);
        opc = txt.nextInt();
        
            switch (opc){ 
                case 1:
                   tipo_op.mostrar_suma();   // Objeto con el respectivo metodo de operacion 
               
                   txt.nextLine(); //Esto es para hacer una pausa en la calculadora y que no siga derecho sin mostrar el resultado
                   System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); 
    		   txt.nextLine();
                   break;
                   
                case 2:
                  tipo_op.mostrar_resta();
                  
                  txt.nextLine(); 
                  System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); 
    		  txt.nextLine();
                   break;
                   
                case 3:
                  tipo_op.mostrar_multi();
                  
                  txt.nextLine(); 
                  System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); 
    		  txt.nextLine();
                   break;
                   
                
                case 4:
                   tipo_op.mostrar_divi();
                   
                   txt.nextLine(); 
                   System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); 
    		   txt.nextLine();
                   break;
                   
                case 5:
                   System.out.println("Muchas Gracias! \nVuelva pronto!");
                   System.exit(0);
                   break;
                
                default:
                   System.out.println("Por favor seleccione una opcion valida!");
                   txt.nextLine(); 
                   System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); 
    		   txt.nextLine();
              }  
       }while (opc !=5);    
  
            
     
        
        
        
    
    
    
    
    }
             
}
