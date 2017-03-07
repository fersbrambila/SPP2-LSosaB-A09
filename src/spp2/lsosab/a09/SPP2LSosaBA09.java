/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.lsosab.a09;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class SPP2LSosaBA09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] a, b,r;
        int tamaño=  solicitarTamaño();
        
        a= crearM( "A", tamaño);
        b= crearM("B", tamaño);
        
      
         r= sumarM(a,b);
        System.out.println("La suma de las matrices es" + r);
    }

    static int[][] crearM(String dato ,int tamaño){
        Scanner tec= new Scanner(System.in);
        System.out.println("Ingresa los datos de la matriz " + dato );
                int [][] mat= new int [tamaño][tamaño];        
        for (int i=0;i<mat.length;i++){
                  for (int j=0;j<mat.length;j++){
        
        mat[i][j]= solicitarEntero();}            
       
    }
    return mat;
    }
    
    
    static int solicitarTamaño(){
     Scanner tec= new Scanner (System.in);
        int tamaño;
         boolean test;
              do {
            System.out.println("Introduce el tamaño de la matriz");
            try {
                tamaño= tec.nextInt();
                test=true;
                 }
            catch (Exception ex) {
                test=false;
                System.out.println("El dato insertado no es entero " + ex);
                tamaño=tec.nextInt();
            }   
        tamaño= tec.nextInt();      
     } while (test == false);
        return tamaño; 
    }
   
    static int solicitarEntero(){
        Scanner tec= new Scanner (System.in);
        int ent;
        boolean test;
        do {
            System.out.println("Introduce contenido de la matriz ");
            try {
                ent= tec.nextInt();
                test=true;
                 }
            catch (Exception ex) {
                test=false;
                System.out.println("El dato insertado no es entero " + ex);
                ent=tec.nextInt();
            }   
        ent= tec.nextInt();      
     } while (test == false);
        return ent ; 
    }

   static int [][] sumarM(int[][] a,int[][] b){
       int[][]r= new int[a.length][a.length];
       for (int i=0;i<r.length;i++){
           for (int j=0;j<r.length;j++){
       
       r[i][j]= a[i][j]+b[i][j];}
       
   }
       return r;
   }
       
  
}

        
    
        
        
    

        
    
    

