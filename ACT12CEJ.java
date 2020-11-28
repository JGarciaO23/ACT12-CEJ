/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act12.cej;
import java.util.*;

public class ACT12CEJ {
  
    public static void main(String[] args) {
        int men;
        int contador;
        Scanner Salir = new Scanner(System.in);
        String Continuar = "Si";
        AdressBook menu = new AdressBook();
        
        while(Continuar.equalsIgnoreCase("Si")){
        Scanner key = new Scanner(System.in);
        System.out.println("Se encuentra en el Sistema de Agenda telefónica");
        System.out.println("Selecciona una opción");
        System.out.println("1 : Revisar agenda telefónica");
        System.out.println("2 : Añadir un nuevo contacto");
        System.out.println("3 : Eliminar contacto");
        men = key.nextInt();
        
        switch (men) {
            case 1:
                menu.List();
                break;
            case 2:
                menu.Create();
                break;
            case 3:
                menu.Delete();
                break;
            default:
                System.out.println("La opción no es válida");
               break;
        }
        
        System.out.println("¿Quieres seguir en el sistema?");
        Continuar = Salir.next();
        }
        
        System.out.println("El sistema ha finalizado");
    }   
}
