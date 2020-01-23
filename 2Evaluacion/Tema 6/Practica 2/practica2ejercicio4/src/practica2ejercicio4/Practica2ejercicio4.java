/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2ejercicio4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import misClases.*;

/**
 *
 * @author 1GDAW11
 */
public class Practica2ejercicio4 {
    private static ArrayList<Pasajero> pasajeros;
    public static void main(String[] args) throws ParseException {
        
        Vuelo v1= new Vuelo();
        v1.setHoraLlegada("8");
        v1.setHoraSalida("24");
        v1.setLugarDestino("Paris");
        v1.setLugarOrigen("Madrid");
        v1.setNumVuelo(1);
        v1.setTipoVuelo("Express");
        
        SimpleDateFormat sdf= new SimpleDateFormat();
        String fechaSalida ="15-01-2020";
        Date date = sdf.parse(fechaSalida);
        v1.setFechaSalida(date);
        
        String fechaLlegada="20-01-2020";
        date = sdf.parse(fechaLlegada);
        v1.setFechaRegresa(date);
                
        
        Avion a1= new Avion();
        a1.setAerolinea("Vueling");
        a1.setCodAvion("3");
        a1.setCompartimentos("80");
        a1.setNumAsientos(100);
        //Relaciones
        v1.setAvion(a1);
        a1.setVuelos(v1);
        
        Piloto p1=new Piloto();
        p1.setNombre("Pepe");
        p1.setApellido("Garcia");
        p1.setCodPiloto("2");
        p1.setNumLicencia(5785);
        
        v1.setPiloto(p1);
        ArrayList<Vuelo> vuelos = p1.getVuelos();
        vuelos.add(v1);
        p1.setVuelos(vuelos);
        
        ArrayList<Asiento> lista= new ArrayList();
        Asiento as1 = new Asiento();
        as1.setCompartimento("8");
        as1.setEstado(true);
        as1.setNumAsiento(22);
        
        as1.setVuelo(v1);
        lista.add(as1);
        
        v1.setAsientos(lista);
        
        Pasajero pa1=new Pasajero();
        pa1.setNombre("Marcos");
        pa1.setApellido("Gorgal");
        pa1.setCedula("1234456");
        pa1.setEdad(25);
        pa1.setSexo("Hombre");
        
        v1.setPasajeros(pasajeros);
        pa1.setVuelos(v1);
        
        Ciudad c1= new Ciudad();
        c1.setCodCiudad("87");
        c1.setNombre("Madrid");
        c1.setVuelos(v1);
        v1.setCiudad(c1);
      
        
        

        
        
        
        
        
    }
    
}
