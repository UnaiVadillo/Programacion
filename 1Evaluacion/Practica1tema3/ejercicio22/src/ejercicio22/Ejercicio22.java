/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22;
import java.util.Scanner;
/**
 *
 * @author 1GDAW11
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un numero");
        int p=sc.nextInt();
        
        p=p+1;
        
        int divi=0;
        int cont=0;
        
        while(cont<p || cont>p){
            for(int x=1; x<cont +1; x=x+1){
                if(cont%x==0){
                    divi=divi+1;
                }   
            }
            if(divi==2){
                System.out.println(cont);
            }
            cont=cont+1;
            divi=0;

        }
        
        
        
    }
     
}
