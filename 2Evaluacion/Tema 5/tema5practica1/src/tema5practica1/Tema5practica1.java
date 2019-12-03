/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5practica1;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Tema5practica1 {
    private static ArrayList<Double> lista = new ArrayList();
    
    public static void main(String[] args) {
        
        boolean correcto=false;
        int menu=0;
        rellenarArray();
        do{
            try{
                while(menu!=10){
                menu=desplazarMenu();
                switch(menu){
                    case 1:
                        visualizarMaxMin();
                        correcto=false;
                        break;
                    case 2:
                        solicitarNúmero();
                        correcto=false;
                        break;
                    case 3:
                        solicitarNúmeroyBorrado();
                        correcto=false;
                        break;
                    case 4:
                        convertirArraylistEnArray();
                        correcto=false;
                        break;
                    case 5:
                        mostrarTamano();
                        correcto=false;
                        break;
                    case 6:
                        insertarElementoFinal();
                        correcto=false;
                        break;
                    case 7:
                        insertarElementoPosicion();
                        correcto=false;
                        break;
                    case 8:
                        borrarElementoPosicion();
                        correcto=false;
                        break;
                    case 9:
                        calcularSumayMediaAritmetica();
                        correcto=false;
                        break;
                    case 10:
                        Exit();
                        break;
                    default:
                        throw new datoNoValido();
                    }
                }
            }catch(datoNoValido e){
                JOptionPane.showMessageDialog(null, "Dato introducido no valido");
                correcto=true;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Dato introducido no valido");
                correcto=true;
            }catch(NullPointerException e){
                JOptionPane.showMessageDialog(null, "No puedes darle a la x o a cerrar");
                correcto=true;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Problemas: " +e.getClass());
                correcto=true;
            }
        }while(correcto=true);
        
    }

    private static void rellenarArray(){
        int continuar=0;
        do{
            double valor=Double.parseDouble(JOptionPane.showInputDialog("Introduce un valor"));
            lista.add(valor);
            continuar=JOptionPane.showConfirmDialog(null, "¿Quieres introducir mas valores en el array?");
        }while(continuar==0);
    }
    
    private static int desplazarMenu() throws Exception{
        int menu=Integer.parseInt(JOptionPane.showInputDialog("Elige una de las opciones mediante el numero" + "\n"
                                                             +"1. Visualizar el valor máximo y mínimo" + "\n"
                                                             +"2. Solicitar un número y  buscarlo" + "\n"
                                                             +"3. Solicitar un número, buscarlo y borrarlo" + "\n" 
                                                             +"4. Convertir el arraylist en un array" + "\n" 
                                                             +"5. Mostrar los valores que contiene (si no esta vacio)" + "\n"
                                                             +"6. Insertar un nuevo elemento a la lista" + "\n"
                                                             +"7. Insertar un nuevo elemento en la posicion que indiques" + "\n"
                                                             +"8. Borrar un elemento de la posicion que indiques" + "\n"
                                                             +"9. Calcular la suma y media aritmética de los valores contenidos" + "\n"
                                                             +"10. Finalizar" + "\n"));
        return menu;
    }
        
    private static void visualizarMaxMin() throws Exception {
        double maximo=lista.get(0);
        double minimo=lista.get(0);
        for(int x=0; x<lista.size(); x++){
            if(lista.get(x)>maximo){
                maximo=lista.get(x);
            }
            if(lista.get(x)<minimo){
                minimo=lista.get(x);
            }
        }
        JOptionPane.showMessageDialog(null, "El numero maximo introducido es " + maximo + " y el minimo: " + minimo);
        /*OTRA OPCION:
            Collections.max(lista);
            Collections.min(lista);
        */
    }
    
    private static void solicitarNúmero() throws Exception{
        double num=Double.parseDouble(JOptionPane.showInputDialog("¿Que numero quieres buscar?"));
        String mensaje = "";
        boolean encontrado=false;
        for(int x=0;x<lista.size();x++){
            if(lista.get(x)==num && encontrado==false){
                mensaje=("Numero encontrado en la posicion " +x);
                encontrado=true;
            }
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null, mensaje);
        }else{
            JOptionPane.showMessageDialog(null, "Numero no encontrado");
    }
    }

    private static void solicitarNúmeroyBorrado() throws Exception {
        double num=Double.parseDouble(JOptionPane.showInputDialog("¿Que numero quieres borrar?"));
        int posicion=lista.indexOf(num);
        boolean encontrado=false;
        for(int x=0;x<lista.size();x++){
            if(lista.get(x)==num && encontrado==false){
                lista.remove(posicion);
                encontrado=true;
        }
        }
        if(encontrado==false){
            JOptionPane.showMessageDialog(null, "Numero no encontrado");
    }
        
    }

    private static void convertirArraylistEnArray() throws Exception{
        Object[] array = lista.toArray();
        JOptionPane.showMessageDialog(null,Arrays.toString(array));
    }

    private static void mostrarTamano() throws Exception{
        JOptionPane.showMessageDialog(null,lista.size());
    }

    private static void insertarElementoFinal() throws Exception{
        double Final=Double.parseDouble(JOptionPane.showInputDialog("Introduce un nuevo valor"));
        lista.add(Final);
    }

    private static void insertarElementoPosicion() throws Exception{
        int pos=Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion en la que quieres introducir el siguiente valor"));
        double elem=Double.parseDouble(JOptionPane.showInputDialog("Introduce un nuevo valor"));
        lista.add(pos, elem);
    }

    private static void borrarElementoPosicion() throws Exception{
        int pos=Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion en la que quieres introducir el siguiente valor"));
        lista.remove(pos);
    }

    private static void calcularSumayMediaAritmetica()throws Exception{
       double sumaTotal=0;
       double media;
       for(double elemento:lista){
           sumaTotal= sumaTotal + elemento;  
       }
       media=(sumaTotal/lista.size());
       JOptionPane.showMessageDialog(null, "La suma total de los valores es "+ sumaTotal + "\n"
                                    +"La media aritmetica de la lista es "+media);
    }
    
    private static void Exit()throws Exception{
        JOptionPane.showMessageDialog(null,"Gracias por usar la app");
        System.exit(0);
    }


}


