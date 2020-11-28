/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JGarciaO.23
 */
package act12.cej;
import java.util.*;
public class AdressBook {
    HashMap <String,String> agenda = new HashMap <>(); 
    String name, phone;
        Scanner n = new Scanner(System.in);
        Scanner t = new Scanner(System.in);
   
    public void List(){
        
        agenda.entrySet().stream().map((entry) -> {
            System.out.println("Contactos\n");
            return entry;
        }).forEachOrdered((entry) -> {
            System.out.println("{" + entry.getKey()+ "}"+ "{"+ entry.getValue() +"}");
        });
    }
    
    
    public void Create(){
                

        System.out.println("Añadir nombre");
        name = n.next();
        System.out.println("Ingresa el número");
        phone = t.next();

        if(!agenda.containsKey(name)){
        agenda.put(name, phone);
        System.out.println("Se ha guardado un nuevo contacto");
        }else {
        System.out.println("Contacto existente\n");
        }
    }
    
    public void Delete(){
               
        System.out.println("Ingresa el número");
        phone = t.next();
        if (agenda.containsKey(phone)){
        agenda.remove(phone);
        System.out.println("Se ha eliminado de la lista");
        }else{
        System.out.println("El contacto no existe\n");
        }
        }
    
        public void Load(){
        
    }
    
    public void Save(){
        
    }
}
