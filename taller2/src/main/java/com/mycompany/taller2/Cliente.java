
package com.mycompany.taller2;


public abstract class Cliente {
    private String nombre;
    private String apellido;
    private String correo;
    private String num;
    private String ecivil;
    private String ciudad;

    public Cliente(String nombre, String apellido, String correo, String num, String ecivil, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.num = num;
        this.ecivil = ecivil;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getEcivil() {
        return ecivil;
    }

    public void setEcivil(String ecivil) {
        this.ecivil = ecivil;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", num=" + num + ", ecivil=" + ecivil + ", ciudad=" + ciudad + '}';
    }
    
    
    
}
