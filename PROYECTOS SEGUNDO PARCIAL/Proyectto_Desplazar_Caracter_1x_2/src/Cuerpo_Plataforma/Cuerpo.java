/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuerpo_Plataforma;

import java.util.Scanner;

/**
 *
 * @author Florian
 */
public class Cuerpo {
    private int derecha=0;
    private int abajo=0;
    private int izquierda=0;
    private int arriba=0;

    
    Movimientos pasos= new Movimientos();
    
    
     public void despliega(int matriz[][]){
        for (int x=0;x<matriz.length;x++){
            for(int y=0; y<matriz[x].length;y++){
                int currentcell=matriz[x][y];
                System.out.print(" "+currentcell);
                 
 
            }
            System.out.println();
        }
     }
        
               
            
public void Mover_Jugador(){
       Scanner i=new Scanner(System.in);
        int matriz[][] = new int[13][20]; 
       int isquierda,pderecha = 0,parriba=0;
       int op, pizquierda=0;
       int pabajo=0;
          // MUESTRO LA MATRIZ AL PRINCIPIO 
       for(int x=0;x<matriz.length;x++){
           matriz[12][19]=9;
           matriz[0][0]=9;
            }//
       despliega(matriz);
       matriz[0][0]=0;
            
       
       do{     
     System.out.print("\n\t\t\tEL OBJETIVO ES LLEVAR EL   9   ASTA DONDE ESTA EL OTRO 9 :\n");   
     System.out.print("\tOPCIONES:\n");
     System.out.print("1 -  DERECHA\n");
     System.out.print("2 -  ABAJO\n");
     System.out.print("3 -  IZQUIERDA\n");
     System.out.print("4 -  ARRIBA\n");
     System.out.print("5 -  SALIR\n");
     
     System.out.print("\tINGRESA UNA LO QUE DESEAS HACER:   ");
     op=i.nextInt();
     
     if (op==1){ // PASOS HACIA LA DERECHA
         
         System.out.print("\tINGRESE LOS PASOS HACIA LA DERECHA :   ");
         pderecha=i.nextInt();
//------------------------------------------------------------------------------- Inicio Derecha Derecha.
           derecha=pasos.incrementadorDerecha(pderecha);
           if(derecha>=1)// realiza el movimiento a la derecha cuando esta en el punto inicial
           {
           for(int x=0;x<matriz.length;x++){  
           matriz[abajo-arriba][derecha-izquierda]=9;
           matriz[12][19]=9;
            
           };
           despliega(matriz);
           matriz[abajo-arriba][derecha-izquierda]=0;// deja en blanco el movimiento anterior
           }
           if ( matriz[abajo-arriba][derecha-izquierda] ==matriz[12][19]) // MOSTRARA LA CANTIDAD DE PASOS RELIZADOS PARA LLEGAR A LA META
           {
          System.out.println("\n\n\n\t\t\t FELICIDADES LO LOGRASTE\n\n");  
          System.out.println("\n\n\n\t\t ESTOS PASOS SE REALIZARON PARA LLEGAR AL DESTINO");
          if(abajo>=1){
               System.out.println("\t ----  "+abajo+" PASOS HACIA ABAJO");}
          if(arriba>=1){
               System.out.println("\t ----  "+arriba+" PASOS HACIA ARRIBA");}
          if(izquierda>=1){
               System.out.println("\t ----  "+izquierda+" PASOS HACIA LA IZQUIERDA");}
          if(derecha>=1){
               System.out.println("\t ----  "+derecha+" PASOS HACIA LA DERECHA\n\n");}
           }
     }
//----------------------------------------------------------------------------------
      if (op==2)    // PASOS HACIA abajo
     {
        System.out.print("\tINGRESE LOS PASOS HACIA LA ABAJO :   ");
         pabajo=i.nextInt();
//------------------------------------------------------------------------------- Inicio Movimiento Derecha.
           abajo=pasos.incrementadorAbajo(pabajo);
           if(abajo>=1)// realiza el movimiento a la derecha
           {
           for(int x=0;x<matriz.length;x++){  
           matriz[abajo-arriba][derecha-izquierda]=9;
           matriz[12][19]=9;
            
           };
           despliega(matriz);
           matriz[abajo-arriba][derecha-izquierda]=0;// deja en blanco el movimiento anterior
           } 
           if ( matriz[abajo-arriba][derecha-izquierda] ==matriz[12][19]) // MOSTRARA LA CANTIDAD DE PASOS RELIZADOS PARA LLEGAR A LA META
           {
           System.out.println("\n\n\n\t\t\t FELICIDADES LO LOGRASTE\n\n");  
          System.out.println("\n\n\n\t\t ESTOS PASOS SE REALIZARON PARA LLEGAR AL DESTINO");
          if(abajo>=1){
               System.out.println("\t ----  "+abajo+" PASOS HACIA ABAJO");}
          if(arriba>=1){
               System.out.println("\t ----  "+arriba+" PASOS HACIA ARRIBA");}
          if(izquierda>=1){
               System.out.println("\t ----  "+izquierda+" PASOS HACIA LA IZQUIERDA");}
          if(derecha>=1){
               System.out.println("\t ----  "+derecha+" PASOS HACIA LA DERECHA\n\n");}
           }
          
      } 
     //----------------------------------------------------------------------------------
      if (op==3)    // PASOS HACIA IZQUIERDA
     {
           System.out.print("\tINGRESE LOS PASOS HACIA LA IZQUIERDA :   ");
         pizquierda=i.nextInt();
//------------------------------------------------------------------------------- Inicio  Movimiento Izquierda.
           izquierda=pasos.incrementadorIzquierda(pizquierda);
           if(izquierda>=1)// realiza el movimiento a la derecha cuando esta en el punto inicial
           {
           for(int x=0;x<matriz.length;x++){  
           matriz[abajo-arriba][derecha-izquierda]=9;
           matriz[12][19]=9;
            
           };
           despliega(matriz);
           matriz[abajo-arriba][derecha-izquierda]=0;// deja en blanco el movimiento anterior
           }  
           if ( matriz[abajo-arriba][derecha-izquierda] ==matriz[12][19]) // MOSTRARA LA CANTIDAD DE PASOS RELIZADOS PARA LLEGAR A LA META
           {
           System.out.println("\n\n\n\t\t\t FELICIDADES LO LOGRASTE\n\n");  
          System.out.println("\n\n\n\t\t ESTOS PASOS SE REALIZARON PARA LLEGAR AL DESTINO");
          if(abajo>=1){
               System.out.println("\t ----  "+abajo+" PASOS HACIA ABAJO");}
          if(arriba>=1){
               System.out.println("\t ----  "+arriba+" PASOS HACIA ARRIBA");}
          if(izquierda>=1){
               System.out.println("\t ----  "+izquierda+" PASOS HACIA LA IZQUIERDA");}
          if(derecha>=1){
               System.out.println("\t ----  "+derecha+" PASOS HACIA LA DERECHA\n\n");}
           }
       }
         
      //----------------------------------------------------------------------------------
      if (op==4)    // PASOS HACIA ARRIBA
     { 
            System.out.print("\tINGRESE LOS PASOS HACIA LA ARRIBA :   ");
         parriba=i.nextInt();
//------------------------------------------------------------------------------- Inicio Movimiento Arriba
           arriba=pasos.incrementadorArriba(parriba);
           if(izquierda>=1)// realiza el movimiento a la izquierda
           {
           for(int x=0;x<matriz.length;x++){  
           matriz[abajo-arriba][derecha-izquierda]=9;
           matriz[12][19]=9;
            
           };
           despliega(matriz);
           matriz[abajo-arriba][derecha-izquierda]=0;// deja en blanco el movimiento anterior
           }  
           if ( matriz[abajo-arriba][derecha-izquierda] ==matriz[12][19]) // MOSTRARA LA CANTIDAD DE PASOS RELIZADOS PARA LLEGAR A LA META
           {
          System.out.println("\n\n\n\t\t\t FELICIDADES LO LOGRASTE\n\n");  
          System.out.println("\n\n\n\t\t ESTOS PASOS SE REALIZARON PARA LLEGAR AL DESTINO");
          if(abajo>=1){
               System.out.println("\t ----  "+abajo+" PASOS HACIA ABAJO");}
          if(arriba>=1){
               System.out.println("\t ----  "+arriba+" PASOS HACIA ARRIBA");}
          if(izquierda>=1){
               System.out.println("\t ----  "+izquierda+" PASOS HACIA LA IZQUIERDA");}
          if(derecha>=1){
               System.out.println("\t ----  "+derecha+" PASOS HACIA LA DERECHA\n\n");}
           }
     }

     }while(op!=5 || matriz[abajo-arriba][derecha-izquierda] !=matriz[12][19] );
         
    
           
           
    }    
}      
       
            
     