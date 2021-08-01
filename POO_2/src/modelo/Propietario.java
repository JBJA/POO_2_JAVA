/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Juárez Arevalo
 */
public class Propietario extends Persona{
    private String nit,cui;

    public Propietario(){}
    public Propietario(String nit, String cui, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.nit = nit;
        this.cui = cui;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }
    
    @Override
    public void agregar (){
    System.out.println("   [FORMULARIO PROPIETARIO]   ");
    System.out.println("Nit: " + getNit());
    System.out.println("Cui: " + this.getCui());
    System.out.println("Nombres: " + getNombres());
    System.out.println("Apellidos: " + getApellidos());
    System.out.println("Direccion: " + getDireccion());
    System.out.println("Telefono: " + this.getTelefono());
    System.out.println("Fecha Nacimiento: " + this.getFecha_nacimiento());
    System.out.println("_____________________________________________________");
    }
    
    @Override
    public void modificar (){
    System.out.println("   [FORMULARIO PROPIETARIO]   ");
    System.out.println("Metodo Modificar");
    }
    
    @Override
    public void eliminar (){
    System.out.println("   [FORMULARIO PROPIETARIO]   ");
    System.out.println("Metodo Eliminar");
    }
    
}
