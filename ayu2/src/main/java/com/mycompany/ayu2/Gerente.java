
package com.mycompany.ayu2;


import java.util.ArrayList;
public class Gerente extends Empleado{
    ArrayList<Proyecto>Proyecto1;
    
    public Gerente(String nombre, double salario, ArrayList<String>Proyecto){
    super(nombre, salario, "Gerente");
    this.Proyecto1 = new ArrayList<Proyecto>();
    }

 public void agregarProy(Proyecto proyecto){
     this.Proyecto1.add(proyecto);
 }
}