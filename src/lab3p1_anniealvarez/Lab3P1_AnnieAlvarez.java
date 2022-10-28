/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_anniealvarez;
import java.util.Scanner;
/**
 *
 * @author anniealvarez
 */
public class Lab3P1_AnnieAlvarez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura = new Scanner(System.in);
        boolean menu = true;
        
        while (menu == true){
            System.out.println("--MENU--");
            System.out.println("1. Diptongo");
            System.out.println("2. Sumatoria Pi");
            System.out.println("3. Time Clock");
            System.out.println("4. Salir");
            System.out.println("Ingrese la opcion que desee");
            int opcion = lectura.nextInt();
            
            switch(opcion){
                case 1: {
                    System.out.println("Diptongo");
                    System.out.println("Ingrese una palabra");
                    String palabra = lectura.nextLine().toLowerCase();
                    lectura.nextLine();
                    int cont = 0;
                    if (palabra.length()< 97 && palabra.length()>122){
                    for(int i = 0; i < palabra.length(); i++){
                        switch(palabra.charAt(i)){
                            case 'a': 
                            case 'e': 
                            case 'i': 
                            case 'o': 
                            case 'u': cont++;
                            break;
                            default:    
                        }
                        if(cont>1){
                            System.out.println("La palabra es diptongo");
                        }else{
                            System.out.println("La palabra no es diptongo");
                        }
                        
                    }
                   
                    }
                }//fin case 1
                break;
                
                case 2: {
                    System.out.println("Sumatoria pi");
                    System.out.println("Ingrese un limite");
                    double limite = lectura.nextDouble();
                    if(limite > 0){
                       double mult = 0;
                       double suma = -1;
                       //double pi = 0;
                       for(int n = 0; n <= limite; n++)
                          
                           mult = 4 * (1/n)* (Math.pow(suma, n))/(2*n)+1;
                        System.out.println("El resultado es: "+ mult);
                        
                        }  
                    
                    
                    
                }//fin case 2
                break;
                
                
                case 3: {
                    System.out.println("Time");
                    System.out.println("Ingrese el limite");
                    int tamano = lectura.nextInt();
                    
                    if(tamano%2!=0){
                       /* for(int i = tamano; i > 0; i--){
                            if(i<= tamano || i == 0 ){
                                System.out.print("*");
                            }else{
                                System.out.println(" ");
                            }
                            for(int j = 0; j < i ; j++){
                                if(i==0 || i > j-1 || i == j){
                                    
                                System.out.print("*");
                                }else{
                                    System.out.print(" ");
                                }

                        
                                }
                            System.out.println();
                        }*/
                     for(int i = 0; i < (tamano+1)/2; i++){
                         for(int j = 0; j < tamano; j++){
                             if((j>=i&&j<tamano-i) ){
                                 System.out.print("*");
                             }else{
                                 System.out.print(" ");
                             }
                         }
             
                         System.out.println();
                     }  
                     int midline = ((tamano+1)/2)-1;
                     for(int i =1 ;i<(tamano+1)/2;i++){
                         for(int j = 0; j < tamano; j++){
                             if(j==midline||(j>=midline-i && j<=midline+i)){
                                 System.out.print("*");
                             }else{
                                 System.out.print(" ");
                             }
                         }
                         System.out.println("");
                     }
                    
                    }
                            
                }//fin case 3
                break;
                
                case 4: {
                    menu = false;
                }//fin case 4
                break;
                default: 
                    System.out.println("Esa opcion no existe");
            }//fin switch
        }//fin while
    }//fin main
    
}//FIN
