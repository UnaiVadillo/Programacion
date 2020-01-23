/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misClases;
/**
 *
 * @author 1GDAW11
 */
public class Cliente extends Persona {
    private String telefono_de_contacto;

    public Cliente() {
    }

    public Cliente(String telefono_de_contacto, String nombre, String edad) {
        super(nombre, edad);
        this.telefono_de_contacto = telefono_de_contacto;
    }
    
    public String getTelefono_de_contacto() {
        return telefono_de_contacto;
    }

    public void setTelefono_de_contacto(String telefono_de_contacto) {
        this.telefono_de_contacto = telefono_de_contacto;
    }
    @Override
    public String mostrar(){
        return "Cliente{" + "Nombre= " + this.getNombre() + ", edad= " + this.getEdad() + ", telefono de contacto="+telefono_de_contacto +'}';
    }
}
