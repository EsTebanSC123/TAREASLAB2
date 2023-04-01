
package com.mycompany.ayu2;
import java.util.ArrayList;

public class Diseñador extends Empleado {
    ArrayList<String>herramientas;
    
    public Diseñador(String nombre, double salario, ArrayList<String>Herramientas){
    super(nombre, salario, "Diseñador");
    this.herramientas = herramientas;
    }

    public ArrayList<String> getHerramientas() {
        return herramientas;
    }

    public void setHerramientas(ArrayList<String> Herramientas) {
        this.herramientas = herramientas;
    }
}

