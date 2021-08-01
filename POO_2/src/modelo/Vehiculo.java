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
public class Vehiculo extends TarjetaV{
    private String placa,chasis,serie,motor,cilindros,marca,modelo,linea,asientos;

    public Vehiculo(){}
    public Vehiculo(String placa, String chasis, String serie, String motor, String cilindros, String marca, String modelo, String linea, String asientos, String notargeta, String uso) {
        super(notargeta, uso);
        this.placa = placa;
        this.chasis = chasis;
        this.serie = serie;
        this.motor = motor;
        this.cilindros = cilindros;
        this.marca = marca;
        this.modelo = modelo;
        this.linea = linea;
        this.asientos = asientos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCilindros() {
        return cilindros;
    }

    public void setCilindros(String cilindros) {
        this.cilindros = cilindros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }
    
    
    @Override
    public void agregar (){
    System.out.println("   [FORMULARIO VEHICULO]   ");
    System.out.println("No. Targeta: " + this.getNotargeta());
    System.out.println("Uso: " + this.getUsov());
    System.out.println("Placa: " + getPlaca());
    System.out.println("Chasis: " + getChasis());
    System.out.println("Serie: " + getSerie());
    System.out.println("Motor: " + this.getMotor());
    System.out.println("Cilindros: " + this.getCilindros());
    System.out.println("Marca: " + this.getMarca());
    System.out.println("Modelo: " + this.getModelo());
    System.out.println("Linea: " + this.getLinea());
    System.out.println("Asientos: " + this.getAsientos());
    System.out.println("_____________________________________________________");
    }
    
    @Override
    public void modificar (){
    System.out.println("   [FORMULARIO VEHICULO]   ");
    System.out.println("Metodo Modificar");
    }
    
    @Override
    public void eliminar (){
    System.out.println("   [FORMULARIO VEHICULO]   ");
    System.out.println("Metodo Eliminar");
    }
    
}
