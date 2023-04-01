/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ayu2;

import java.util.ArrayList;

public class Proyecto {
    private String nombreP;
    private String descripcion;
    private ArrayList<Empleado>empleados;

    public Proyecto(String nombreP, String descripcion) {
        this.nombreP = nombreP;
        this.descripcion = descripcion;
        this.empleados = new ArrayList<Empleado>();
    }
    
    public void agregarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }
    
    public String getNombreP() {
        return nombreP;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
}
