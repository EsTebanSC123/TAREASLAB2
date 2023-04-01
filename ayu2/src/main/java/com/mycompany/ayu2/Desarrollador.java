package com.mycompany.ayu2;

import java.util.ArrayList;

public class Desarrollador extends Empleado{
    ArrayList<String>lenguajes;
  public Desarrollador(String nombre , double salario, ArrayList<String>lenguajes){
       super(nombre,salario,"Desarrollador");
  this.lenguajes=lenguajes;
}
  public ArrayList<String>getLenguajes(){
      return lenguajes;
  }
  public void setLenguajes(ArrayList<String>lenguajes){
      this.lenguajes=lenguajes;
  }
  }


