/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innova_producciones;

/**
 *
 * @author jose luis
 */
public class Cliente {
    int ID;
    int Telefono;
    String correo;
    String nombre_contact;
    String nombre_empresa;

    public Cliente(int ID, int Telefono, String correo, String nombre_contact, String nombre_empresa) {
        this.ID = ID;
        this.Telefono = Telefono;
        this.correo = correo;
        this.nombre_contact = nombre_contact;
        this.nombre_empresa = nombre_empresa;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre_contact() {
        return nombre_contact;
    }

    public void setNombre_contact(String nombre_contact) {
        this.nombre_contact = nombre_contact;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }
    
    
}
