/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2ejercicio3;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import misClases.*;

/**
 *
 * @author 1GDAW11
 */
public class Practica2ejercicio3 {
    private static ArrayList<Cliente> clientes=new ArrayList<Cliente>();
    private static ArrayList<Empleado> empleados=new ArrayList<Empleado>();
    private static ArrayList<Directivo> directivos=new ArrayList<Directivo>();
    private static ArrayList<Empresa> empresas=new ArrayList<Empresa>();
    
    public static void main(String[] args) {
        
        //CLIENTES
        Cliente c1 = new Cliente();
        c1.setEdad("21");
        c1.setNombre("Pepe");
        c1.setTelefono_de_contacto("699898766");
        clientes.add(c1);
        Cliente c2= new Cliente("789898898", "Martin", "34");
        clientes.add(c2);
        Cliente c3= new Cliente("790508098", "Jose", "23");
        clientes.add(c3);
        
        //EMPLEADOS
        Empleado e1=new Empleado();
        e1.setNombre("Maria");
        e1.setEdad("30");
        e1.setSueldo_bruto("3000");
        Empleado e2= new Empleado("2500","Juan","43");
        Empleado e3= new Empleado("2800","Aitor","22");
        Empleado e4= new Empleado("2550","Marcos","40");
        Empleado e5= new Empleado("3540","Imanol","37");
        Empleado e6= new Empleado("3800","Mikel","54");
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);
        empleados.add(e5);
        empleados.add(e6);
        
        //DIRECTIVOS
        ArrayList<Empleado> subordinados= new ArrayList<Empleado>(); 
        Directivo d1= new Directivo();
        d1.setCategoria("Categoria 1");
        d1.setSueldo_bruto("4530");
        d1.setNombre("Javier");
        d1.setEdad("26");
        subordinados.add(empleados.get(0));
        d1.setSubordinados(subordinados);
        
        Directivo d2= new Directivo("Categoria 2","4300", "Eneko", "28");
        subordinados= new ArrayList();
        subordinados.add(empleados.get(1));
        subordinados.add(empleados.get(2));
        subordinados.add(empleados.get(3));
        d2.setSubordinados(subordinados);
        
        Directivo d3=new Directivo("Categoria 3","4500","Fernando", "32");
        subordinados= new ArrayList();
        directivos.add(d1);
        directivos.add(d2);
        directivos.add(d3);
        subordinados.add(empleados.get(3));
        subordinados.add(empleados.get(4));
        subordinados.add(empleados.get(5));
        d3.setSubordinados(subordinados);
        
        //EMPRESAS
        Empresa em1 = new Empresa();
        em1.setNombre("Apple Inc.");
        ArrayList emple=new ArrayList();
        em1.setClientes(clientes);
        emple.add(empleados.get(0));
        emple.add(empleados.get(1));
        emple.add(empleados.get(2));
        emple.add(directivos.get(0));
        emple.add(directivos.get(1));
        em1.setEmpleados(emple);
        
        Empresa em2 = new Empresa();
        em1.setNombre("Windows");
        emple=new ArrayList();
        ArrayList clie= new ArrayList();
        clie.add(clientes.get(0));
        clie.add(clientes.get(1));
        em1.setClientes(clie);
        emple.add(empleados.get(3));
        emple.add(empleados.get(4));
        emple.add(empleados.get(5));
        emple.add(directivos.get(2));
        em1.setEmpleados(emple);
        
        //Nombre del directivo con mas subordinados
        int nsubmax=-2;
        String respuesta="";
        for(int x=0;x<directivos.size();x++){
            if(directivos.get(x).getSubordinados().size()==nsubmax){
                respuesta= respuesta + "\n" + "El directivo con mas subordinados es " + directivos.get(x).getNombre()+ " con " + directivos.get(x).getSubordinados().size() + " subordinados";
            }
            if(directivos.get(x).getSubordinados().size()>nsubmax){
                nsubmax=directivos.get(x).getSubordinados().size();
                respuesta="El directivo con mas subordinados es " + directivos.get(x).getNombre()+ " con " + directivos.get(x).getSubordinados().size() + " subordinados";
            }
            
        }
        JOptionPane.showMessageDialog(null, respuesta);
    }
    
}
