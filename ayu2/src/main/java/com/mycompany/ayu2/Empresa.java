
package com.mycompany.ayu2;

import java.util.ArrayList;

public class Empresa {
    public static void main(String[] args) {
        
    }
    ArrayList<Empleado>empleados;
    ArrayList<Proyecto>proyectos;
    
    public Empresa(){
    this.empleados = new ArrayList<Empleado>();
    this.proyectos = new ArrayList<Proyecto>();
    }
    
    public void agregarEmpleado(Empleado empleado){
    this.empleados.add(empleado);
    }
    
    public void agregarProyecto(Proyecto proyecto){
    this.proyectos.add(proyecto);
    }
    public void asignar(Empleado empleado, Proyecto proyecto){
    proyecto.agregarEmpleado(empleado);
    }   
}
