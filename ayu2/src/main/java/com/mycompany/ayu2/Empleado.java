
package com.mycompany.ayu2;


public class Empleado {
    
   private String nombre;
   private Double slario;
   private String cargo;

    public Empleado(String nombre, Double slario, String cargo) {
        this.nombre = nombre;
        this.slario = slario;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSlario() {
        return slario;
    }

    public void setSlario(Double slario) {
        this.slario = slario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
   
    
}
