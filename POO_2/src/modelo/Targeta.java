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
public class Targeta extends Persona{
        private String no_targeta,uso;

    public Targeta(){}
    public Targeta(String no_targeta, String uso, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.no_targeta = no_targeta;
        this.uso = uso;
    }

    public String getNo_targeta() {
        return no_targeta;
    }

    public void setNo_targeta(String no_targeta) {
        this.no_targeta = no_targeta;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }
    
    @Override
    public void agregar (){
    System.out.println("     [FORMULARIO TARJETA]     ");
    System.out.println("No. Targeta: " + this.getNo_targeta());
    System.out.println("Uso: " + this.getUso());
    System.out.println("Nombres: " + getNombres());
    System.out.println("Apellidos: " + getApellidos());
    System.out.println("Direccion: " + getDireccion());
    System.out.println("Telefono: " + this.getTelefono());
    System.out.println("Fecha Nacimiento: " + this.getFecha_nacimiento());
    System.out.println("_____________________________________________________");
    }
    
    @Override
    public void modificar (){
    System.out.println("     [FORMULARIO TARJETA]     ");
    System.out.println("Metodo Modificar");
    }
    
    @Override
    public void eliminar (){
    System.out.println("     [FORMULARIO TARJETA]     ");
    System.out.println("Metodo Eliminar");
    }

}
