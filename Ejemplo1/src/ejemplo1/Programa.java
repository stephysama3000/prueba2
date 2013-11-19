/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.tarea1;

/**
 *
 * @author estudiante
 */
public class Programa {
    
   public static void main(String [] args)
   {
       Fraccion f=new Fraccion(1,3);
       Fraccion f1=new Fraccion(2,3);
       Fraccion f2;
       Fraccion f3=new Fraccion(1,3);
       System.out.println(f);
       System.out.println(f1);
       f2=Fraccion.sumar(f, f1);
       
       System.out.println(f2);
       if(f.equals(f3))
           System.out.println("son iguales");
       else
           System.out.println("no son iguales");
       
       if(f==f3)
           System.out.println("son iguales");
       else
           System.out.println("no son iguales");
             
   }
    
}
