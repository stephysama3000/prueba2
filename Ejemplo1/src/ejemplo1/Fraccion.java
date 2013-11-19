/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.tarea1;

/**
 *
 * @author estudiante
 */
public class Fraccion {
    private int numerador;
    private int denominador;

    public int getDenominador() {
        return denominador;
    }

    public int getNumerador() {
        return numerador;
    }
    
    public Fraccion(int n,int d)
    {
        numerador=n;
        denominador=d ==0 ? 1 :d;
    }
    
    public void sumar(Fraccion f)
    {
         denominador=(denominador*f.denominador);
         numerador=(numerador*f.denominador)+(f.numerador*denominador);
    }
    
     public static Fraccion sumar(Fraccion f1, Fraccion f2)
     {
         return new Fraccion(f1.numerador*f2.denominador + f2.numerador*f1.denominador,f1.denominador*f2.denominador);
     }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    @Override
    public boolean equals(Object o)
    {
        Fraccion f;
        if(o==null)
            return false;
        
        if(!(o instanceof Fraccion))
          return false;
        
        f=(Fraccion) o;
        return this.numerador == f.numerador && this.denominador == f.denominador;
    }
   
    
}
