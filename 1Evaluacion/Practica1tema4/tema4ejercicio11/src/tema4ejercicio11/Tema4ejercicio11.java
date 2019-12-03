/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4ejercicio11;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Tema4ejercicio11 {

    private static  String[][] productos= new String[4][4];
    private static  float[][] precios= new float[4][4];
    private static  int[][] cantidades= new int[4][4];
    
    public static void main(String[] args) {
        relllenarProductos();
        rellenarPrecios();
        rellenarCantidades();
        int opcion=0;
        do{
            opcion=desplazarMenu();
            switch(opcion){
                case 1:
                     pedirGolosina();
                     break;
                case 2:
                    mostrarGolosina();
                    break;
                case 3:
                    rellenarGolosina();
                    break;
                case 4:
                    apagarMaquina();
            }
        }while(opcion==4);
       
    }
    private static void relllenarProductos() {
        productos[0][0]="KitKat";
        productos[0][1]="Chicle de fresa";
        productos[0][2]="Lacasitas";
        productos[0][3]="Palotes";
        
        productos[1][0]="Kinder Bueno";
        productos[1][1]="Bolsa variada Hariba";
        productos[1][2]="Chetoos";
        productos[1][3]="Twix";
        
        productos[2][0]="Kinder Bueno";
        productos[2][1]="M&M";
        productos[2][2]="Papa Delta";
        productos[2][3]="Chicles de menta";
        
        productos[3][0]="Lacasitos";
        productos[3][1]="Crunch";
        productos[3][2]="Milkybar";
        productos[3][3]="KitKat";
    }
    private static void rellenarPrecios() {
        precios[0][0]=1.1f;
        precios[0][1]=0.8f;
        precios[0][2]=1.5f;
        precios[0][3]=0.9f;
        
        precios[1][0]=1.8f;
        precios[1][1]=1f;
        precios[1][2]=1.2f;
        precios[1][3]=1f;
        
        precios[2][0]=1.8f;
        precios[2][1]=1.3f;
        precios[2][2]=1.2f;
        precios[2][3]=0.8f;
        
        precios[3][0]=1.5f;
        precios[3][1]=1.1f;
        precios[3][2]=1.1f;
        precios[3][3]=1.1f;
    }  
    private static void rellenarCantidades() {
        cantidades[0][0]=5;
        cantidades[0][1]=5;
        cantidades[0][2]=5;
        cantidades[0][3]=5;
        
        cantidades[1][0]=5;
        cantidades[1][1]=5;
        cantidades[1][2]=5;
        cantidades[1][3]=5;
        
        cantidades[2][0]=5;
        cantidades[2][1]=5;
        cantidades[2][2]=5;
        cantidades[2][3]=5;
        
        cantidades[3][0]=5;
        cantidades[3][1]=5;
        cantidades[3][2]=5;
        cantidades[3][3]=5;
    }
    
    private static int desplazarMenu() {
        int opcion=Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hacer? \n"
                + "1.- Pedir golosinas \n"
                + "2.- Mostrar golosinas \n"
                + "3.- Rellenar golosinas \n"
                + "4.- Apagar máquina")); 
                if(opcion <1 || opcion >4){
                    throw new NumberFormatException();
                }
        return opcion;
    }
    private static void pedirGolosina() {
       String  opcion=(JOptionPane.showInputDialog("¿Que golosina quieres? Introduce la posicion"));
       if(opcion.length()==2){
            int fila=(int)opcion.charAt(0)-48;
            int columna=(int)opcion.charAt(1)-48;
            cantidades[fila][columna]=cantidades[fila][columna]- 1;
       }
    }

    private static void mostrarGolosina() {
        String mensaje="";
        for(int x=0;x<cantidades.length;x++){
            for(int y=0;y<cantidades[x].length; y++){
                if(cantidades[x][y]>0){
                    mensaje= mensaje + "La cantidad disponible del producto " 
                            + productos[x][y] + " es " + cantidades[x][y];
                }
            }
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }

    private static void rellenarGolosina() {
        String contraseña=JOptionPane.showInputDialog("Introduzca la contraseña");
        if(contraseña.equals("MaquinaExpendedora2019")){
            String posicion;
            posicion = JOptionPane.showInputDialog("Indica la posicion a rellenar");
            if(posicion.length()==2){
                int cantidad;
                int fila=(int)posicion.charAt(0)-48;
                int columna=(int)posicion.charAt(1)-48;
                cantidad=Integer.parseInt(JOptionPane.showInputDialog("¿Que cantidad vas a introducir para " + productos[fila][columna] + " ?"));
                cantidades[fila][columna]=cantidades[fila][columna] + cantidad;
            }
        }
    }

    private static void apagarMaquina(){
       JOptionPane.showMessageDialog(null,"Gracias por usar la maquina");
       System.exit(0);
    }
}
