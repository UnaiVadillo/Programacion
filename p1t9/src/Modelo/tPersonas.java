/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;


public class tPersonas {
    
    private Connection bd;

    public tPersonas(Connection con) {
        this.bd = con;
    }
       
     public void insertar(Persona p) throws Exception
    {
        
        String plantilla = "INSERT INTO tpersonas VALUES (?,?,?,?);";
        PreparedStatement ps = bd.prepareStatement(plantilla);
        ps.setString(1, p.getNombre());
        ps.setString(2,p.getEdad());
        ps.setString(3,p.getProfesion());
        ps.setString(4,p.getTelefono());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1){
            throw new Exception("El número de filas actualizadas no es uno");
        }
    }
     
    
    
}

