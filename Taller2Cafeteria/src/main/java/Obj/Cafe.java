
package Obj;

import java.util.ArrayList;
public class Cafe {
      private String gramos;
    private String tamaño;
    private int mililitors;
    private ArrayList<Cafe> cafes;

    public Cafe(String gramos, String tamaño, int mililitors, ArrayList<Cafe> cafes) {
        this.gramos = gramos;
        this.tamaño = tamaño;
        this.mililitors = mililitors;
        this.cafes = cafes;
    }

    public String getGramos() {
        return gramos;
    }

    public void setGramos(String gramos) {
        this.gramos = gramos;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getMililitors() {
        return mililitors;
    }

    public void setMililitors(int mililitors) {
        this.mililitors = mililitors;
    }

    public ArrayList<Cafe> getCafes() {
        return cafes;
    }

    public void setCafes(ArrayList<Cafe> cafes) {
        this.cafes = cafes;
    }
      public ArrayList<Cafe> getArraycarrera() {
        return cafes;
    }

    public void setArraycarrera(ArrayList<Cafe> arraycarrera) {
        this.cafes = cafes;
    }

    public void agregarEstudiante(Cafe cafe){
       cafes.add(cafe);
    }

    public void eliminarEstudiante(Cafe cafe){
        cafes.remove(cafe);
    }

}
