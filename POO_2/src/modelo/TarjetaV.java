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
public class TarjetaV {
    private String notargeta,usov;
    
    public TarjetaV (){}
    public TarjetaV(String notargeta, String uso) {
        this.notargeta = notargeta;
        this.usov = usov;
    }

    public String getUsov() {
        return usov;
    }

    public void setUsov(String uso) {
        this.usov = usov;
    }

    public String getNotargeta() {
        return notargeta;
    }

    public void setNotargeta(String notargeta) {
        this.notargeta = notargeta;
    }
    
    public void agregar (){}
    public void modificar (){}
    public void eliminar (){}
    
}
