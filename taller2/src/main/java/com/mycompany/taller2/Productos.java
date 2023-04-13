
package com.mycompany.taller2;
import java.util.ArrayList;
public abstract class Productos {
    private String marca;
    private String ram;
    private String almacenamiento;
    private String proce;
    private String año;
    private int precio;
    private int stock;

    public Productos(String marca, String ram, String almacenamiento, String proce, String año, int precio, int stock) {
        this.marca = marca;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.proce = proce;
        this.año = año;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Productos{" + "marca=" + marca + ", ram=" + ram + ", almacenamiento=" + almacenamiento + ", proce=" + proce + ", a\u00f1o=" + año + ", precio=" + precio + ", stock=" + stock + '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getProce() {
        return proce;
    }

    public void setProce(String proce) {
        this.proce = proce;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
   
}
