
package Main;

/**
 *
 * @author Basti
 */
public class Auto {
    private float valor;
    private int cantidad;
    private float total;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getTotal() {
        return total;
    }

    public void calculoRenta(){
    total = valor*cantidad;
    }
    
}
