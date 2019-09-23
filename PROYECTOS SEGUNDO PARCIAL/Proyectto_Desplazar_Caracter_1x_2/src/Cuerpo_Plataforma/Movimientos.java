/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuerpo_Plataforma;

/**
 *
 * @author Florian
 */
public class Movimientos {
    public int sumaDerecha = 0;
    public int sumaAbajo = 0;
    public int sumaIzquierda = 0;
    public int sumaArriba = 0;
  
    public int incrementadorDerecha(int paso)
    {
            sumaDerecha=sumaDerecha+paso;   
        return sumaDerecha;
    }
 public int incrementadorAbajo(int paso)
    {
            sumaAbajo=sumaAbajo+paso;   
        return sumaAbajo;
    }
  public int incrementadorIzquierda(int paso)
    {
            sumaIzquierda=sumaIzquierda+paso;   
        return sumaIzquierda;
    }
    public int incrementadorArriba(int paso)
    {
            sumaArriba=sumaArriba+paso;   
        return sumaArriba;
    }
    
    
}
