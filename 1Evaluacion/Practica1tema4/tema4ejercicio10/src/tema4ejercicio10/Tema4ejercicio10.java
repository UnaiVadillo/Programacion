/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4ejercicio10;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Tema4ejercicio10 {
    
    private static int[][] matriz= new int[4][4];
    
    public static void main(String[] args) {
        try{
            int menu=0;
            while(menu!=7){
                menu=desplazarMenu();
                switch(menu){
                    case 1:
                        rellenarMatriz();
                        break;
                    case 2:
                        sumarFilaMatriz();
                        break;
                    case 3:
                        sumarColumnaMatriz();
                        break;
                    case 4:
                        sumarDiagonalPrincipal();
                        break;
                    case 5:
                        sumarDiagonalInversa();
                        break;
                    case 6:
                        mediaMatriz();
                        break;
                    case 7:
                        Exit();
                        break;
                    default:
                        throw new datoNoValido();
                }
            }                
        }catch(datoNoValido e){
            JOptionPane.showMessageDialog(null, "Dato introducido no valido");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas: " +e.getClass());
        }
    }
    
    private static int desplazarMenu() throws Exception {
        int menu=Integer.parseInt(JOptionPane.showInputDialog("Elige una de las opciones mediante el numero" + "\n"
                                                             +"1. Rellenar la matriz" + "\n"
                                                             +"2. Suma de todos los valores de la fila que quieras"+"\n"
                                                             +"3. Suma de todos los valores de la columna que quieras"+ "\n" 
                                                             +"4. Suma de todos los valores de la diagonal principal"+ "\n" 
                                                             +"5. Suma de todos los valores de la diagonal inversa" + "\n"
                                                             +"6. Media de la matriz"+"\n"
                                                             +"7. Salir"));
        return menu;
    }
    
    private static void rellenarMatriz() throws Exception{
        for(int x=0; x<matriz.length; x++){
            for(int y=0; y<matriz[x].length;y++){
                matriz[x][y]=Integer.parseInt(JOptionPane.showInputDialog("Rellena el array en la posicion x=" + x + " y="+y ));
            }
        }
    }

    private static void sumarFilaMatriz() throws Exception{
        int resultadoSuma=0;
        int fila=Integer.parseInt(JOptionPane.showInputDialog("¿Los valores de que fila quieres sumar? [0-3]"));
        for(int y=0; y<4;y++){
            resultadoSuma= resultadoSuma+ matriz[fila][y];
        }
        JOptionPane.showMessageDialog(null, "La suma de los valores de la fila " + fila + " es = "+ resultadoSuma);
    }
    
    private static void sumarColumnaMatriz() throws Exception{
        int resultadoSuma=0;
        int columna=Integer.parseInt(JOptionPane.showInputDialog("¿Los valores de que columna quieres sumar? [0-3]"));
        for(int x=0; x<4;x++){
            resultadoSuma= resultadoSuma + matriz[x][columna];
        }
        JOptionPane.showMessageDialog(null, "La suma de los valores de la fila " + columna + " es = "+resultadoSuma);
    }
    
    private static void sumarDiagonalPrincipal() throws Exception{
        int resultado= matriz[0][0]+matriz[1][1]+matriz[2][2]+matriz[3][3];
        JOptionPane.showMessageDialog(null, "La suma de los valores de la diagonal principal es = "+resultado);
    }
    
    private static void sumarDiagonalInversa() throws Exception{
        int resultado= matriz[0][3]+matriz[1][2]+matriz[2][1]+matriz[3][0];
        JOptionPane.showMessageDialog(null, "La suma de los valores de la diagonal inversa es = "+resultado);
    }
    
    private static void mediaMatriz() throws Exception{
        int sumaMatriz=0, resultado=0;
        for(int x=0; x<matriz.length; x++){
            for(int y=0; y<matriz[x].length;y++){
                sumaMatriz= sumaMatriz + matriz[x][y];
            }
        }
        resultado= sumaMatriz/16;
        JOptionPane.showMessageDialog(null, "La media de los valores de la matriz es = "+resultado);
    }
    
    private static void Exit(){
        JOptionPane.showMessageDialog(null,"Gracias por usar la app");
        System.exit(0);
    }
   
}
